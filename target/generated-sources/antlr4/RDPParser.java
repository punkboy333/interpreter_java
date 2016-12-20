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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, DECLARE=26, ENDDECLARE=27, METHOD=28, ENDMETHOD=29, NAME=30, 
		BIGNAME=31, NUMBER=32, LEFT=33, RIGHT=34, MAIN=35, ENDMAIN=36, WS=37, 
		LINEBREAK=38, VAR=39, UNCON=40, LEFTBRAQUET=41, RIGHTTBRAQUET=42, BINCON=43, 
		STRING=44;
	public static final int
		RULE_rdp = 0, RULE_declare = 1, RULE_method = 2, RULE_main = 3, RULE_callmethod = 4, 
		RULE_linebreak = 5, RULE_list = 6, RULE_from = 7, RULE_variable = 8, RULE_var = 9, 
		RULE_bincon = 10, RULE_uncon = 11, RULE_logicalinput = 12, RULE_read = 13, 
		RULE_write = 14, RULE_writeln = 15, RULE_get = 16, RULE_push = 17, RULE_pop = 18, 
		RULE_set = 19, RULE_returne = 20, RULE_ife = 21, RULE_fore = 22, RULE_truetable = 23;
	public static final String[] ruleNames = {
		"rdp", "declare", "method", "main", "callmethod", "linebreak", "list", 
		"from", "variable", "var", "bincon", "uncon", "logicalinput", "read", 
		"write", "writeln", "get", "push", "pop", "set", "returne", "ife", "fore", 
		"truetable"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'method'", "'->'", "'list'", "'='", "'from'", "'VAR'", "'true'", 
		"'false'", "'read'", "'write'", "'\"'", "'writeln'", "'get'", "'push'", 
		"','", "'pop'", "'set'", "'return'", "'if'", "'then'", "'else'", "'end'", 
		"'for'", "'in'", "'truthtable'", "'DECLARE'", "'END DECLARE'", "'METHOD'", 
		"'END METHOD'", null, null, null, "'('", "')'", "'MAIN'", "'END MAIN'", 
		null, null, null, "'-'", "'['", "']'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "DECLARE", "ENDDECLARE", "METHOD", "ENDMETHOD", "NAME", "BIGNAME", 
		"NUMBER", "LEFT", "RIGHT", "MAIN", "ENDMAIN", "WS", "LINEBREAK", "VAR", 
		"UNCON", "LEFTBRAQUET", "RIGHTTBRAQUET", "BINCON", "STRING"
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
		public DeclareContext declare() {
			return getRuleContext(DeclareContext.class,0);
		}
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public List<MethodContext> method() {
			return getRuleContexts(MethodContext.class);
		}
		public MethodContext method(int i) {
			return getRuleContext(MethodContext.class,i);
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
			setState(48);
			declare();
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==METHOD) {
				{
				{
				setState(49);
				method();
				}
				}
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(55);
			main();
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

	public static class DeclareContext extends ParserRuleContext {
		public TerminalNode DECLARE() { return getToken(RDPParser.DECLARE, 0); }
		public TerminalNode ENDDECLARE() { return getToken(RDPParser.ENDDECLARE, 0); }
		public List<FromContext> from() {
			return getRuleContexts(FromContext.class);
		}
		public FromContext from(int i) {
			return getRuleContext(FromContext.class,i);
		}
		public List<ListContext> list() {
			return getRuleContexts(ListContext.class);
		}
		public ListContext list(int i) {
			return getRuleContext(ListContext.class,i);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public DeclareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RDPListener ) ((RDPListener)listener).enterDeclare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RDPListener ) ((RDPListener)listener).exitDeclare(this);
		}
	}

	public final DeclareContext declare() throws RecognitionException {
		DeclareContext _localctx = new DeclareContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declare);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(DECLARE);
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << T__5))) != 0)) {
				{
				setState(61);
				switch (_input.LA(1)) {
				case T__4:
					{
					setState(58);
					from();
					}
					break;
				case T__2:
					{
					setState(59);
					list();
					}
					break;
				case T__5:
					{
					setState(60);
					variable();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(66);
			match(ENDDECLARE);
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

	public static class MethodContext extends ParserRuleContext {
		public TerminalNode METHOD() { return getToken(RDPParser.METHOD, 0); }
		public TerminalNode NAME() { return getToken(RDPParser.NAME, 0); }
		public TerminalNode LEFT() { return getToken(RDPParser.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(RDPParser.RIGHT, 0); }
		public DeclareContext declare() {
			return getRuleContext(DeclareContext.class,0);
		}
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public TerminalNode ENDMETHOD() { return getToken(RDPParser.ENDMETHOD, 0); }
		public List<FromContext> from() {
			return getRuleContexts(FromContext.class);
		}
		public FromContext from(int i) {
			return getRuleContext(FromContext.class,i);
		}
		public List<ListContext> list() {
			return getRuleContexts(ListContext.class);
		}
		public ListContext list(int i) {
			return getRuleContext(ListContext.class,i);
		}
		public MethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RDPListener ) ((RDPListener)listener).enterMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RDPListener ) ((RDPListener)listener).exitMethod(this);
		}
	}

	public final MethodContext method() throws RecognitionException {
		MethodContext _localctx = new MethodContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_method);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(METHOD);
			setState(69);
			match(NAME);
			setState(70);
			match(LEFT);
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(71);
				from();
				}
				}
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(77);
				list();
				}
				}
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(83);
			match(RIGHT);
			setState(84);
			declare();
			setState(85);
			main();
			setState(86);
			match(ENDMETHOD);
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

	public static class MainContext extends ParserRuleContext {
		public TerminalNode MAIN() { return getToken(RDPParser.MAIN, 0); }
		public TerminalNode ENDMAIN() { return getToken(RDPParser.ENDMAIN, 0); }
		public ReturneContext returne() {
			return getRuleContext(ReturneContext.class,0);
		}
		public List<ReadContext> read() {
			return getRuleContexts(ReadContext.class);
		}
		public ReadContext read(int i) {
			return getRuleContext(ReadContext.class,i);
		}
		public List<WriteContext> write() {
			return getRuleContexts(WriteContext.class);
		}
		public WriteContext write(int i) {
			return getRuleContext(WriteContext.class,i);
		}
		public List<WritelnContext> writeln() {
			return getRuleContexts(WritelnContext.class);
		}
		public WritelnContext writeln(int i) {
			return getRuleContext(WritelnContext.class,i);
		}
		public List<GetContext> get() {
			return getRuleContexts(GetContext.class);
		}
		public GetContext get(int i) {
			return getRuleContext(GetContext.class,i);
		}
		public List<PushContext> push() {
			return getRuleContexts(PushContext.class);
		}
		public PushContext push(int i) {
			return getRuleContext(PushContext.class,i);
		}
		public List<PopContext> pop() {
			return getRuleContexts(PopContext.class);
		}
		public PopContext pop(int i) {
			return getRuleContext(PopContext.class,i);
		}
		public List<CallmethodContext> callmethod() {
			return getRuleContexts(CallmethodContext.class);
		}
		public CallmethodContext callmethod(int i) {
			return getRuleContext(CallmethodContext.class,i);
		}
		public List<SetContext> set() {
			return getRuleContexts(SetContext.class);
		}
		public SetContext set(int i) {
			return getRuleContext(SetContext.class,i);
		}
		public List<ForeContext> fore() {
			return getRuleContexts(ForeContext.class);
		}
		public ForeContext fore(int i) {
			return getRuleContext(ForeContext.class,i);
		}
		public List<IfeContext> ife() {
			return getRuleContexts(IfeContext.class);
		}
		public IfeContext ife(int i) {
			return getRuleContext(IfeContext.class,i);
		}
		public List<TruetableContext> truetable() {
			return getRuleContexts(TruetableContext.class);
		}
		public TruetableContext truetable(int i) {
			return getRuleContext(TruetableContext.class,i);
		}
		public List<TerminalNode> NAME() { return getTokens(RDPParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(RDPParser.NAME, i);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RDPListener ) ((RDPListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RDPListener ) ((RDPListener)listener).exitMain(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_main);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(MAIN);
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__15) | (1L << T__16) | (1L << T__18) | (1L << T__22) | (1L << T__24) | (1L << NAME))) != 0)) {
				{
				setState(101);
				switch (_input.LA(1)) {
				case T__8:
					{
					setState(89);
					read();
					}
					break;
				case T__9:
					{
					setState(90);
					write();
					}
					break;
				case T__11:
					{
					setState(91);
					writeln();
					}
					break;
				case T__12:
					{
					setState(92);
					get();
					}
					break;
				case T__13:
					{
					setState(93);
					push();
					}
					break;
				case T__15:
					{
					setState(94);
					pop();
					}
					break;
				case T__0:
					{
					setState(95);
					callmethod();
					}
					break;
				case T__16:
					{
					setState(96);
					set();
					}
					break;
				case T__22:
					{
					setState(97);
					fore();
					}
					break;
				case T__18:
					{
					setState(98);
					ife();
					}
					break;
				case T__24:
					{
					setState(99);
					truetable();
					}
					break;
				case NAME:
					{
					setState(100);
					match(NAME);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(108);
			switch (_input.LA(1)) {
			case T__17:
				{
				setState(106);
				returne();
				}
				break;
			case ENDMAIN:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(110);
			match(ENDMAIN);
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

	public static class CallmethodContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(RDPParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(RDPParser.NAME, i);
		}
		public TerminalNode LEFT() { return getToken(RDPParser.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(RDPParser.RIGHT, 0); }
		public TerminalNode VAR() { return getToken(RDPParser.VAR, 0); }
		public CallmethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callmethod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RDPListener ) ((RDPListener)listener).enterCallmethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RDPListener ) ((RDPListener)listener).exitCallmethod(this);
		}
	}

	public final CallmethodContext callmethod() throws RecognitionException {
		CallmethodContext _localctx = new CallmethodContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_callmethod);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(T__0);
			setState(113);
			match(NAME);
			setState(114);
			match(LEFT);
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NAME) {
				{
				{
				setState(115);
				match(NAME);
				}
				}
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(121);
			match(RIGHT);
			setState(125);
			switch (_input.LA(1)) {
			case T__1:
				{
				{
				setState(122);
				match(T__1);
				setState(123);
				_la = _input.LA(1);
				if ( !(_la==NAME || _la==VAR) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				}
				break;
			case T__0:
			case T__8:
			case T__9:
			case T__11:
			case T__12:
			case T__13:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__22:
			case T__24:
			case NAME:
			case ENDMAIN:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class LinebreakContext extends ParserRuleContext {
		public TerminalNode LINEBREAK() { return getToken(RDPParser.LINEBREAK, 0); }
		public LinebreakContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_linebreak; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RDPListener ) ((RDPListener)listener).enterLinebreak(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RDPListener ) ((RDPListener)listener).exitLinebreak(this);
		}
	}

	public final LinebreakContext linebreak() throws RecognitionException {
		LinebreakContext _localctx = new LinebreakContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_linebreak);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(LINEBREAK);
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

	public static class ListContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(RDPParser.NAME, 0); }
		public List<FromContext> from() {
			return getRuleContexts(FromContext.class);
		}
		public FromContext from(int i) {
			return getRuleContext(FromContext.class,i);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RDPListener ) ((RDPListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RDPListener ) ((RDPListener)listener).exitList(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_list);
		try {
			int _alt;
			setState(140);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(129);
				match(T__2);
				setState(130);
				match(NAME);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				match(T__2);
				setState(132);
				match(NAME);
				setState(133);
				match(T__3);
				setState(137);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(134);
						from();
						}
						} 
					}
					setState(139);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				}
				}
				break;
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

	public static class FromContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(RDPParser.NAME, 0); }
		public BinconContext bincon() {
			return getRuleContext(BinconContext.class,0);
		}
		public UnconContext uncon() {
			return getRuleContext(UnconContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public FromContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RDPListener ) ((RDPListener)listener).enterFrom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RDPListener ) ((RDPListener)listener).exitFrom(this);
		}
	}

	public final FromContext from() throws RecognitionException {
		FromContext _localctx = new FromContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_from);
		try {
			setState(153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				match(T__4);
				setState(143);
				match(NAME);
				setState(144);
				match(T__3);
				setState(149);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(145);
					bincon();
					}
					break;
				case 2:
					{
					setState(146);
					uncon();
					}
					break;
				case 3:
					{
					setState(147);
					var();
					}
					break;
				case 4:
					{
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(151);
				match(T__4);
				setState(152);
				match(NAME);
				}
				break;
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

	public static class VariableContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RDPListener ) ((RDPListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RDPListener ) ((RDPListener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(T__5);
			setState(156);
			var();
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
		public TerminalNode VAR() { return getToken(RDPParser.VAR, 0); }
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
		enterRule(_localctx, 18, RULE_var);
		int _la;
		try {
			setState(163);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(158);
				match(VAR);
				setState(159);
				match(T__3);
				setState(160);
				_la = _input.LA(1);
				if ( !(_la==T__6 || _la==T__7) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(161);
				match(VAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
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
		public TerminalNode BINCON() { return getToken(RDPParser.BINCON, 0); }
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
		enterRule(_localctx, 20, RULE_bincon);
		try {
			setState(180);
			switch (_input.LA(1)) {
			case LEFT:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(165);
				match(LEFT);
				setState(169);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(166);
					var();
					}
					break;
				case 2:
					{
					setState(167);
					uncon();
					}
					break;
				case 3:
					{
					setState(168);
					bincon();
					}
					break;
				}
				setState(171);
				match(BINCON);
				setState(175);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(172);
					var();
					}
					break;
				case 2:
					{
					setState(173);
					uncon();
					}
					break;
				case 3:
					{
					setState(174);
					bincon();
					}
					break;
				}
				setState(177);
				match(RIGHT);
				}
				}
				break;
			case T__2:
			case T__4:
			case T__5:
			case ENDDECLARE:
			case RIGHT:
			case BINCON:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		public TerminalNode UNCON() { return getToken(RDPParser.UNCON, 0); }
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
		enterRule(_localctx, 22, RULE_uncon);
		try {
			setState(189);
			switch (_input.LA(1)) {
			case UNCON:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(182);
				match(UNCON);
				setState(186);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(183);
					var();
					}
					break;
				case 2:
					{
					setState(184);
					uncon();
					}
					break;
				case 3:
					{
					setState(185);
					bincon();
					}
					break;
				}
				}
				}
				break;
			case T__2:
			case T__4:
			case T__5:
			case ENDDECLARE:
			case RIGHT:
			case BINCON:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class LogicalinputContext extends ParserRuleContext {
		public BinconContext bincon() {
			return getRuleContext(BinconContext.class,0);
		}
		public UnconContext uncon() {
			return getRuleContext(UnconContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public LogicalinputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalinput; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RDPListener ) ((RDPListener)listener).enterLogicalinput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RDPListener ) ((RDPListener)listener).exitLogicalinput(this);
		}
	}

	public final LogicalinputContext logicalinput() throws RecognitionException {
		LogicalinputContext _localctx = new LogicalinputContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_logicalinput);
		try {
			setState(194);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(191);
				bincon();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(192);
				uncon();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(193);
				var();
				}
				break;
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

	public static class ReadContext extends ParserRuleContext {
		public TerminalNode LEFT() { return getToken(RDPParser.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(RDPParser.RIGHT, 0); }
		public TerminalNode NAME() { return getToken(RDPParser.NAME, 0); }
		public TerminalNode VAR() { return getToken(RDPParser.VAR, 0); }
		public ReadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RDPListener ) ((RDPListener)listener).enterRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RDPListener ) ((RDPListener)listener).exitRead(this);
		}
	}

	public final ReadContext read() throws RecognitionException {
		ReadContext _localctx = new ReadContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_read);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(T__8);
			setState(197);
			match(LEFT);
			setState(198);
			_la = _input.LA(1);
			if ( !(_la==NAME || _la==VAR) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(199);
			match(RIGHT);
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

	public static class WriteContext extends ParserRuleContext {
		public TerminalNode LEFT() { return getToken(RDPParser.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(RDPParser.RIGHT, 0); }
		public TerminalNode NAME() { return getToken(RDPParser.NAME, 0); }
		public TerminalNode VAR() { return getToken(RDPParser.VAR, 0); }
		public TerminalNode STRING() { return getToken(RDPParser.STRING, 0); }
		public WriteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_write; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RDPListener ) ((RDPListener)listener).enterWrite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RDPListener ) ((RDPListener)listener).exitWrite(this);
		}
	}

	public final WriteContext write() throws RecognitionException {
		WriteContext _localctx = new WriteContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_write);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(T__9);
			setState(210);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				{
				setState(202);
				match(LEFT);
				setState(203);
				_la = _input.LA(1);
				if ( !(_la==NAME || _la==VAR) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(204);
				match(RIGHT);
				}
				}
				break;
			case 2:
				{
				{
				setState(205);
				match(LEFT);
				setState(206);
				match(T__10);
				{
				setState(207);
				match(STRING);
				}
				setState(208);
				match(T__10);
				setState(209);
				match(RIGHT);
				}
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

	public static class WritelnContext extends ParserRuleContext {
		public TerminalNode LEFT() { return getToken(RDPParser.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(RDPParser.RIGHT, 0); }
		public WritelnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_writeln; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RDPListener ) ((RDPListener)listener).enterWriteln(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RDPListener ) ((RDPListener)listener).exitWriteln(this);
		}
	}

	public final WritelnContext writeln() throws RecognitionException {
		WritelnContext _localctx = new WritelnContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_writeln);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(T__11);
			setState(213);
			match(LEFT);
			setState(214);
			match(RIGHT);
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

	public static class GetContext extends ParserRuleContext {
		public TerminalNode LEFT() { return getToken(RDPParser.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(RDPParser.RIGHT, 0); }
		public TerminalNode NAME() { return getToken(RDPParser.NAME, 0); }
		public List<TerminalNode> VAR() { return getTokens(RDPParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(RDPParser.VAR, i);
		}
		public GetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_get; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RDPListener ) ((RDPListener)listener).enterGet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RDPListener ) ((RDPListener)listener).exitGet(this);
		}
	}

	public final GetContext get() throws RecognitionException {
		GetContext _localctx = new GetContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_get);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(T__12);
			setState(217);
			match(LEFT);
			setState(218);
			_la = _input.LA(1);
			if ( !(_la==NAME || _la==VAR) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(219);
			match(RIGHT);
			setState(223);
			switch (_input.LA(1)) {
			case T__1:
				{
				{
				setState(220);
				match(T__1);
				setState(221);
				match(VAR);
				}
				}
				break;
			case T__0:
			case T__8:
			case T__9:
			case T__11:
			case T__12:
			case T__13:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__22:
			case T__24:
			case NAME:
			case ENDMAIN:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class PushContext extends ParserRuleContext {
		public TerminalNode LEFT() { return getToken(RDPParser.LEFT, 0); }
		public List<TerminalNode> NAME() { return getTokens(RDPParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(RDPParser.NAME, i);
		}
		public TerminalNode RIGHT() { return getToken(RDPParser.RIGHT, 0); }
		public PushContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_push; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RDPListener ) ((RDPListener)listener).enterPush(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RDPListener ) ((RDPListener)listener).exitPush(this);
		}
	}

	public final PushContext push() throws RecognitionException {
		PushContext _localctx = new PushContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_push);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(T__13);
			setState(226);
			match(LEFT);
			setState(227);
			match(NAME);
			setState(228);
			match(T__14);
			setState(229);
			match(NAME);
			setState(230);
			match(RIGHT);
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

	public static class PopContext extends ParserRuleContext {
		public TerminalNode LEFT() { return getToken(RDPParser.LEFT, 0); }
		public List<TerminalNode> NAME() { return getTokens(RDPParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(RDPParser.NAME, i);
		}
		public TerminalNode RIGHT() { return getToken(RDPParser.RIGHT, 0); }
		public PopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RDPListener ) ((RDPListener)listener).enterPop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RDPListener ) ((RDPListener)listener).exitPop(this);
		}
	}

	public final PopContext pop() throws RecognitionException {
		PopContext _localctx = new PopContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_pop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(T__15);
			setState(233);
			match(LEFT);
			setState(234);
			match(NAME);
			setState(235);
			match(RIGHT);
			setState(239);
			switch (_input.LA(1)) {
			case T__1:
				{
				{
				setState(236);
				match(T__1);
				setState(237);
				match(NAME);
				}
				}
				break;
			case T__0:
			case T__8:
			case T__9:
			case T__11:
			case T__12:
			case T__13:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__22:
			case T__24:
			case NAME:
			case ENDMAIN:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class SetContext extends ParserRuleContext {
		public TerminalNode LEFT() { return getToken(RDPParser.LEFT, 0); }
		public LogicalinputContext logicalinput() {
			return getRuleContext(LogicalinputContext.class,0);
		}
		public TerminalNode RIGHT() { return getToken(RDPParser.RIGHT, 0); }
		public TerminalNode NAME() { return getToken(RDPParser.NAME, 0); }
		public SetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RDPListener ) ((RDPListener)listener).enterSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RDPListener ) ((RDPListener)listener).exitSet(this);
		}
	}

	public final SetContext set() throws RecognitionException {
		SetContext _localctx = new SetContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_set);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(T__16);
			setState(242);
			match(LEFT);
			setState(243);
			logicalinput();
			setState(244);
			match(RIGHT);
			setState(248);
			switch (_input.LA(1)) {
			case T__1:
				{
				{
				setState(245);
				match(T__1);
				setState(246);
				match(NAME);
				}
				}
				break;
			case T__0:
			case T__8:
			case T__9:
			case T__11:
			case T__12:
			case T__13:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__22:
			case T__24:
			case NAME:
			case ENDMAIN:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ReturneContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(RDPParser.NAME, 0); }
		public TerminalNode VAR() { return getToken(RDPParser.VAR, 0); }
		public ReturneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returne; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RDPListener ) ((RDPListener)listener).enterReturne(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RDPListener ) ((RDPListener)listener).exitReturne(this);
		}
	}

	public final ReturneContext returne() throws RecognitionException {
		ReturneContext _localctx = new ReturneContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_returne);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(T__17);
			setState(251);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << T__5))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(252);
			_la = _input.LA(1);
			if ( !(_la==NAME || _la==VAR) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
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

	public static class IfeContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(RDPParser.VAR, 0); }
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public IfeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ife; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RDPListener ) ((RDPListener)listener).enterIfe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RDPListener ) ((RDPListener)listener).exitIfe(this);
		}
	}

	public final IfeContext ife() throws RecognitionException {
		IfeContext _localctx = new IfeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_ife);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			match(T__18);
			setState(255);
			match(T__19);
			setState(256);
			match(VAR);
			setState(260);
			switch (_input.LA(1)) {
			case T__20:
				{
				setState(257);
				match(T__20);
				setState(258);
				main();
				}
				break;
			case T__21:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(262);
			match(T__21);
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

	public static class ForeContext extends ParserRuleContext {
		public TerminalNode LEFT() { return getToken(RDPParser.LEFT, 0); }
		public List<TerminalNode> NAME() { return getTokens(RDPParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(RDPParser.NAME, i);
		}
		public TerminalNode RIGHT() { return getToken(RDPParser.RIGHT, 0); }
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public ForeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fore; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RDPListener ) ((RDPListener)listener).enterFore(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RDPListener ) ((RDPListener)listener).exitFore(this);
		}
	}

	public final ForeContext fore() throws RecognitionException {
		ForeContext _localctx = new ForeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_fore);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(T__22);
			setState(265);
			match(LEFT);
			setState(266);
			match(NAME);
			setState(267);
			match(T__23);
			setState(268);
			match(NAME);
			setState(269);
			match(RIGHT);
			setState(270);
			main();
			setState(271);
			match(T__21);
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

	public static class TruetableContext extends ParserRuleContext {
		public TerminalNode LEFT() { return getToken(RDPParser.LEFT, 0); }
		public TerminalNode NAME() { return getToken(RDPParser.NAME, 0); }
		public TerminalNode RIGHT() { return getToken(RDPParser.RIGHT, 0); }
		public TruetableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_truetable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RDPListener ) ((RDPListener)listener).enterTruetable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RDPListener ) ((RDPListener)listener).exitTruetable(this);
		}
	}

	public final TruetableContext truetable() throws RecognitionException {
		TruetableContext _localctx = new TruetableContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_truetable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			match(T__24);
			setState(274);
			match(LEFT);
			setState(275);
			match(NAME);
			setState(276);
			match(RIGHT);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3.\u0119\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\3\2\7\2\65\n\2\f\2\16\28\13\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3@\n\3\f"+
		"\3\16\3C\13\3\3\3\3\3\3\4\3\4\3\4\3\4\7\4K\n\4\f\4\16\4N\13\4\3\4\7\4"+
		"Q\n\4\f\4\16\4T\13\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\7\5h\n\5\f\5\16\5k\13\5\3\5\3\5\5\5o\n\5\3\5\3"+
		"\5\3\6\3\6\3\6\3\6\7\6w\n\6\f\6\16\6z\13\6\3\6\3\6\3\6\3\6\5\6\u0080\n"+
		"\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u008a\n\b\f\b\16\b\u008d\13\b\5"+
		"\b\u008f\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0098\n\t\3\t\3\t\5\t\u009c"+
		"\n\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\5\13\u00a6\n\13\3\f\3\f\3\f"+
		"\3\f\5\f\u00ac\n\f\3\f\3\f\3\f\3\f\5\f\u00b2\n\f\3\f\3\f\3\f\5\f\u00b7"+
		"\n\f\3\r\3\r\3\r\3\r\5\r\u00bd\n\r\3\r\5\r\u00c0\n\r\3\16\3\16\3\16\5"+
		"\16\u00c5\n\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\5\20\u00d5\n\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\5\22\u00e2\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00f2\n\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\5\25\u00fb\n\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\5\27\u0107\n\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\31\3\31\3\31\3\31\3\31\3\31\2\2\32\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\2\5\4\2  ))\3\2\t\n\4\2\5\5\7\b\u012c\2\62\3"+
		"\2\2\2\4;\3\2\2\2\6F\3\2\2\2\bZ\3\2\2\2\nr\3\2\2\2\f\u0081\3\2\2\2\16"+
		"\u008e\3\2\2\2\20\u009b\3\2\2\2\22\u009d\3\2\2\2\24\u00a5\3\2\2\2\26\u00b6"+
		"\3\2\2\2\30\u00bf\3\2\2\2\32\u00c4\3\2\2\2\34\u00c6\3\2\2\2\36\u00cb\3"+
		"\2\2\2 \u00d6\3\2\2\2\"\u00da\3\2\2\2$\u00e3\3\2\2\2&\u00ea\3\2\2\2(\u00f3"+
		"\3\2\2\2*\u00fc\3\2\2\2,\u0100\3\2\2\2.\u010a\3\2\2\2\60\u0113\3\2\2\2"+
		"\62\66\5\4\3\2\63\65\5\6\4\2\64\63\3\2\2\2\658\3\2\2\2\66\64\3\2\2\2\66"+
		"\67\3\2\2\2\679\3\2\2\28\66\3\2\2\29:\5\b\5\2:\3\3\2\2\2;A\7\34\2\2<@"+
		"\5\20\t\2=@\5\16\b\2>@\5\22\n\2?<\3\2\2\2?=\3\2\2\2?>\3\2\2\2@C\3\2\2"+
		"\2A?\3\2\2\2AB\3\2\2\2BD\3\2\2\2CA\3\2\2\2DE\7\35\2\2E\5\3\2\2\2FG\7\36"+
		"\2\2GH\7 \2\2HL\7#\2\2IK\5\20\t\2JI\3\2\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2"+
		"\2\2MR\3\2\2\2NL\3\2\2\2OQ\5\16\b\2PO\3\2\2\2QT\3\2\2\2RP\3\2\2\2RS\3"+
		"\2\2\2SU\3\2\2\2TR\3\2\2\2UV\7$\2\2VW\5\4\3\2WX\5\b\5\2XY\7\37\2\2Y\7"+
		"\3\2\2\2Zi\7%\2\2[h\5\34\17\2\\h\5\36\20\2]h\5 \21\2^h\5\"\22\2_h\5$\23"+
		"\2`h\5&\24\2ah\5\n\6\2bh\5(\25\2ch\5.\30\2dh\5,\27\2eh\5\60\31\2fh\7 "+
		"\2\2g[\3\2\2\2g\\\3\2\2\2g]\3\2\2\2g^\3\2\2\2g_\3\2\2\2g`\3\2\2\2ga\3"+
		"\2\2\2gb\3\2\2\2gc\3\2\2\2gd\3\2\2\2ge\3\2\2\2gf\3\2\2\2hk\3\2\2\2ig\3"+
		"\2\2\2ij\3\2\2\2jn\3\2\2\2ki\3\2\2\2lo\5*\26\2mo\3\2\2\2nl\3\2\2\2nm\3"+
		"\2\2\2op\3\2\2\2pq\7&\2\2q\t\3\2\2\2rs\7\3\2\2st\7 \2\2tx\7#\2\2uw\7 "+
		"\2\2vu\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2y{\3\2\2\2zx\3\2\2\2{\177"+
		"\7$\2\2|}\7\4\2\2}\u0080\t\2\2\2~\u0080\3\2\2\2\177|\3\2\2\2\177~\3\2"+
		"\2\2\u0080\13\3\2\2\2\u0081\u0082\7(\2\2\u0082\r\3\2\2\2\u0083\u0084\7"+
		"\5\2\2\u0084\u008f\7 \2\2\u0085\u0086\7\5\2\2\u0086\u0087\7 \2\2\u0087"+
		"\u008b\7\6\2\2\u0088\u008a\5\20\t\2\u0089\u0088\3\2\2\2\u008a\u008d\3"+
		"\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008f\3\2\2\2\u008d"+
		"\u008b\3\2\2\2\u008e\u0083\3\2\2\2\u008e\u0085\3\2\2\2\u008f\17\3\2\2"+
		"\2\u0090\u0091\7\7\2\2\u0091\u0092\7 \2\2\u0092\u0097\7\6\2\2\u0093\u0098"+
		"\5\26\f\2\u0094\u0098\5\30\r\2\u0095\u0098\5\24\13\2\u0096\u0098\3\2\2"+
		"\2\u0097\u0093\3\2\2\2\u0097\u0094\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0096"+
		"\3\2\2\2\u0098\u009c\3\2\2\2\u0099\u009a\7\7\2\2\u009a\u009c\7 \2\2\u009b"+
		"\u0090\3\2\2\2\u009b\u0099\3\2\2\2\u009c\21\3\2\2\2\u009d\u009e\7\b\2"+
		"\2\u009e\u009f\5\24\13\2\u009f\23\3\2\2\2\u00a0\u00a1\7)\2\2\u00a1\u00a2"+
		"\7\6\2\2\u00a2\u00a6\t\3\2\2\u00a3\u00a6\7)\2\2\u00a4\u00a6\3\2\2\2\u00a5"+
		"\u00a0\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a4\3\2\2\2\u00a6\25\3\2\2"+
		"\2\u00a7\u00ab\7#\2\2\u00a8\u00ac\5\24\13\2\u00a9\u00ac\5\30\r\2\u00aa"+
		"\u00ac\5\26\f\2\u00ab\u00a8\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00aa\3"+
		"\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00b1\7-\2\2\u00ae\u00b2\5\24\13\2\u00af"+
		"\u00b2\5\30\r\2\u00b0\u00b2\5\26\f\2\u00b1\u00ae\3\2\2\2\u00b1\u00af\3"+
		"\2\2\2\u00b1\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4\7$\2\2\u00b4"+
		"\u00b7\3\2\2\2\u00b5\u00b7\3\2\2\2\u00b6\u00a7\3\2\2\2\u00b6\u00b5\3\2"+
		"\2\2\u00b7\27\3\2\2\2\u00b8\u00bc\7*\2\2\u00b9\u00bd\5\24\13\2\u00ba\u00bd"+
		"\5\30\r\2\u00bb\u00bd\5\26\f\2\u00bc\u00b9\3\2\2\2\u00bc\u00ba\3\2\2\2"+
		"\u00bc\u00bb\3\2\2\2\u00bd\u00c0\3\2\2\2\u00be\u00c0\3\2\2\2\u00bf\u00b8"+
		"\3\2\2\2\u00bf\u00be\3\2\2\2\u00c0\31\3\2\2\2\u00c1\u00c5\5\26\f\2\u00c2"+
		"\u00c5\5\30\r\2\u00c3\u00c5\5\24\13\2\u00c4\u00c1\3\2\2\2\u00c4\u00c2"+
		"\3\2\2\2\u00c4\u00c3\3\2\2\2\u00c5\33\3\2\2\2\u00c6\u00c7\7\13\2\2\u00c7"+
		"\u00c8\7#\2\2\u00c8\u00c9\t\2\2\2\u00c9\u00ca\7$\2\2\u00ca\35\3\2\2\2"+
		"\u00cb\u00d4\7\f\2\2\u00cc\u00cd\7#\2\2\u00cd\u00ce\t\2\2\2\u00ce\u00d5"+
		"\7$\2\2\u00cf\u00d0\7#\2\2\u00d0\u00d1\7\r\2\2\u00d1\u00d2\7.\2\2\u00d2"+
		"\u00d3\7\r\2\2\u00d3\u00d5\7$\2\2\u00d4\u00cc\3\2\2\2\u00d4\u00cf\3\2"+
		"\2\2\u00d5\37\3\2\2\2\u00d6\u00d7\7\16\2\2\u00d7\u00d8\7#\2\2\u00d8\u00d9"+
		"\7$\2\2\u00d9!\3\2\2\2\u00da\u00db\7\17\2\2\u00db\u00dc\7#\2\2\u00dc\u00dd"+
		"\t\2\2\2\u00dd\u00e1\7$\2\2\u00de\u00df\7\4\2\2\u00df\u00e2\7)\2\2\u00e0"+
		"\u00e2\3\2\2\2\u00e1\u00de\3\2\2\2\u00e1\u00e0\3\2\2\2\u00e2#\3\2\2\2"+
		"\u00e3\u00e4\7\20\2\2\u00e4\u00e5\7#\2\2\u00e5\u00e6\7 \2\2\u00e6\u00e7"+
		"\7\21\2\2\u00e7\u00e8\7 \2\2\u00e8\u00e9\7$\2\2\u00e9%\3\2\2\2\u00ea\u00eb"+
		"\7\22\2\2\u00eb\u00ec\7#\2\2\u00ec\u00ed\7 \2\2\u00ed\u00f1\7$\2\2\u00ee"+
		"\u00ef\7\4\2\2\u00ef\u00f2\7 \2\2\u00f0\u00f2\3\2\2\2\u00f1\u00ee\3\2"+
		"\2\2\u00f1\u00f0\3\2\2\2\u00f2\'\3\2\2\2\u00f3\u00f4\7\23\2\2\u00f4\u00f5"+
		"\7#\2\2\u00f5\u00f6\5\32\16\2\u00f6\u00fa\7$\2\2\u00f7\u00f8\7\4\2\2\u00f8"+
		"\u00fb\7 \2\2\u00f9\u00fb\3\2\2\2\u00fa\u00f7\3\2\2\2\u00fa\u00f9\3\2"+
		"\2\2\u00fb)\3\2\2\2\u00fc\u00fd\7\24\2\2\u00fd\u00fe\t\4\2\2\u00fe\u00ff"+
		"\t\2\2\2\u00ff+\3\2\2\2\u0100\u0101\7\25\2\2\u0101\u0102\7\26\2\2\u0102"+
		"\u0106\7)\2\2\u0103\u0104\7\27\2\2\u0104\u0107\5\b\5\2\u0105\u0107\3\2"+
		"\2\2\u0106\u0103\3\2\2\2\u0106\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108"+
		"\u0109\7\30\2\2\u0109-\3\2\2\2\u010a\u010b\7\31\2\2\u010b\u010c\7#\2\2"+
		"\u010c\u010d\7 \2\2\u010d\u010e\7\32\2\2\u010e\u010f\7 \2\2\u010f\u0110"+
		"\7$\2\2\u0110\u0111\5\b\5\2\u0111\u0112\7\30\2\2\u0112/\3\2\2\2\u0113"+
		"\u0114\7\33\2\2\u0114\u0115\7#\2\2\u0115\u0116\7 \2\2\u0116\u0117\7$\2"+
		"\2\u0117\61\3\2\2\2\34\66?ALRginx\177\u008b\u008e\u0097\u009b\u00a5\u00ab"+
		"\u00b1\u00b6\u00bc\u00bf\u00c4\u00d4\u00e1\u00f1\u00fa\u0106";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}