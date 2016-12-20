// Generated from RDP.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RDPParser}.
 */
public interface RDPListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link RDPParser#rdp}.
	 * @param ctx the parse tree
	 */
	void enterRdp(RDPParser.RdpContext ctx);
	/**
	 * Exit a parse tree produced by {@link RDPParser#rdp}.
	 * @param ctx the parse tree
	 */
	void exitRdp(RDPParser.RdpContext ctx);
	/**
	 * Enter a parse tree produced by {@link RDPParser#declare}.
	 * @param ctx the parse tree
	 */
	void enterDeclare(RDPParser.DeclareContext ctx);
	/**
	 * Exit a parse tree produced by {@link RDPParser#declare}.
	 * @param ctx the parse tree
	 */
	void exitDeclare(RDPParser.DeclareContext ctx);
	/**
	 * Enter a parse tree produced by {@link RDPParser#method}.
	 * @param ctx the parse tree
	 */
	void enterMethod(RDPParser.MethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link RDPParser#method}.
	 * @param ctx the parse tree
	 */
	void exitMethod(RDPParser.MethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link RDPParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(RDPParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link RDPParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(RDPParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link RDPParser#callmethod}.
	 * @param ctx the parse tree
	 */
	void enterCallmethod(RDPParser.CallmethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link RDPParser#callmethod}.
	 * @param ctx the parse tree
	 */
	void exitCallmethod(RDPParser.CallmethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link RDPParser#linebreak}.
	 * @param ctx the parse tree
	 */
	void enterLinebreak(RDPParser.LinebreakContext ctx);
	/**
	 * Exit a parse tree produced by {@link RDPParser#linebreak}.
	 * @param ctx the parse tree
	 */
	void exitLinebreak(RDPParser.LinebreakContext ctx);
	/**
	 * Enter a parse tree produced by {@link RDPParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(RDPParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link RDPParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(RDPParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link RDPParser#from}.
	 * @param ctx the parse tree
	 */
	void enterFrom(RDPParser.FromContext ctx);
	/**
	 * Exit a parse tree produced by {@link RDPParser#from}.
	 * @param ctx the parse tree
	 */
	void exitFrom(RDPParser.FromContext ctx);
	/**
	 * Enter a parse tree produced by {@link RDPParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(RDPParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link RDPParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(RDPParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link RDPParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(RDPParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link RDPParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(RDPParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link RDPParser#bincon}.
	 * @param ctx the parse tree
	 */
	void enterBincon(RDPParser.BinconContext ctx);
	/**
	 * Exit a parse tree produced by {@link RDPParser#bincon}.
	 * @param ctx the parse tree
	 */
	void exitBincon(RDPParser.BinconContext ctx);
	/**
	 * Enter a parse tree produced by {@link RDPParser#uncon}.
	 * @param ctx the parse tree
	 */
	void enterUncon(RDPParser.UnconContext ctx);
	/**
	 * Exit a parse tree produced by {@link RDPParser#uncon}.
	 * @param ctx the parse tree
	 */
	void exitUncon(RDPParser.UnconContext ctx);
	/**
	 * Enter a parse tree produced by {@link RDPParser#logicalinput}.
	 * @param ctx the parse tree
	 */
	void enterLogicalinput(RDPParser.LogicalinputContext ctx);
	/**
	 * Exit a parse tree produced by {@link RDPParser#logicalinput}.
	 * @param ctx the parse tree
	 */
	void exitLogicalinput(RDPParser.LogicalinputContext ctx);
	/**
	 * Enter a parse tree produced by {@link RDPParser#read}.
	 * @param ctx the parse tree
	 */
	void enterRead(RDPParser.ReadContext ctx);
	/**
	 * Exit a parse tree produced by {@link RDPParser#read}.
	 * @param ctx the parse tree
	 */
	void exitRead(RDPParser.ReadContext ctx);
	/**
	 * Enter a parse tree produced by {@link RDPParser#write}.
	 * @param ctx the parse tree
	 */
	void enterWrite(RDPParser.WriteContext ctx);
	/**
	 * Exit a parse tree produced by {@link RDPParser#write}.
	 * @param ctx the parse tree
	 */
	void exitWrite(RDPParser.WriteContext ctx);
	/**
	 * Enter a parse tree produced by {@link RDPParser#writeln}.
	 * @param ctx the parse tree
	 */
	void enterWriteln(RDPParser.WritelnContext ctx);
	/**
	 * Exit a parse tree produced by {@link RDPParser#writeln}.
	 * @param ctx the parse tree
	 */
	void exitWriteln(RDPParser.WritelnContext ctx);
	/**
	 * Enter a parse tree produced by {@link RDPParser#get}.
	 * @param ctx the parse tree
	 */
	void enterGet(RDPParser.GetContext ctx);
	/**
	 * Exit a parse tree produced by {@link RDPParser#get}.
	 * @param ctx the parse tree
	 */
	void exitGet(RDPParser.GetContext ctx);
	/**
	 * Enter a parse tree produced by {@link RDPParser#push}.
	 * @param ctx the parse tree
	 */
	void enterPush(RDPParser.PushContext ctx);
	/**
	 * Exit a parse tree produced by {@link RDPParser#push}.
	 * @param ctx the parse tree
	 */
	void exitPush(RDPParser.PushContext ctx);
	/**
	 * Enter a parse tree produced by {@link RDPParser#pop}.
	 * @param ctx the parse tree
	 */
	void enterPop(RDPParser.PopContext ctx);
	/**
	 * Exit a parse tree produced by {@link RDPParser#pop}.
	 * @param ctx the parse tree
	 */
	void exitPop(RDPParser.PopContext ctx);
	/**
	 * Enter a parse tree produced by {@link RDPParser#set}.
	 * @param ctx the parse tree
	 */
	void enterSet(RDPParser.SetContext ctx);
	/**
	 * Exit a parse tree produced by {@link RDPParser#set}.
	 * @param ctx the parse tree
	 */
	void exitSet(RDPParser.SetContext ctx);
	/**
	 * Enter a parse tree produced by {@link RDPParser#returne}.
	 * @param ctx the parse tree
	 */
	void enterReturne(RDPParser.ReturneContext ctx);
	/**
	 * Exit a parse tree produced by {@link RDPParser#returne}.
	 * @param ctx the parse tree
	 */
	void exitReturne(RDPParser.ReturneContext ctx);
	/**
	 * Enter a parse tree produced by {@link RDPParser#ife}.
	 * @param ctx the parse tree
	 */
	void enterIfe(RDPParser.IfeContext ctx);
	/**
	 * Exit a parse tree produced by {@link RDPParser#ife}.
	 * @param ctx the parse tree
	 */
	void exitIfe(RDPParser.IfeContext ctx);
	/**
	 * Enter a parse tree produced by {@link RDPParser#fore}.
	 * @param ctx the parse tree
	 */
	void enterFore(RDPParser.ForeContext ctx);
	/**
	 * Exit a parse tree produced by {@link RDPParser#fore}.
	 * @param ctx the parse tree
	 */
	void exitFore(RDPParser.ForeContext ctx);
	/**
	 * Enter a parse tree produced by {@link RDPParser#truetable}.
	 * @param ctx the parse tree
	 */
	void enterTruetable(RDPParser.TruetableContext ctx);
	/**
	 * Exit a parse tree produced by {@link RDPParser#truetable}.
	 * @param ctx the parse tree
	 */
	void exitTruetable(RDPParser.TruetableContext ctx);
}