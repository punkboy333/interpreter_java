// Generated from RDP.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RDPParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, VAR=2, UNCON=3, LEFTBRAQUET=4, RIGHTTBRAQUET=5, BINCON=6, WS=7;
	public static final int
		RULE_rdp = 0, RULE_world = 1, RULE_var = 2, RULE_bincon = 3, RULE_uncon = 4;
	public static final String[] ruleNames = {
		"rdp", "world", "var", "bincon", "uncon"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'\n'", null, "'-'", "'['", "']'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "VAR", "UNCON", "LEFTBRAQUET", "RIGHTTBRAQUET", "BINCON", 
		"WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "RDP.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public RDPParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class RdpContext extends ParserRuleContext {
		public List<WorldContext> world() {
			return getRuleContexts(WorldContext.class);
		}
		public WorldContext world(int i) {
			return getRuleContext(WorldContext.class,i);
		}
		public RdpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rdp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RDPListener ) ((RDPListener)listener).enterRdp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RDPListener ) ((RDPListener)listener).exitRdp(this);
		}
	}

	public final RdpContext rdp() throws RecognitionException {
		RdpContext _localctx = new RdpContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_rdp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(13);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LEFTBRAQUET) {
				{
				{
				setState(10);
				world();
				}
				}
				setState(15);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WorldContext extends ParserRuleContext {
		public BinconContext bincon() {
			return getRuleContext(BinconContext.class,0);
		}
		public UnconContext uncon() {
			return getRuleContext(UnconContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public WorldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_world; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RDPListener ) ((RDPListener)listener).enterWorld(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RDPListener ) ((RDPListener)listener).exitWorld(this);
		}
	}

	public final WorldContext world() throws RecognitionException {
		WorldContext _localctx = new WorldContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_world);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(16);
				bincon();
				setState(17);
				match(T__0);
				}
				break;
			case 2:
				{
				setState(19);
				uncon();
				setState(20);
				match(T__0);
				}
				break;
			case 3:
				{
				setState(22);
				var();
				setState(23);
				match(T__0);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarContext extends ParserRuleContext {
		public TerminalNode LEFTBRAQUET() { return getToken(RDPParser.LEFTBRAQUET, 0); }
		public TerminalNode VAR() { return getToken(RDPParser.VAR, 0); }
		public TerminalNode RIGHTTBRAQUET() { return getToken(RDPParser.RIGHTTBRAQUET, 0); }
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RDPListener ) ((RDPListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RDPListener ) ((RDPListener)listener).exitVar(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			match(LEFTBRAQUET);
			setState(28);
			match(VAR);
			setState(29);
			match(RIGHTTBRAQUET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BinconContext extends ParserRuleContext {
		public TerminalNode LEFTBRAQUET() { return getToken(RDPParser.LEFTBRAQUET, 0); }
		public TerminalNode BINCON() { return getToken(RDPParser.BINCON, 0); }
		public TerminalNode RIGHTTBRAQUET() { return getToken(RDPParser.RIGHTTBRAQUET, 0); }
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public List<UnconContext> uncon() {
			return getRuleContexts(UnconContext.class);
		}
		public UnconContext uncon(int i) {
			return getRuleContext(UnconContext.class,i);
		}
		public List<BinconContext> bincon() {
			return getRuleContexts(BinconContext.class);
		}
		public BinconContext bincon(int i) {
			return getRuleContext(BinconContext.class,i);
		}
		public BinconContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bincon; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RDPListener ) ((RDPListener)listener).enterBincon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RDPListener ) ((RDPListener)listener).exitBincon(this);
		}
	}

	public final BinconContext bincon() throws RecognitionException {
		BinconContext _localctx = new BinconContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_bincon);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			match(LEFTBRAQUET);
			setState(32);
			match(BINCON);
			setState(36);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(33);
				var();
				}
				break;
			case 2:
				{
				setState(34);
				uncon();
				}
				break;
			case 3:
				{
				setState(35);
				bincon();
				}
				break;
			}
			setState(41);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(38);
				var();
				}
				break;
			case 2:
				{
				setState(39);
				uncon();
				}
				break;
			case 3:
				{
				setState(40);
				bincon();
				}
				break;
			}
			setState(43);
			match(RIGHTTBRAQUET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnconContext extends ParserRuleContext {
		public TerminalNode LEFTBRAQUET() { return getToken(RDPParser.LEFTBRAQUET, 0); }
		public TerminalNode UNCON() { return getToken(RDPParser.UNCON, 0); }
		public TerminalNode RIGHTTBRAQUET() { return getToken(RDPParser.RIGHTTBRAQUET, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public UnconContext uncon() {
			return getRuleContext(UnconContext.class,0);
		}
		public BinconContext bincon() {
			return getRuleContext(BinconContext.class,0);
		}
		public UnconContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uncon; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RDPListener ) ((RDPListener)listener).enterUncon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RDPListener ) ((RDPListener)listener).exitUncon(this);
		}
	}

	public final UnconContext uncon() throws RecognitionException {
		UnconContext _localctx = new UnconContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_uncon);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(LEFTBRAQUET);
			setState(46);
			match(UNCON);
			setState(50);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(47);
				var();
				}
				break;
			case 2:
				{
				setState(48);
				uncon();
				}
				break;
			case 3:
				{
				setState(49);
				bincon();
				}
				break;
			}
			setState(52);
			match(RIGHTTBRAQUET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\t9\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\7\2\16\n\2\f\2\16\2\21\13\2\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\5\3\34\n\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3"+
		"\5\5\5\'\n\5\3\5\3\5\3\5\5\5,\n\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\5\6\65\n"+
		"\6\3\6\3\6\3\6\2\2\7\2\4\6\b\n\2\2<\2\17\3\2\2\2\4\33\3\2\2\2\6\35\3\2"+
		"\2\2\b!\3\2\2\2\n/\3\2\2\2\f\16\5\4\3\2\r\f\3\2\2\2\16\21\3\2\2\2\17\r"+
		"\3\2\2\2\17\20\3\2\2\2\20\3\3\2\2\2\21\17\3\2\2\2\22\23\5\b\5\2\23\24"+
		"\7\3\2\2\24\34\3\2\2\2\25\26\5\n\6\2\26\27\7\3\2\2\27\34\3\2\2\2\30\31"+
		"\5\6\4\2\31\32\7\3\2\2\32\34\3\2\2\2\33\22\3\2\2\2\33\25\3\2\2\2\33\30"+
		"\3\2\2\2\34\5\3\2\2\2\35\36\7\6\2\2\36\37\7\4\2\2\37 \7\7\2\2 \7\3\2\2"+
		"\2!\"\7\6\2\2\"&\7\b\2\2#\'\5\6\4\2$\'\5\n\6\2%\'\5\b\5\2&#\3\2\2\2&$"+
		"\3\2\2\2&%\3\2\2\2\'+\3\2\2\2(,\5\6\4\2),\5\n\6\2*,\5\b\5\2+(\3\2\2\2"+
		"+)\3\2\2\2+*\3\2\2\2,-\3\2\2\2-.\7\7\2\2.\t\3\2\2\2/\60\7\6\2\2\60\64"+
		"\7\5\2\2\61\65\5\6\4\2\62\65\5\n\6\2\63\65\5\b\5\2\64\61\3\2\2\2\64\62"+
		"\3\2\2\2\64\63\3\2\2\2\65\66\3\2\2\2\66\67\7\7\2\2\67\13\3\2\2\2\7\17"+
		"\33&+\64";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}