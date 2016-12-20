import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.parse.ANTLRParser.sync_return;
import org.antlr.v4.parse.ANTLRParser.throwsSpec_return;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.w3c.dom.ls.LSInput;







public class RunMain {

	VariableIn ls;

	public RunMain(VariableIn ls) {
		// TODO Auto-generated constructor stub
		this.ls = ls;
	}

	public void run(ParseTree tree) throws Exception {
		try {
			for (int i = 1; i < tree.getChildCount()-1; i++)
				try {
					logicalrunner(tree.getChild(i));
				} catch (Exception e) {
					System.out.println("Eroor:"+e.getMessage());
					throw e;
				}
		} catch (Exception e) {
			throw new Exception("on main error");

		}

	}

	public void logicalrunner(ParseTree tree) throws Exception {

		if (tree.getChild(0).getText().equals("read"))
			read(tree.getChild(2));
		else if (tree.getChild(0).getText().equals("write"))
				{
				if (tree.getChild(2).getText().equals("\"")) 
						write(tree.getChild(3), 0);
				else 
						write(tree.getChild(2), 1);	
				}		
		else if (tree.getChild(0).getText().equals("writeln"))
				System.out.println();
		else if(tree.getChild(0).getText().equals("get"))
				{
			try{
				if(ls.getVar(tree.getChild(5).getText())!= null)
					{
					if(valeuRetrun(tree.getChild(2)))
					ls.getVar(tree.getChild(5).getText()).value.set(0, "true");
					else
						ls.getVar(tree.getChild(5).getText()).value.set(0, "false");}
			}catch(Exception e){
				System.out.println(e.getMessage());
			}
				
				}
		else if (tree.getChild(0).getText().equals("push"))
			verem(tree, 0);
		else if (tree.getChild(0).getText().equals("pop"))
			verem(tree, 1);
		else if (tree.getChild(0).getText().equals("method"))
			{
			try {gloret = ls.getVar(tree.getChild(6).getText()); } catch(Exception e){}
			runMethod(tree.getChild(1));
			}
		else if (tree.getChild(0).getText().equals("set"))
			ls.SetValue(tree.getChild(5).getText(), tree.getChild(2).getChild(0).getText());
		else if(tree.getChild(0).getText().equals("return"))
			returnVar(tree)
			;
		else if(tree.getChild(0).getText().equals("for"))
			forObject(tree);
		else if (tree.getChild(0).getText().equals("truthtable"))
			igazsagtabla(tree,0);
		else if(tree.getChild(0).getText().equals("isTautology"))
			{
			igazsagtabla(tree, 1);
			if(isTautology)
				ls.SetValue(tree.getChild(5).getText(),"true");
			else
				ls.SetValue(tree.getChild(5).getText(),"false");
			}
		else if(tree.getChild(0).getText().equals("isEllentmondas"))
			{
			igazsagtabla(tree, 1);
				if(isNottrue)
					ls.SetValue(tree.getChild(5).getText(),"true");
				else
					ls.SetValue(tree.getChild(5).getText(),"false");
			}
		else if(tree.getChild(0).getText().equals("isKielegitheto"))
			{
			igazsagtabla(tree, 1);
			if(isgetTrue)
				ls.SetValue(tree.getChild(5).getText(),"true");
			else
				ls.SetValue(tree.getChild(5).getText(),"false");
			}
		else if(tree.getChild(0).getText().equals("if"))
			ifReturn(tree);
		else throw new Exception("FORMAT ERROR");

	}

	public void read(ParseTree tree) throws Exception {

		String str=null;
		try {

			BufferedReader read = new BufferedReader(new InputStreamReader(
					System.in));
			str = read.readLine();
			
			ls.SetValue(tree.getText(), str);
		} catch (Exception e) {
			throw new Exception("missmatch type or no declare"+" declare found: "+tree.getText()+" settype and value: "+str);
		}
		if (ls.getVar(tree.getText()) == null)
			throw new Exception("not declared ");
		else
			System.out.println("SetVariableNewrecord:"
					+ ls.getVar(tree.getText()).toString());

	}

	public void write(ParseTree tree, int type) throws Exception{
		if (type == 0){
			String str = tree.getText();	
			System.out.print(str);
			}
		if (type == 1)
			{if(ls.getVar(tree.getText()) == null) throw new Exception("Non declared variable");
			System.out.print(ls.getVar(tree.getText()));}
	}



	public boolean valeuRetrun(ParseTree tree) throws Exception{
		if(ls.getVar(tree.getText()).type==3)
			return ls.getVar(tree.getText()).value.equals("true");
		else if(ls.getVar(tree.getText()).type==2)
			throw new Exception("Not logical formula");
		else if ((ls.getVar(tree.getText()).type==1))
			{
			ANTLRInputStream input = new ANTLRInputStream((String)ls.getVar(tree.getText()).value.get(0));
			RDPLexer lexer = new RDPLexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			RDPParser parser = new RDPParser(tokens);
			ParseTree tr = parser.logicalinput();
			return value(tr.getChild(0));
			}
		
		
		
		return false;
	}
	
	public boolean value(ParseTree root ) throws Exception{

		
		 try{
			 try{
			 	
				
			 
		if (root.getChild(2).getText().equals("|"))
			return value(root.getChild(1)) || value(root.getChild(3)); 

		if (root.getChild(2).getText().equals("&"))
			return value(root.getChild(1)) && value(root.getChild(3));

		if (root.getChild(2).getText().equals(">"))
			{
			
			return false==value(root.getChild(1)) || true==value(root.getChild(3));}
			 }
			 catch(Exception e){}
		if (root.getChild(0).getText().equals("-")){
			
			return !ls.getVar(root.getChild(1).getText()).value.get(0).equals("true") ;}
			
		 if (ls.getVar(root.getChild(0).getText()) != null)
				return ls.getVar(root.getChild(0).getText()).value.get(0).equals("true");
		 }
		 catch(Exception e) {
		 	throw new Exception("VALUEMETHOD ERROR");}
			
		throw new Exception("NON DECLERATED VARIABLE");


	}
	
	public void verem(ParseTree tree , int type) throws Exception{
		if(type==0)/*push*/
		{
			ls.SetValue(tree.getChild(4).getText(), ls.getVar(tree.getChild(2).getText()));
			
		}
		else/*pop*/
			{
			VariableIn.Variable  var = (VariableIn.Variable)ls.getVar(tree.getChild(2).getText()).value.get(ls.getVar(tree.getChild(2).getText()).value.size()-1);
			String st =(String) var.value.get(0);
			System.out.println("\nPop:"+st);
			int i =ls.ls.indexOf(ls.getVar(tree.getChild(2).getText()));
			ls.ls.get(i).value.remove(ls.ls.get(i).value.size()-1);
			if(tree.getChild(5)!= null)
				ls.SetValue(tree.getChild(5).getText(), st);;
			}
		
	}
	Object gloret= null;
	public void runMethod(ParseTree tree)throws Exception{
		String s = tree.getText();
		tree=tree.getParent().getParent().getParent();
		for(int i = 1 ; i<tree.getChildCount()-1;i++)
			if(tree.getChild(i).getChild(1).getText().equals(s))
				{tree=tree.getChild(i);
				break ;}
		//run(tree.getChild(1));
		runerMethod(tree);
	}
	
	public void runerMethod(ParseTree tree)throws Exception{
		ArrayList<VariableIn.Variable> save = new ArrayList<VariableIn.Variable>();
		for(VariableIn.Variable v : ls.ls)
			save.add(v);
		ls.ls.removeAll(ls.ls);
		
		
		@SuppressWarnings("unchecked")
		ArrayList<VariableIn.Variable> global = ls.variableList(tree);
		ls.variableList(tree.getChild(5));
		int i = ls.ls.size();
		ls.ls.addAll(global);
		
		run(tree.getChild(tree.getChildCount()-2));
		global=ls.ls ;
		ls.ls = save;
		for( ; i<global.size();i++)
			ls.ls.add(global.get(i));
		VariableIn.Variable var = null;
		try{
		var = (VariableIn.Variable)gloret;
		
		if(var != null && var.value != null){
			try{
			ls.SetValue(var.name, var.value);}/*bugfixedre vár :D*/
			catch(Exception e){}
			gloret = null;
		}
		}catch (Exception e) {
			throw new Exception("VarError");
			
		}
		
	}
	public Object returnVar(ParseTree tree)throws Exception{
		try{
			VariableIn.Variable var = (VariableIn.Variable)gloret;
			if(var != null){
			var.value = ls.getVar(tree.getChild(2).getText()).value;
			gloret = var;}
		return ls.getVar(tree.getChild(2).getText());
		}catch(Exception e)
		{
			throw new Exception("NullPointerException_on_Return");
		}
	}
	public void forObject(ParseTree tree)throws Exception{
		VariableIn.Variable var =ls.CreatVariable(0, tree.getChild(2).getText(), null);
		ls.ls.add(var);
		for(int i = 0 ; i< ls.getVar(tree.getChild(4).getText()).value.size();i++){
			ls.ls.get(ls.ls.size()-1).value.set(0,ls.getVar(tree.getChild(4).getText()).value.get(i));
			run(tree.getChild(tree.getChildCount()-2));
		}
		ls.ls.remove(ls.ls.size()-1);
		
	}

ArrayList<String> list = new ArrayList<String>();
ArrayList<String> listValue = new ArrayList<String>();
boolean isTautology = true , isNottrue = true , isgetTrue = false;
	


	public void igazsagtabla(ParseTree tree , int type) throws Exception{
		
		VariableIn.Variable var = ls.getVar(tree.getChild(2).getText());
		isTautology = true ;
		isNottrue = true ;
		isgetTrue = false;
		ANTLRInputStream input = new ANTLRInputStream((String)var.value.get(0));
		RDPLexer lexer = new RDPLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		RDPParser parser = new RDPParser(tokens);
		
		ParseTree tr = parser.logicalinput();
		
		for (Token token : tokens.getTokens()) {
			if (token.getType() == 42 )
			{list.add(token.getText());
			listValue.add((String)ls.getVar(list.get(list.size()-1)).value.get(0));}
		}
		
		
		int j=list.size() ;
		
	
		int k = 2;
		for(int i = 0 ; i<j-1;i++)
			k*=2;
		
		boolean[][] b = new boolean[j][k] ;
		boolean set = true;
		int felezo = k , lepteto= 0 ;;
		for(int i = 0 ; i< j ; i++){
			felezo/=2;
			lepteto=0;
			for(int ii = 0 ; ii <k ; ii++)
			{
				if(lepteto==felezo)
					{set=!set;
					lepteto=0;}
				lepteto++;
				b[i][ii]=set;
			}
		}
		
		
		for(int i = 0 ; i<k ; i++)
			{
			for(int ii = 0 ; ii<j; ii++ )
				{
				if(b[ii][i])
				ls.SetValue(list.get(ii), "true");
				else
					ls.SetValue(list.get(ii), "false");
				if(type==0)
				System.out.print(" Variable :" + ls.getVar(list.get(ii)));
				}
			if(type==0)
			System.out.println(" Form:"+tr.getText()+" Return:"+value(tr.getChild(0))); 
			if(value(tr.getChild(0)))
				{isNottrue=false;
				isgetTrue = true;
				}
			else
				isTautology=false;
			
			}
		for (int i = 0 ; i < list.size();i++)
		{
			ls.SetValue(list.get(i), listValue.get(i));
		}
		list.removeAll(list);
		listValue.removeAll(listValue);
		//System.out.println("isTautology:" + isTautology + " Kielégíthetö:"+ isgetTrue + " Elentmodnás:"+isNottrue);
	}
	public void ifReturn(ParseTree tree)throws Exception{
		try{
		if(value(tree.getChild(2)))
				run(tree.getChild(5));
		else
			run(tree.getChild(7));
		}catch(Exception e)
		{
			if(value(tree.getChild(2).getChild(0)))
				run(tree.getChild(5));
		else
			run(tree.getChild(7));
		}
	}
}
