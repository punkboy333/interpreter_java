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
import org.antlr.v4.runtime.tree.ParseTree;





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
			runMethod(tree.getChild(1));
		else if (tree.getChild(0).getText().equals("set"))
			ls.SetValue(tree.getChild(5).getText(), tree.getChild(2).getChild(0).getText());
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
			System.out.println("\n"+!root.getChild(1).getText().equals("true")+"\n");
			return !root.getChild(1).getText().equals("true") ;}
			
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
			if(tree.getChild(5)!= null)
				ls.SetValue(tree.getChild(5).getText(), st);;
			}
		
	}
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
		ArrayList<VariableIn.Variable> save = ls.ls;
		ls.ls.removeAll(ls.ls);
		
		
		@SuppressWarnings("unchecked")
		ArrayList<VariableIn.Variable> global = ls.variableList(tree);
		ls.variableList(tree.getChild(5));
		int i = ls.ls.size();
		ls.ls.addAll(global);
		
		run(tree.getChild(tree.getChildCount()-2));
		global = ls.ls;
		ls.ls = save;
		for( ; i<global.size();i++)
			ls.ls.add(global.get(i));
		
	}
	
}
