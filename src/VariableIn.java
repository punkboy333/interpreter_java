import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class VariableIn {

	public ParseTree GetVariable(ParseTree tree, String varname) {
		ParseTree t = null;

		for (int i = 0; i < tree.getChildCount(); i++) {
			try {

				if (tree.getChild(i).getChild(1).getText().equals(varname)) {
					System.out.println("Lol:"
							+ tree.getChild(i).getChild(1).getText());
					t = tree.getChild(i).getChild(3);
					break;
				}
			} catch (Exception e) {
				;
			}
		}
		;

		System.out.println("Kiirok:" + tree.getChild(1).getChild(1).getText());
		return t;
	}

	public class Variable {
		int type;
		String name;
		ArrayList<Object> value = new ArrayList<Object>();

		public Variable(int type, String name, String value) {
			this.type = type;
			this.name = name;
			this.value.add(value);
		}

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return type + " " + name + " " + value;
		}

	}

	public Variable getVar(String name) {

		for (Variable variable : ls) {
			if (variable.name.equals(name))
				return variable;
		}
		return null;
	}

	public void SetValue(String name, Object value) throws Exception {
		int i = ls.indexOf(getVar(name));


		if (ls.get(i).type == 1) {
			{
				ANTLRInputStream input = new ANTLRInputStream((String)value);
				RDPLexer lexer = new RDPLexer(input);
				CommonTokenStream tokens = new CommonTokenStream(lexer);
				RDPParser parser = new RDPParser(tokens);
				ParseTree tree = parser.logicalinput();
				if (tree.getChildCount()<2)
				ls.get(i).value.set(0, value);
			else
				throw new Exception("Error value");}
		} else if (ls.get(i).type == 2) {
			if (ls.get(i).value.get(0) == null)
				ls.get(i).value.set(0, value);
			else
				ls.get(i).value.add(value);
		} else if (ls.get(i).type == 3
				&& (value.equals("true") || value.equals("false")))
			ls.get(i).value.set(0, value);
		else 
			throw new Exception("not valid record");
	}

	public ArrayList<Variable> ls;

	public ArrayList variableList(ParseTree tree) {
		ls = new ArrayList<Variable>();

		for (int i = 0; i < tree.getChildCount(); i++) {
			try {
				if (tree.getChild(i).getChild(0).getText().equals("from")) {
					try {
						
						;
						ls.add(new Variable(1, tree.getChild(i).getChild(1)
								.getText(), tree.getChild(i).getChild(3)
								.getText()));
					} catch (Exception e) {
						
						;
						ls.add(new Variable(1, tree.getChild(i).getChild(1)
								.getText(), null));

					}
				}
				if (tree.getChild(i).getChild(0).getText().equals("list")) {
					try {
						ls.add(new Variable(2, tree.getChild(i).getChild(1)
								.getText(), tree.getChild(i).getChild(2)
								.getText()));
					} catch (Exception e) {
						ls.add(new Variable(2, tree.getChild(i).getChild(1)
								.getText(), null));
					}
				}
				if (tree.getChild(i).getChild(0).getText().equals("VAR")) {
					try {
						ls.add(new Variable(3, tree.getChild(i).getChild(1)
								.getChild(0).getText(), tree.getChild(i)
								.getChild(1).getChild(2).getText()));
					} catch (Exception e) {
						ls.add(new Variable(3, tree.getChild(i).getChild(1)
								.getChild(0).getText(), null));
					}
				}
			} catch (Exception e) {
				
				;
			}
		}

		return ls;
	}

}
