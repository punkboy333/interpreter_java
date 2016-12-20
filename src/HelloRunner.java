import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;



public class HelloRunner {
	public static void main(String[] args) {


		BufferedReader read = new BufferedReader(new InputStreamReader(
				System.in));
		String inputIO = null;
		String alin = "";
		System.out.println("irj be valamit:");
		while (true) {
			try {
				
				inputIO = read.readLine();
			} catch (Exception e) {
				System.out.println("Not read I/O");

			}
			if (inputIO.length() <= 1)
				break;
			inputIO += '\n';
			alin += inputIO;
		}
			ANTLRInputStream input = new ANTLRInputStream(alin);
			RDPLexer lexer = new RDPLexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			RDPParser parser = new RDPParser(tokens);

		VariableIn nvar = new VariableIn();
		
		ParseTree tree2 = parser.rdp();
		nvar.variableList(tree2.getChild(0));
		
		RunMain nrun = new RunMain(nvar);
		
		try{
			nrun.run(tree2.getChild(tree2.getChildCount()-1));
		}catch(Exception e){
			System.out.println("Exception: "+e.getMessage());
		}
		
		
		/* ANTLRInputStream input2 = new ANTLRInputStream(alin); 
		 RDPLexer lexer = new RDPLexer(input2);
		 CommonTokenStream tokens = new
		 CommonTokenStream(lexer); RDPParser parser = new RDPParser(tokens);
		  */
			parser.reset();
		  //parser.dumpDFA(); 
		  ParseTree tree = parser.rdp();
		  List<String>ruleNames = Arrays.asList(RDPParser.ruleNames);
		  TreeViewer view = new TreeViewer(ruleNames, tree);
		  
		  view.open();
		
		System.out.println("Exit succesful");

		
	}
}
