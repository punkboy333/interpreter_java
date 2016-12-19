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
	 * Enter a parse tree produced by {@link RDPParser#world}.
	 * @param ctx the parse tree
	 */
	void enterWorld(RDPParser.WorldContext ctx);
	/**
	 * Exit a parse tree produced by {@link RDPParser#world}.
	 * @param ctx the parse tree
	 */
	void exitWorld(RDPParser.WorldContext ctx);
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
}