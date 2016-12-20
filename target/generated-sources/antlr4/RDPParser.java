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
		T__24=25, T__25=26, T__26=27, T__27=28, DECLARE=29, ENDDECLARE=30, METHOD=31, 
		ENDMETHOD=32, NAME=33, BIGNAME=34, NUMBER=35, LEFT=36, RIGHT=37, MAIN=38, 
		ENDMAIN=39, WS=40, LINEBREAK=41, VAR=42, UNCON=43, LEFTBRAQUET=44, RIGHTTBRAQUET=45, 
		BINCON=46, COMMENT=47, STRING=48;
	public static final int
		RULE_rdp = 0, RULE_declare = 1, RULE_method = 2, RULE_main = 3, RULE_callmethod = 4, 
		RULE_linebreak = 5, RULE_list = 6, RULE_from = 7, RULE_variable = 8, RULE_var = 9, 
		RULE_bincon = 10, RULE_uncon = 11, RULE_logicalinput = 12, RULE_read = 13, 
		RULE_write = 14, RULE_writeln = 15, RULE_get = 16, RULE_push = 17, RULE_pop = 18, 
		RULE_set = 19, RULE_returne = 20, RULE_ife = 21, RULE_fore = 22, RULE_truetable = 23, 
		RULE_istautology = 24, RULE_isElentmondas = 25, RULE_isKielegitheto = 26;
	public static final String[] ruleNames = {
		"rdp", "declare", "method", "main", "callmethod", "linebreak", "list", 
		"from", "variable", "var", "bincon", "uncon", "logicalinput", "read", 
		"write", "writeln", "get", "push", "pop", "set", "returne", "ife", "fore", 
		"truetable", "istautology", "isElentmondas", "isKielegitheto"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'method'", "'->'", "'list'", "'='", "'from'", "'VAR'", "'true'", 
		"'false'", "'read'", "'write'", "'\"'", "'writeln'", "'get'", "'push'", 
		"','", "'pop'", "'set'", "'return'", "'if'", "'then'", "'else'", "'end'", 
		"'for'", "'in'", "'truthtable'", "'isTautology'", "'isEllentmondas'", 
		"'isKielegitheto'", "'DECLARE'", "'END DECLARE'", "'METHOD'", "'END METHOD'", 
		null, null, null, "'('", "')'", "'MAIN'", "'END MAIN'", null, null, null, 
		"'-'", "'['", "']'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, "DECLARE", "ENDDECLARE", "METHOD", "ENDMETHOD", 
		"NAME", "BIGNAME", "NUMBER", "LEFT", "RIGHT", "MAIN", "ENDMAIN", "WS", 
		"LINEBREAK", "VAR", "UNCON", "LEFTBRAQUET", "RIGHTTBRAQUET", "BINCON", 
		"COMMENT", "STRING"
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
			setState(54);
			declare();
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==METHOD) {
				{
				{
				setState(55);
				method();
				}
				}
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(61);
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
			setState(63);
			match(DECLARE);
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << T__5))) != 0)) {
				{
				setState(67);
				switch (_input.LA(1)) {
				case T__4:
					{
					setState(64);
					from();
					}
					break;
				case T__2:
					{
					setState(65);
					list();
					}
					break;
				case T__5:
					{
					setState(66);
					variable();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(72);
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
			setState(74);
			match(METHOD);
			setState(75);
			match(NAME);
			setState(76);
			match(LEFT);
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(77);
				from();
				}
				}
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(83);
				list();
				}
				}
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(89);
			match(RIGHT);
			setState(90);
			declare();
			setState(91);
			main();
			setState(92);
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
		public List<IstautologyContext> istautology() {
			return getRuleContexts(IstautologyContext.class);
		}
		public IstautologyContext istautology(int i) {
			return getRuleContext(IstautologyContext.class,i);
		}
		public List<IsElentmondasContext> isElentmondas() {
			return getRuleContexts(IsElentmondasContext.class);
		}
		public IsElentmondasContext isElentmondas(int i) {
			return getRuleContext(IsElentmondasContext.class,i);
		}
		public List<IsKielegithetoContext> isKielegitheto() {
			return getRuleContexts(IsKielegithetoContext.class);
		}
		public IsKielegithetoContext isKielegitheto(int i) {
			return getRuleContext(IsKielegithetoContext.class,i);
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
			setState(94);
			match(MAIN);
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__15) | (1L << T__16) | (1L << T__18) | (1L << T__22) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << NAME))) != 0)) {
				{
				setState(110);
				switch (_input.LA(1)) {
				case T__8:
					{
					setState(95);
					read();
					}
					break;
				case T__9:
					{
					setState(96);
					write();
					}
					break;
				case T__11:
					{
					setState(97);
					writeln();
					}
					break;
				case T__12:
					{
					setState(98);
					get();
					}
					break;
				case T__13:
					{
					setState(99);
					push();
					}
					break;
				case T__15:
					{
					setState(100);
					pop();
					}
					break;
				case T__0:
					{
					setState(101);
					callmethod();
					}
					break;
				case T__16:
					{
					setState(102);
					set();
					}
					break;
				case T__22:
					{
					setState(103);
					fore();
					}
					break;
				case T__18:
					{
					setState(104);
					ife();
					}
					break;
				case T__24:
					{
					setState(105);
					truetable();
					}
					break;
				case T__25:
					{
					setState(106);
					istautology();
					}
					break;
				case T__26:
					{
					setState(107);
					isElentmondas();
					}
					break;
				case T__27:
					{
					setState(108);
					isKielegitheto();
					}
					break;
				case NAME:
					{
					setState(109);
					match(NAME);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(117);
			switch (_input.LA(1)) {
			case T__17:
				{
				setState(115);
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
			setState(119);
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
			setState(121);
			match(T__0);
			setState(122);
			match(NAME);
			setState(123);
			match(LEFT);
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NAME) {
				{
				{
				setState(124);
				match(NAME);
				}
				}
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(130);
			match(RIGHT);
			setState(134);
			switch (_input.LA(1)) {
			case T__1:
				{
				{
				setState(131);
				match(T__1);
				setState(132);
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
			case T__25:
			case T__26:
			case T__27:
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
			setState(136);
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
			setState(149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				match(T__2);
				setState(139);
				match(NAME);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				match(T__2);
				setState(141);
				match(NAME);
				setState(142);
				match(T__3);
				setState(146);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(143);
						from();
						}
						} 
					}
					setState(148);
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
			setState(162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				match(T__4);
				setState(152);
				match(NAME);
				setState(153);
				match(T__3);
				setState(158);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(154);
					bincon();
					}
					break;
				case 2:
					{
					setState(155);
					uncon();
					}
					break;
				case 3:
					{
					setState(156);
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
				setState(160);
				match(T__4);
				setState(161);
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
			setState(164);
			match(T__5);
			setState(165);
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
			setState(172);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(167);
				match(VAR);
				setState(168);
				match(T__3);
				setState(169);
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
				setState(170);
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
			setState(189);
			switch (_input.LA(1)) {
			case LEFT:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(174);
				match(LEFT);
				setState(178);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(175);
					var();
					}
					break;
				case 2:
					{
					setState(176);
					uncon();
					}
					break;
				case 3:
					{
					setState(177);
					bincon();
					}
					break;
				}
				setState(180);
				match(BINCON);
				setState(184);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(181);
					var();
					}
					break;
				case 2:
					{
					setState(182);
					uncon();
					}
					break;
				case 3:
					{
					setState(183);
					bincon();
					}
					break;
				}
				setState(186);
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
			setState(198);
			switch (_input.LA(1)) {
			case UNCON:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(191);
				match(UNCON);
				setState(195);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(192);
					var();
					}
					break;
				case 2:
					{
					setState(193);
					uncon();
					}
					break;
				case 3:
					{
					setState(194);
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
			setState(203);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(200);
				bincon();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(201);
				uncon();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(202);
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
			setState(205);
			match(T__8);
			setState(206);
			match(LEFT);
			setState(207);
			_la = _input.LA(1);
			if ( !(_la==NAME || _la==VAR) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(208);
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
			setState(210);
			match(T__9);
			setState(219);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				{
				setState(211);
				match(LEFT);
				setState(212);
				_la = _input.LA(1);
				if ( !(_la==NAME || _la==VAR) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(213);
				match(RIGHT);
				}
				}
				break;
			case 2:
				{
				{
				setState(214);
				match(LEFT);
				setState(215);
				match(T__10);
				{
				setState(216);
				match(STRING);
				}
				setState(217);
				match(T__10);
				setState(218);
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
			setState(221);
			match(T__11);
			setState(222);
			match(LEFT);
			setState(223);
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
			setState(225);
			match(T__12);
			setState(226);
			match(LEFT);
			setState(227);
			_la = _input.LA(1);
			if ( !(_la==NAME || _la==VAR) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(228);
			match(RIGHT);
			setState(232);
			switch (_input.LA(1)) {
			case T__1:
				{
				{
				setState(229);
				match(T__1);
				setState(230);
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
			case T__25:
			case T__26:
			case T__27:
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
			setState(234);
			match(T__13);
			setState(235);
			match(LEFT);
			setState(236);
			match(NAME);
			setState(237);
			match(T__14);
			setState(238);
			match(NAME);
			setState(239);
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
			setState(241);
			match(T__15);
			setState(242);
			match(LEFT);
			setState(243);
			match(NAME);
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
			case T__25:
			case T__26:
			case T__27:
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
			setState(250);
			match(T__16);
			setState(251);
			match(LEFT);
			setState(252);
			logicalinput();
			setState(253);
			match(RIGHT);
			setState(257);
			switch (_input.LA(1)) {
			case T__1:
				{
				{
				setState(254);
				match(T__1);
				setState(255);
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
			case T__25:
			case T__26:
			case T__27:
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
			setState(259);
			match(T__17);
			setState(260);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << T__5))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(261);
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
		public TerminalNode LEFT() { return getToken(RDPParser.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(RDPParser.RIGHT, 0); }
		public List<MainContext> main() {
			return getRuleContexts(MainContext.class);
		}
		public MainContext main(int i) {
			return getRuleContext(MainContext.class,i);
		}
		public LogicalinputContext logicalinput() {
			return getRuleContext(LogicalinputContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
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
			setState(263);
			match(T__18);
			setState(264);
			match(LEFT);
			setState(267);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(265);
				logicalinput();
				}
				break;
			case 2:
				{
				setState(266);
				var();
				}
				break;
			}
			setState(269);
			match(RIGHT);
			setState(270);
			match(T__19);
			setState(271);
			main();
			setState(275);
			switch (_input.LA(1)) {
			case T__20:
				{
				setState(272);
				match(T__20);
				setState(273);
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
			setState(277);
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
			setState(279);
			match(T__22);
			setState(280);
			match(LEFT);
			setState(281);
			match(NAME);
			setState(282);
			match(T__23);
			setState(283);
			match(NAME);
			setState(284);
			match(RIGHT);
			setState(285);
			main();
			setState(286);
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
			setState(288);
			match(T__24);
			setState(289);
			match(LEFT);
			setState(290);
			match(NAME);
			setState(291);
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

	public static class IstautologyContext extends ParserRuleContext {
		public TerminalNode LEFT() { return getToken(RDPParser.LEFT, 0); }
		public TerminalNode NAME() { return getToken(RDPParser.NAME, 0); }
		public TerminalNode RIGHT() { return getToken(RDPParser.RIGHT, 0); }
		public TerminalNode VAR() { return getToken(RDPParser.VAR, 0); }
		public IstautologyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_istautology; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RDPListener ) ((RDPListener)listener).enterIstautology(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RDPListener ) ((RDPListener)listener).exitIstautology(this);
		}
	}

	public final IstautologyContext istautology() throws RecognitionException {
		IstautologyContext _localctx = new IstautologyContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_istautology);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			match(T__25);
			setState(294);
			match(LEFT);
			setState(295);
			match(NAME);
			setState(296);
			match(RIGHT);
			setState(300);
			switch (_input.LA(1)) {
			case T__1:
				{
				{
				setState(297);
				match(T__1);
				setState(298);
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
			case T__25:
			case T__26:
			case T__27:
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

	public static class IsElentmondasContext extends ParserRuleContext {
		public TerminalNode LEFT() { return getToken(RDPParser.LEFT, 0); }
		public TerminalNode NAME() { return getToken(RDPParser.NAME, 0); }
		public TerminalNode RIGHT() { return getToken(RDPParser.RIGHT, 0); }
		public TerminalNode VAR() { return getToken(RDPParser.VAR, 0); }
		public IsElentmondasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_isElentmondas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RDPListener ) ((RDPListener)listener).enterIsElentmondas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RDPListener ) ((RDPListener)listener).exitIsElentmondas(this);
		}
	}

	public final IsElentmondasContext isElentmondas() throws RecognitionException {
		IsElentmondasContext _localctx = new IsElentmondasContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_isElentmondas);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			match(T__26);
			setState(303);
			match(LEFT);
			setState(304);
			match(NAME);
			setState(305);
			match(RIGHT);
			setState(309);
			switch (_input.LA(1)) {
			case T__1:
				{
				{
				setState(306);
				match(T__1);
				setState(307);
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
			case T__25:
			case T__26:
			case T__27:
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

	public static class IsKielegithetoContext extends ParserRuleContext {
		public TerminalNode LEFT() { return getToken(RDPParser.LEFT, 0); }
		public TerminalNode NAME() { return getToken(RDPParser.NAME, 0); }
		public TerminalNode RIGHT() { return getToken(RDPParser.RIGHT, 0); }
		public TerminalNode VAR() { return getToken(RDPParser.VAR, 0); }
		public IsKielegithetoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_isKielegitheto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RDPListener ) ((RDPListener)listener).enterIsKielegitheto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RDPListener ) ((RDPListener)listener).exitIsKielegitheto(this);
		}
	}

	public final IsKielegithetoContext isKielegitheto() throws RecognitionException {
		IsKielegithetoContext _localctx = new IsKielegithetoContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_isKielegitheto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			match(T__27);
			setState(312);
			match(LEFT);
			setState(313);
			match(NAME);
			setState(314);
			match(RIGHT);
			setState(318);
			switch (_input.LA(1)) {
			case T__1:
				{
				{
				setState(315);
				match(T__1);
				setState(316);
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
			case T__25:
			case T__26:
			case T__27:
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\62\u0143\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\7\2;\n\2\f\2\16\2>\13\2\3\2\3\2"+
		"\3\3\3\3\3\3\3\3\7\3F\n\3\f\3\16\3I\13\3\3\3\3\3\3\4\3\4\3\4\3\4\7\4Q"+
		"\n\4\f\4\16\4T\13\4\3\4\7\4W\n\4\f\4\16\4Z\13\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5q\n"+
		"\5\f\5\16\5t\13\5\3\5\3\5\5\5x\n\5\3\5\3\5\3\6\3\6\3\6\3\6\7\6\u0080\n"+
		"\6\f\6\16\6\u0083\13\6\3\6\3\6\3\6\3\6\5\6\u0089\n\6\3\7\3\7\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\7\b\u0093\n\b\f\b\16\b\u0096\13\b\5\b\u0098\n\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\5\t\u00a1\n\t\3\t\3\t\5\t\u00a5\n\t\3\n\3\n\3\n\3"+
		"\13\3\13\3\13\3\13\3\13\5\13\u00af\n\13\3\f\3\f\3\f\3\f\5\f\u00b5\n\f"+
		"\3\f\3\f\3\f\3\f\5\f\u00bb\n\f\3\f\3\f\3\f\5\f\u00c0\n\f\3\r\3\r\3\r\3"+
		"\r\5\r\u00c6\n\r\3\r\5\r\u00c9\n\r\3\16\3\16\3\16\5\16\u00ce\n\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20"+
		"\u00de\n\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22"+
		"\u00eb\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\5\24\u00fb\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0104"+
		"\n\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\5\27\u010e\n\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\5\27\u0116\n\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\5\32\u012f\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0138"+
		"\n\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u0141\n\34\3\34\2\2\35\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66\2\5\4\2##,"+
		",\3\2\t\n\4\2\5\5\7\b\u015a\28\3\2\2\2\4A\3\2\2\2\6L\3\2\2\2\b`\3\2\2"+
		"\2\n{\3\2\2\2\f\u008a\3\2\2\2\16\u0097\3\2\2\2\20\u00a4\3\2\2\2\22\u00a6"+
		"\3\2\2\2\24\u00ae\3\2\2\2\26\u00bf\3\2\2\2\30\u00c8\3\2\2\2\32\u00cd\3"+
		"\2\2\2\34\u00cf\3\2\2\2\36\u00d4\3\2\2\2 \u00df\3\2\2\2\"\u00e3\3\2\2"+
		"\2$\u00ec\3\2\2\2&\u00f3\3\2\2\2(\u00fc\3\2\2\2*\u0105\3\2\2\2,\u0109"+
		"\3\2\2\2.\u0119\3\2\2\2\60\u0122\3\2\2\2\62\u0127\3\2\2\2\64\u0130\3\2"+
		"\2\2\66\u0139\3\2\2\28<\5\4\3\29;\5\6\4\2:9\3\2\2\2;>\3\2\2\2<:\3\2\2"+
		"\2<=\3\2\2\2=?\3\2\2\2><\3\2\2\2?@\5\b\5\2@\3\3\2\2\2AG\7\37\2\2BF\5\20"+
		"\t\2CF\5\16\b\2DF\5\22\n\2EB\3\2\2\2EC\3\2\2\2ED\3\2\2\2FI\3\2\2\2GE\3"+
		"\2\2\2GH\3\2\2\2HJ\3\2\2\2IG\3\2\2\2JK\7 \2\2K\5\3\2\2\2LM\7!\2\2MN\7"+
		"#\2\2NR\7&\2\2OQ\5\20\t\2PO\3\2\2\2QT\3\2\2\2RP\3\2\2\2RS\3\2\2\2SX\3"+
		"\2\2\2TR\3\2\2\2UW\5\16\b\2VU\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y["+
		"\3\2\2\2ZX\3\2\2\2[\\\7\'\2\2\\]\5\4\3\2]^\5\b\5\2^_\7\"\2\2_\7\3\2\2"+
		"\2`r\7(\2\2aq\5\34\17\2bq\5\36\20\2cq\5 \21\2dq\5\"\22\2eq\5$\23\2fq\5"+
		"&\24\2gq\5\n\6\2hq\5(\25\2iq\5.\30\2jq\5,\27\2kq\5\60\31\2lq\5\62\32\2"+
		"mq\5\64\33\2nq\5\66\34\2oq\7#\2\2pa\3\2\2\2pb\3\2\2\2pc\3\2\2\2pd\3\2"+
		"\2\2pe\3\2\2\2pf\3\2\2\2pg\3\2\2\2ph\3\2\2\2pi\3\2\2\2pj\3\2\2\2pk\3\2"+
		"\2\2pl\3\2\2\2pm\3\2\2\2pn\3\2\2\2po\3\2\2\2qt\3\2\2\2rp\3\2\2\2rs\3\2"+
		"\2\2sw\3\2\2\2tr\3\2\2\2ux\5*\26\2vx\3\2\2\2wu\3\2\2\2wv\3\2\2\2xy\3\2"+
		"\2\2yz\7)\2\2z\t\3\2\2\2{|\7\3\2\2|}\7#\2\2}\u0081\7&\2\2~\u0080\7#\2"+
		"\2\177~\3\2\2\2\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2"+
		"\2\2\u0082\u0084\3\2\2\2\u0083\u0081\3\2\2\2\u0084\u0088\7\'\2\2\u0085"+
		"\u0086\7\4\2\2\u0086\u0089\t\2\2\2\u0087\u0089\3\2\2\2\u0088\u0085\3\2"+
		"\2\2\u0088\u0087\3\2\2\2\u0089\13\3\2\2\2\u008a\u008b\7+\2\2\u008b\r\3"+
		"\2\2\2\u008c\u008d\7\5\2\2\u008d\u0098\7#\2\2\u008e\u008f\7\5\2\2\u008f"+
		"\u0090\7#\2\2\u0090\u0094\7\6\2\2\u0091\u0093\5\20\t\2\u0092\u0091\3\2"+
		"\2\2\u0093\u0096\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095"+
		"\u0098\3\2\2\2\u0096\u0094\3\2\2\2\u0097\u008c\3\2\2\2\u0097\u008e\3\2"+
		"\2\2\u0098\17\3\2\2\2\u0099\u009a\7\7\2\2\u009a\u009b\7#\2\2\u009b\u00a0"+
		"\7\6\2\2\u009c\u00a1\5\26\f\2\u009d\u00a1\5\30\r\2\u009e\u00a1\5\24\13"+
		"\2\u009f\u00a1\3\2\2\2\u00a0\u009c\3\2\2\2\u00a0\u009d\3\2\2\2\u00a0\u009e"+
		"\3\2\2\2\u00a0\u009f\3\2\2\2\u00a1\u00a5\3\2\2\2\u00a2\u00a3\7\7\2\2\u00a3"+
		"\u00a5\7#\2\2\u00a4\u0099\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5\21\3\2\2\2"+
		"\u00a6\u00a7\7\b\2\2\u00a7\u00a8\5\24\13\2\u00a8\23\3\2\2\2\u00a9\u00aa"+
		"\7,\2\2\u00aa\u00ab\7\6\2\2\u00ab\u00af\t\3\2\2\u00ac\u00af\7,\2\2\u00ad"+
		"\u00af\3\2\2\2\u00ae\u00a9\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00ad\3\2"+
		"\2\2\u00af\25\3\2\2\2\u00b0\u00b4\7&\2\2\u00b1\u00b5\5\24\13\2\u00b2\u00b5"+
		"\5\30\r\2\u00b3\u00b5\5\26\f\2\u00b4\u00b1\3\2\2\2\u00b4\u00b2\3\2\2\2"+
		"\u00b4\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00ba\7\60\2\2\u00b7\u00bb"+
		"\5\24\13\2\u00b8\u00bb\5\30\r\2\u00b9\u00bb\5\26\f\2\u00ba\u00b7\3\2\2"+
		"\2\u00ba\u00b8\3\2\2\2\u00ba\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd"+
		"\7\'\2\2\u00bd\u00c0\3\2\2\2\u00be\u00c0\3\2\2\2\u00bf\u00b0\3\2\2\2\u00bf"+
		"\u00be\3\2\2\2\u00c0\27\3\2\2\2\u00c1\u00c5\7-\2\2\u00c2\u00c6\5\24\13"+
		"\2\u00c3\u00c6\5\30\r\2\u00c4\u00c6\5\26\f\2\u00c5\u00c2\3\2\2\2\u00c5"+
		"\u00c3\3\2\2\2\u00c5\u00c4\3\2\2\2\u00c6\u00c9\3\2\2\2\u00c7\u00c9\3\2"+
		"\2\2\u00c8\u00c1\3\2\2\2\u00c8\u00c7\3\2\2\2\u00c9\31\3\2\2\2\u00ca\u00ce"+
		"\5\26\f\2\u00cb\u00ce\5\30\r\2\u00cc\u00ce\5\24\13\2\u00cd\u00ca\3\2\2"+
		"\2\u00cd\u00cb\3\2\2\2\u00cd\u00cc\3\2\2\2\u00ce\33\3\2\2\2\u00cf\u00d0"+
		"\7\13\2\2\u00d0\u00d1\7&\2\2\u00d1\u00d2\t\2\2\2\u00d2\u00d3\7\'\2\2\u00d3"+
		"\35\3\2\2\2\u00d4\u00dd\7\f\2\2\u00d5\u00d6\7&\2\2\u00d6\u00d7\t\2\2\2"+
		"\u00d7\u00de\7\'\2\2\u00d8\u00d9\7&\2\2\u00d9\u00da\7\r\2\2\u00da\u00db"+
		"\7\62\2\2\u00db\u00dc\7\r\2\2\u00dc\u00de\7\'\2\2\u00dd\u00d5\3\2\2\2"+
		"\u00dd\u00d8\3\2\2\2\u00de\37\3\2\2\2\u00df\u00e0\7\16\2\2\u00e0\u00e1"+
		"\7&\2\2\u00e1\u00e2\7\'\2\2\u00e2!\3\2\2\2\u00e3\u00e4\7\17\2\2\u00e4"+
		"\u00e5\7&\2\2\u00e5\u00e6\t\2\2\2\u00e6\u00ea\7\'\2\2\u00e7\u00e8\7\4"+
		"\2\2\u00e8\u00eb\7,\2\2\u00e9\u00eb\3\2\2\2\u00ea\u00e7\3\2\2\2\u00ea"+
		"\u00e9\3\2\2\2\u00eb#\3\2\2\2\u00ec\u00ed\7\20\2\2\u00ed\u00ee\7&\2\2"+
		"\u00ee\u00ef\7#\2\2\u00ef\u00f0\7\21\2\2\u00f0\u00f1\7#\2\2\u00f1\u00f2"+
		"\7\'\2\2\u00f2%\3\2\2\2\u00f3\u00f4\7\22\2\2\u00f4\u00f5\7&\2\2\u00f5"+
		"\u00f6\7#\2\2\u00f6\u00fa\7\'\2\2\u00f7\u00f8\7\4\2\2\u00f8\u00fb\7#\2"+
		"\2\u00f9\u00fb\3\2\2\2\u00fa\u00f7\3\2\2\2\u00fa\u00f9\3\2\2\2\u00fb\'"+
		"\3\2\2\2\u00fc\u00fd\7\23\2\2\u00fd\u00fe\7&\2\2\u00fe\u00ff\5\32\16\2"+
		"\u00ff\u0103\7\'\2\2\u0100\u0101\7\4\2\2\u0101\u0104\7#\2\2\u0102\u0104"+
		"\3\2\2\2\u0103\u0100\3\2\2\2\u0103\u0102\3\2\2\2\u0104)\3\2\2\2\u0105"+
		"\u0106\7\24\2\2\u0106\u0107\t\4\2\2\u0107\u0108\t\2\2\2\u0108+\3\2\2\2"+
		"\u0109\u010a\7\25\2\2\u010a\u010d\7&\2\2\u010b\u010e\5\32\16\2\u010c\u010e"+
		"\5\24\13\2\u010d\u010b\3\2\2\2\u010d\u010c\3\2\2\2\u010e\u010f\3\2\2\2"+
		"\u010f\u0110\7\'\2\2\u0110\u0111\7\26\2\2\u0111\u0115\5\b\5\2\u0112\u0113"+
		"\7\27\2\2\u0113\u0116\5\b\5\2\u0114\u0116\3\2\2\2\u0115\u0112\3\2\2\2"+
		"\u0115\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0118\7\30\2\2\u0118-\3"+
		"\2\2\2\u0119\u011a\7\31\2\2\u011a\u011b\7&\2\2\u011b\u011c\7#\2\2\u011c"+
		"\u011d\7\32\2\2\u011d\u011e\7#\2\2\u011e\u011f\7\'\2\2\u011f\u0120\5\b"+
		"\5\2\u0120\u0121\7\30\2\2\u0121/\3\2\2\2\u0122\u0123\7\33\2\2\u0123\u0124"+
		"\7&\2\2\u0124\u0125\7#\2\2\u0125\u0126\7\'\2\2\u0126\61\3\2\2\2\u0127"+
		"\u0128\7\34\2\2\u0128\u0129\7&\2\2\u0129\u012a\7#\2\2\u012a\u012e\7\'"+
		"\2\2\u012b\u012c\7\4\2\2\u012c\u012f\7,\2\2\u012d\u012f\3\2\2\2\u012e"+
		"\u012b\3\2\2\2\u012e\u012d\3\2\2\2\u012f\63\3\2\2\2\u0130\u0131\7\35\2"+
		"\2\u0131\u0132\7&\2\2\u0132\u0133\7#\2\2\u0133\u0137\7\'\2\2\u0134\u0135"+
		"\7\4\2\2\u0135\u0138\7,\2\2\u0136\u0138\3\2\2\2\u0137\u0134\3\2\2\2\u0137"+
		"\u0136\3\2\2\2\u0138\65\3\2\2\2\u0139\u013a\7\36\2\2\u013a\u013b\7&\2"+
		"\2\u013b\u013c\7#\2\2\u013c\u0140\7\'\2\2\u013d\u013e\7\4\2\2\u013e\u0141"+
		"\7,\2\2\u013f\u0141\3\2\2\2\u0140\u013d\3\2\2\2\u0140\u013f\3\2\2\2\u0141"+
		"\67\3\2\2\2 <EGRXprw\u0081\u0088\u0094\u0097\u00a0\u00a4\u00ae\u00b4\u00ba"+
		"\u00bf\u00c5\u00c8\u00cd\u00dd\u00ea\u00fa\u0103\u010d\u0115\u012e\u0137"+
		"\u0140";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}