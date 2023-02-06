// Generated from Manco.g4 by ANTLR 4.7.1
package parser;

	import java.util.Scanner;
	import datastructures.Symbol;
	import datastructures.Variable;
	import datastructures.SymbolTable;
	import exceptions.SemanticException;
	import java.util.ArrayList;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MancoParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, MAIOR=13, MENOR=14, IGUAL=15, DIF=16, MAIORIGUAL=17, 
		MENORIGUAL=18, SOM=19, SUB=20, MUL=21, DIV=22, AP=23, FP=24, SC=25, ATTR=26, 
		VIR=27, ACH=28, FCH=29, ID=30, PALAVRAS=31, NUMBER=32, WS=33;
	public static final int
		RULE_prog = 0, RULE_bloco = 1, RULE_cmd = 2, RULE_cmddecl = 3, RULE_declaravar = 4, 
		RULE_tipo = 5, RULE_cmdleitura = 6, RULE_cmdescrita = 7, RULE_texto = 8, 
		RULE_cmdattrib = 9, RULE_cmdpara = 10, RULE_cmdenquanto = 11, RULE_cmdfacaenquanto = 12, 
		RULE_cmdsesenao = 13, RULE_expr = 14, RULE_termo = 15, RULE_op = 16, RULE_oprel = 17;
	public static final String[] ruleNames = {
		"prog", "bloco", "cmd", "cmddecl", "declaravar", "tipo", "cmdleitura", 
		"cmdescrita", "texto", "cmdattrib", "cmdpara", "cmdenquanto", "cmdfacaenquanto", 
		"cmdsesenao", "expr", "termo", "op", "oprel"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'programa'", "'fimprog'", "'numero'", "'texto'", "'leia'", "'escreva'", 
		"'para'", "'++'", "'enquanto'", "'faca'", "'se'", "'senao'", "'>'", "'<'", 
		"'=='", "'!='", "'>='", "'<='", "'+'", "'-'", "'*'", "'/'", "'('", "')'", 
		"';'", "'='", "','", "'{'", "'}'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "MAIOR", "MENOR", "IGUAL", "DIF", "MAIORIGUAL", "MENORIGUAL", "SOM", 
		"SUB", "MUL", "DIV", "AP", "FP", "SC", "ATTR", "VIR", "ACH", "FCH", "ID", 
		"PALAVRAS", "NUMBER", "WS"
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
	public String getGrammarFileName() { return "Manco.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


		Boolean sin;
		Boolean resp = true;
		String teste;
	 	String contaSt = "";
	 	String logicSt = "";
		String  l;
		int 	igual;
		int n;	
		private int _tipo;
		private String _varName;
		private String _varValue;
		private String chave;
		private String chaveR;
		private SymbolTable symbolTable = new SymbolTable();
		private Symbol symbol;
		private Variable variable;
		
		public void verificaID(String id){
			if(!symbolTable.exists(id)){
				throw new SemanticException("Symbol " +id+ " not declared!!!");
			}
		}
		
		public void atribuirValor (String id, Variable newVariable){
			symbolTable.mudarValor(id,newVariable);
		}

	public MancoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MancoListener ) ((MancoListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MancoListener ) ((MancoListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(T__0);
			setState(37);
			bloco();
			setState(38);
			match(T__1);
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

	public static class BlocoContext extends ParserRuleContext {
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public BlocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloco; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MancoListener ) ((MancoListener)listener).enterBloco(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MancoListener ) ((MancoListener)listener).exitBloco(this);
		}
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_bloco);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(40);
				cmd();
				}
				}
				setState(43); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << ID))) != 0) );
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

	public static class CmdContext extends ParserRuleContext {
		public CmddeclContext cmddecl() {
			return getRuleContext(CmddeclContext.class,0);
		}
		public CmdleituraContext cmdleitura() {
			return getRuleContext(CmdleituraContext.class,0);
		}
		public CmdescritaContext cmdescrita() {
			return getRuleContext(CmdescritaContext.class,0);
		}
		public CmdattribContext cmdattrib() {
			return getRuleContext(CmdattribContext.class,0);
		}
		public CmdsesenaoContext cmdsesenao() {
			return getRuleContext(CmdsesenaoContext.class,0);
		}
		public CmdparaContext cmdpara() {
			return getRuleContext(CmdparaContext.class,0);
		}
		public CmdenquantoContext cmdenquanto() {
			return getRuleContext(CmdenquantoContext.class,0);
		}
		public CmdfacaenquantoContext cmdfacaenquanto() {
			return getRuleContext(CmdfacaenquantoContext.class,0);
		}
		public CmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MancoListener ) ((MancoListener)listener).enterCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MancoListener ) ((MancoListener)listener).exitCmd(this);
		}
	}

	public final CmdContext cmd() throws RecognitionException {
		CmdContext _localctx = new CmdContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_cmd);
		try {
			setState(53);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(45);
				cmddecl();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(46);
				cmdleitura();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 3);
				{
				setState(47);
				cmdescrita();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(48);
				cmdattrib();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 5);
				{
				setState(49);
				cmdsesenao();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 6);
				{
				setState(50);
				cmdpara();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 7);
				{
				setState(51);
				cmdenquanto();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 8);
				{
				setState(52);
				cmdfacaenquanto();
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

	public static class CmddeclContext extends ParserRuleContext {
		public List<DeclaravarContext> declaravar() {
			return getRuleContexts(DeclaravarContext.class);
		}
		public DeclaravarContext declaravar(int i) {
			return getRuleContext(DeclaravarContext.class,i);
		}
		public CmddeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmddecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MancoListener ) ((MancoListener)listener).enterCmddecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MancoListener ) ((MancoListener)listener).exitCmddecl(this);
		}
	}

	public final CmddeclContext cmddecl() throws RecognitionException {
		CmddeclContext _localctx = new CmddeclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_cmddecl);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(56); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(55);
					declaravar();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(58); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class DeclaravarContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(MancoParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MancoParser.ID, i);
		}
		public TerminalNode SC() { return getToken(MancoParser.SC, 0); }
		public List<TerminalNode> VIR() { return getTokens(MancoParser.VIR); }
		public TerminalNode VIR(int i) {
			return getToken(MancoParser.VIR, i);
		}
		public DeclaravarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaravar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MancoListener ) ((MancoListener)listener).enterDeclaravar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MancoListener ) ((MancoListener)listener).exitDeclaravar(this);
		}
	}

	public final DeclaravarContext declaravar() throws RecognitionException {
		DeclaravarContext _localctx = new DeclaravarContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declaravar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			tipo();
			setState(61);
			match(ID);


			if(resp){
										_varName = _input.LT(-1).getText();
										_varValue = null;
										variable = new Variable(_varName, _tipo, _varValue);
								
										if (!symbolTable.exists(_varName)){
											symbolTable.add(variable);
											System.out.println("Variavel declarada: "+variable);
										}
										else{
											throw new SemanticException("Symbol " + _varName + " already declared" );
										}
			}
								   
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIR) {
				{
				{
				setState(63);
				match(VIR);
				setState(64);
				match(ID);

				if(resp){
											_varName = _input.LT(-1).getText();
											_varValue = null;
											variable = new Variable(_varName, _tipo, _varValue);
									
											if (!symbolTable.exists(_varName)){
												symbolTable.add(variable);
												System.out.println("Variavel declarada: "+variable);
											}
											else{
												throw new SemanticException("Symbol " + _varName + " already declared" );
											}
				}
									   
				}
				}
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(71);
			match(SC);
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

	public static class TipoContext extends ParserRuleContext {
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MancoListener ) ((MancoListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MancoListener ) ((MancoListener)listener).exitTipo(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_tipo);
		try {
			setState(77);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				match(T__2);
				 
				if(resp){
										_tipo = Variable.NUMBER;
				}
										
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(75);
				match(T__3);
				 
				if(resp){
										_tipo = Variable.TEXT ;
				}
											
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

	public static class CmdleituraContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(MancoParser.AP, 0); }
		public TerminalNode ID() { return getToken(MancoParser.ID, 0); }
		public TerminalNode FP() { return getToken(MancoParser.FP, 0); }
		public TerminalNode SC() { return getToken(MancoParser.SC, 0); }
		public CmdleituraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdleitura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MancoListener ) ((MancoListener)listener).enterCmdleitura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MancoListener ) ((MancoListener)listener).exitCmdleitura(this);
		}
	}

	public final CmdleituraContext cmdleitura() throws RecognitionException {
		CmdleituraContext _localctx = new CmdleituraContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_cmdleitura);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(T__4);
			setState(80);
			match(AP);
			setState(81);
			match(ID);
			 
			if(resp){
									chave = _input.LT(-1).getText();
									verificaID(chave);
									
									Scanner ler = new Scanner(System.in);
									
									_tipo =symbolTable.getTipo(chave);
									
										if(_tipo == 0){
												n = ler.nextInt();
												l = Integer.toString(n);								//converte para String o valor de n 
												variable = new Variable(chave, _tipo, l);
												atribuirValor (chave, variable);
										}else{
												l = ler.nextLine();
												variable = new Variable(chave, _tipo, l);
												atribuirValor (chave, variable);
										}	
			}
						   
			setState(83);
			match(FP);
			setState(84);
			match(SC);
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

	public static class CmdescritaContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(MancoParser.AP, 0); }
		public TextoContext texto() {
			return getRuleContext(TextoContext.class,0);
		}
		public TerminalNode FP() { return getToken(MancoParser.FP, 0); }
		public TerminalNode SC() { return getToken(MancoParser.SC, 0); }
		public CmdescritaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdescrita; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MancoListener ) ((MancoListener)listener).enterCmdescrita(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MancoListener ) ((MancoListener)listener).exitCmdescrita(this);
		}
	}

	public final CmdescritaContext cmdescrita() throws RecognitionException {
		CmdescritaContext _localctx = new CmdescritaContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_cmdescrita);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(T__5);
			setState(87);
			match(AP);
			setState(88);
			texto();
			setState(89);
			match(FP);
			setState(90);
			match(SC);
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

	public static class TextoContext extends ParserRuleContext {
		public List<TerminalNode> PALAVRAS() { return getTokens(MancoParser.PALAVRAS); }
		public TerminalNode PALAVRAS(int i) {
			return getToken(MancoParser.PALAVRAS, i);
		}
		public List<TerminalNode> ID() { return getTokens(MancoParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MancoParser.ID, i);
		}
		public TextoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_texto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MancoListener ) ((MancoListener)listener).enterTexto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MancoListener ) ((MancoListener)listener).exitTexto(this);
		}
	}

	public final TextoContext texto() throws RecognitionException {
		TextoContext _localctx = new TextoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_texto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID || _la==PALAVRAS) {
				{
				setState(96);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PALAVRAS:
					{
					setState(92);
					match(PALAVRAS);
							
					if(resp){
										_varValue = _input.LT(-1).getText();
										_varValue = _varValue.replaceAll( "~", "");             //Retira todos os caracters "~" da String
										System.out.print(_varValue);							//printa o valor escrito no comando escreva() do meu compilador
					}
								
					}
					break;
				case ID:
					{
					setState(94);
					match(ID);
					 
					if(resp){
											chave = _input.LT(-1).getText();
											verificaID(chave); 
											
											_varValue = symbolTable.getValue(chave);
											System.out.println(_varValue);						//printa o valor escrito no comando escreva() do meu compilador
					}
								  
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(100);
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

	public static class CmdattribContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MancoParser.ID, 0); }
		public TerminalNode ATTR() { return getToken(MancoParser.ATTR, 0); }
		public TerminalNode SC() { return getToken(MancoParser.SC, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PALAVRAS() { return getToken(MancoParser.PALAVRAS, 0); }
		public CmdattribContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdattrib; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MancoListener ) ((MancoListener)listener).enterCmdattrib(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MancoListener ) ((MancoListener)listener).exitCmdattrib(this);
		}
	}

	public final CmdattribContext cmdattrib() throws RecognitionException {
		CmdattribContext _localctx = new CmdattribContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_cmdattrib);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(ID);
			 
			if(resp){
									chaveR = _input.LT(-1).getText();
									verificaID(chaveR);       {/*verifica se for declarado */}
			}
							 
			setState(103);
			match(ATTR);
			setState(109);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
			case NUMBER:
				{
				setState(104);
				expr();

				if(resp){
										if(symbolTable.getTipo(chaveR) == 0 && !_varValue.contains(".") && !_varValue.contains(",")){
												//atribuição de valor do tipo numeral				
												_tipo = symbolTable.getTipo(chaveR);
												variable = new Variable(chaveR, _tipo, _varValue);
												atribuirValor (chaveR, variable);
												System.out.println("Variavel possui novo valor: "+variable);
										}
										else if (symbolTable.getTipo(chaveR) == 0 && (_varValue.contains(".") ||_varValue.contains(","))){
												throw new SemanticException("A atribuição não é permitida, insira apenas números inteiros!!" );
										}
										else{
												throw new SemanticException("A atribuição não é permitida, tipo de variavel incompativel!!" );
										}
				}		
								
				}
				break;
			case PALAVRAS:
				{
				setState(107);
				match(PALAVRAS);
					
				if(resp){	
										_tipo = symbolTable.getTipo(chaveR);
										
										if(_tipo == 1){
												//atribuição de valor do tipo texto
												_varValue = _input.LT(-1).getText();
												_varValue = _varValue.replaceAll( "~", "");             //Retira todos os caracters "~" da String
										
												variable = new Variable(chaveR, _tipo, _varValue);
												atribuirValor (chaveR, variable);
												System.out.println("Variavel possui novo valor: "+variable);
										}else{
												throw new SemanticException("A atribuição não é permitida, tipo de variavel incompativel!!" );
											}
				}	
								
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(111);
			match(SC);
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

	public static class CmdparaContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(MancoParser.AP, 0); }
		public List<TermoContext> termo() {
			return getRuleContexts(TermoContext.class);
		}
		public TermoContext termo(int i) {
			return getRuleContext(TermoContext.class,i);
		}
		public OprelContext oprel() {
			return getRuleContext(OprelContext.class,0);
		}
		public TerminalNode FP() { return getToken(MancoParser.FP, 0); }
		public TerminalNode ACH() { return getToken(MancoParser.ACH, 0); }
		public TerminalNode FCH() { return getToken(MancoParser.FCH, 0); }
		public CmdattribContext cmdattrib() {
			return getRuleContext(CmdattribContext.class,0);
		}
		public TerminalNode SC() { return getToken(MancoParser.SC, 0); }
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CmdparaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdpara; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MancoListener ) ((MancoListener)listener).enterCmdpara(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MancoListener ) ((MancoListener)listener).exitCmdpara(this);
		}
	}

	public final CmdparaContext cmdpara() throws RecognitionException {
		CmdparaContext _localctx = new CmdparaContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_cmdpara);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(T__6);
			setState(114);
			match(AP);
			setState(116);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(115);
				cmdattrib();
				}
				break;
			}
			setState(118);
			termo();
			setState(119);
			oprel();
			setState(120);
			termo();
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SC) {
				{
				setState(121);
				match(SC);
				setState(122);
				termo();
				setState(123);
				match(T__7);
				}
			}

			setState(127);
			match(FP);
			setState(128);
			match(ACH);
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << ID))) != 0)) {
				{
				setState(130); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(129);
					cmd();
					}
					}
					setState(132); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << ID))) != 0) );
				}
			}

			setState(136);
			match(FCH);
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

	public static class CmdenquantoContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(MancoParser.AP, 0); }
		public List<TermoContext> termo() {
			return getRuleContexts(TermoContext.class);
		}
		public TermoContext termo(int i) {
			return getRuleContext(TermoContext.class,i);
		}
		public OprelContext oprel() {
			return getRuleContext(OprelContext.class,0);
		}
		public TerminalNode FP() { return getToken(MancoParser.FP, 0); }
		public TerminalNode ACH() { return getToken(MancoParser.ACH, 0); }
		public TerminalNode FCH() { return getToken(MancoParser.FCH, 0); }
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CmdenquantoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdenquanto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MancoListener ) ((MancoListener)listener).enterCmdenquanto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MancoListener ) ((MancoListener)listener).exitCmdenquanto(this);
		}
	}

	public final CmdenquantoContext cmdenquanto() throws RecognitionException {
		CmdenquantoContext _localctx = new CmdenquantoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_cmdenquanto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(T__8);
			setState(139);
			match(AP);
			setState(140);
			termo();
			setState(141);
			oprel();
			setState(142);
			termo();
			setState(143);
			match(FP);
			setState(144);
			match(ACH);
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << ID))) != 0)) {
				{
				setState(146); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(145);
					cmd();
					}
					}
					setState(148); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << ID))) != 0) );
				}
			}

			setState(152);
			match(FCH);
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

	public static class CmdfacaenquantoContext extends ParserRuleContext {
		public TerminalNode ACH() { return getToken(MancoParser.ACH, 0); }
		public TerminalNode FCH() { return getToken(MancoParser.FCH, 0); }
		public TerminalNode AP() { return getToken(MancoParser.AP, 0); }
		public List<TermoContext> termo() {
			return getRuleContexts(TermoContext.class);
		}
		public TermoContext termo(int i) {
			return getRuleContext(TermoContext.class,i);
		}
		public OprelContext oprel() {
			return getRuleContext(OprelContext.class,0);
		}
		public TerminalNode FP() { return getToken(MancoParser.FP, 0); }
		public TerminalNode SC() { return getToken(MancoParser.SC, 0); }
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CmdfacaenquantoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdfacaenquanto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MancoListener ) ((MancoListener)listener).enterCmdfacaenquanto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MancoListener ) ((MancoListener)listener).exitCmdfacaenquanto(this);
		}
	}

	public final CmdfacaenquantoContext cmdfacaenquanto() throws RecognitionException {
		CmdfacaenquantoContext _localctx = new CmdfacaenquantoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_cmdfacaenquanto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(T__9);
			setState(155);
			match(ACH);
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << ID))) != 0)) {
				{
				setState(157); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(156);
					cmd();
					}
					}
					setState(159); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << ID))) != 0) );
				}
			}

			setState(163);
			match(FCH);
			setState(164);
			match(T__8);
			setState(165);
			match(AP);
			setState(166);
			termo();
			setState(167);
			oprel();
			setState(168);
			termo();
			setState(169);
			match(FP);
			setState(170);
			match(SC);
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

	public static class CmdsesenaoContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(MancoParser.AP, 0); }
		public List<TermoContext> termo() {
			return getRuleContexts(TermoContext.class);
		}
		public TermoContext termo(int i) {
			return getRuleContext(TermoContext.class,i);
		}
		public OprelContext oprel() {
			return getRuleContext(OprelContext.class,0);
		}
		public TerminalNode FP() { return getToken(MancoParser.FP, 0); }
		public List<TerminalNode> ACH() { return getTokens(MancoParser.ACH); }
		public TerminalNode ACH(int i) {
			return getToken(MancoParser.ACH, i);
		}
		public List<TerminalNode> FCH() { return getTokens(MancoParser.FCH); }
		public TerminalNode FCH(int i) {
			return getToken(MancoParser.FCH, i);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CmdsesenaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdsesenao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MancoListener ) ((MancoListener)listener).enterCmdsesenao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MancoListener ) ((MancoListener)listener).exitCmdsesenao(this);
		}
	}

	public final CmdsesenaoContext cmdsesenao() throws RecognitionException {
		CmdsesenaoContext _localctx = new CmdsesenaoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_cmdsesenao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(T__10);
			setState(173);
			match(AP);
			setState(174);
			termo();
			setState(175);
			oprel();
			setState(176);
			termo();
			setState(177);
			match(FP);

			if(resp){
										//operações relacionais
							
										logicSt = logicSt.concat(_varValue);	 //concatena o ultimo termo da 'cmdsesenao'
				  						System.out.println(logicSt);			 //printa a expressão relacional
							
										int metad;
				  						int tot;
				  						int aux3;
				  						int aux4;
						
										//MAIOR
				  						if(logicSt.contains(">")){ 
				  							metad = logicSt.indexOf(">");
				  							tot  = logicSt.length();
				  							
				  							aux3 = Integer.parseInt(logicSt.substring(0, metad));
				  							aux4 = Integer.parseInt(logicSt.substring(metad+1, tot));
				  							
				  							if(aux3 > aux4){
				  								resp = true;
				  								sin = false;
				  							}
				  							else{
				  								resp = false;
				  								sin = true;
				  							}
				  						}
				  						//MENOR
				  						if(logicSt.contains("<")){ 
				  							metad = logicSt.indexOf("<");
				  							tot  = logicSt.length();
				  							
				  							aux3 = Integer.parseInt(logicSt.substring(0, metad));
				  							aux4 = Integer.parseInt(logicSt.substring(metad+1, tot));
				  							
				  							if(aux3 < aux4){
				  								resp = true;
				  								sin = false;
				  							}
				  							else{
				  								resp = false;
				  								sin = true;
				  							}
				  						}
				  						//MAIOR IGUAL
				  						if(logicSt.contains(">=")){ 
				  							metad = logicSt.indexOf(">=");
				  							tot  = logicSt.length();
				  							
				  							aux3 = Integer.parseInt(logicSt.substring(0, metad));
				  							aux4 = Integer.parseInt(logicSt.substring(metad+2, tot));
				  							
				  							if(aux3 >= aux4){
				  								resp = true;
				  								sin = false;
				  							}
				  							else{
				  								resp = false;
				  								sin = true;
				  							}
				  						}
				  						//MENOR IGUAL
				  						if(logicSt.contains("<=")){ 
				  							metad = logicSt.indexOf("<=");
				  							tot  = logicSt.length();
				  							
				  							aux3 = Integer.parseInt(logicSt.substring(0, metad));
				  							aux4 = Integer.parseInt(logicSt.substring(metad+2, tot));
				  							
				  							if(aux3 <= aux4){
				  								resp = true;
				  								sin = false;
				  							}
				  							else{
				  								resp = false;
				  								sin = true;
				  							}
				  						}
				  						//DIFERENTE
				  						if(logicSt.contains("!=")){ 
				  							metad = logicSt.indexOf("!=");
				  							tot  = logicSt.length();
				  							
				  							aux3 = Integer.parseInt(logicSt.substring(0, metad));
				  							aux4 = Integer.parseInt(logicSt.substring(metad+2, tot));
				  							
				  							if(aux3 != aux4){
				  								resp = true;
				  								sin = false;
				  								
				  							}
				  							else{
				  								resp = false;
				  								sin = true;
				  							}
				  						}
				  						//IGUAL
				  						if(logicSt.contains("==")){ 
				  							metad = logicSt.indexOf("==");
				  							tot  = logicSt.length();
				  							
				  							aux3 = Integer.parseInt(logicSt.substring(0, metad));
				  							aux4 = Integer.parseInt(logicSt.substring(metad+2, tot));
				  							
				  							if(aux3 == aux4){
				  								resp = true;
				  								sin = false;
				  							}
				  							else{
				  								resp = false;
				  								sin = true;

				  							}
				  						}
				  						
				  						
										logicSt = "";
			}
							
			setState(179);
			match(ACH);
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << ID))) != 0)) {
				{
				setState(181); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(180);
					cmd();
					}
					}
					setState(183); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << ID))) != 0) );
				}
			}

			setState(187);
			match(FCH);
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(188);
				match(T__11);

									if(resp == true && sin == false){
										resp = false;
									}
									if(resp == false && sin == true){
										resp = true;
									}
								
				setState(190);
				match(ACH);
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << ID))) != 0)) {
					{
					setState(192); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(191);
						cmd();
						}
						}
						setState(194); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << ID))) != 0) );
					}
				}

				setState(198);
				match(FCH);
				}
			}

			resp = true;
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

	public static class ExprContext extends ParserRuleContext {
		public List<TermoContext> termo() {
			return getRuleContexts(TermoContext.class);
		}
		public TermoContext termo(int i) {
			return getRuleContext(TermoContext.class,i);
		}
		public List<OpContext> op() {
			return getRuleContexts(OpContext.class);
		}
		public OpContext op(int i) {
			return getRuleContext(OpContext.class,i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MancoListener ) ((MancoListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MancoListener ) ((MancoListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			termo();
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SOM) | (1L << SUB) | (1L << MUL) | (1L << DIV))) != 0)) {
				{
				{
				setState(204);
				op();
				setState(205);
				termo();
				}
				}
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

			if(resp){
										//operações aritmeticas
										
				  						contaSt = contaSt.concat(_varValue);	 //concatena o ultimo termo da 'expr'
				  						System.out.println(contaSt);			 //printa a expressão aritmetica e os valores atribuidos as variaveis 
				  						
				  						int metade;
				  						int total;
				  						int aux1;
				  						int aux2;
				  						
				  						//soma
				  						if(contaSt.contains("+")){ 
				  							metade = contaSt.indexOf("+");
				  							total  = contaSt.length();
				  							
				  							aux1 = Integer.parseInt(contaSt.substring(0, metade));
				  							aux2 = Integer.parseInt(contaSt.substring(metade+1, total));
				  							igual = aux1 + aux2;
				  							_varValue = Integer.toString(igual);
				  								
				  						}
				  						//subtração
				  						if(contaSt.contains("-")){ 
				  							metade = contaSt.indexOf("-");
				  							total  = contaSt.length();
				  							
				  							aux1 = Integer.parseInt(contaSt.substring(0, metade));
				  							aux2 = Integer.parseInt(contaSt.substring(metade+1, total));
				  							igual = aux1 - aux2;
				  							_varValue = Integer.toString(igual);
				  								
				  						}
				  						//multiplicação
				  						if(contaSt.contains("*")){ 
				  							metade = contaSt.indexOf("*");
				  							total  = contaSt.length();
				  							
				  							aux1 = Integer.parseInt(contaSt.substring(0, metade));
				  							aux2 = Integer.parseInt(contaSt.substring(metade+1, total));
				  							igual = aux1 * aux2;
				  							_varValue = Integer.toString(igual);
				  								
				  						}
				  						//divisão
				  						if(contaSt.contains("/")){ 
				  							metade = contaSt.indexOf("/");
				  							total  = contaSt.length();
				  							
				  							aux1 = Integer.parseInt(contaSt.substring(0, metade));
				  							aux2 = Integer.parseInt(contaSt.substring(metade+1, total));
				  							igual = aux1 / aux2;
				  							_varValue = Integer.toString(igual);
				  								
				  						}
				  						contaSt = "";	
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

	public static class TermoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MancoParser.ID, 0); }
		public TerminalNode NUMBER() { return getToken(MancoParser.NUMBER, 0); }
		public TermoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MancoListener ) ((MancoListener)listener).enterTermo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MancoListener ) ((MancoListener)listener).exitTermo(this);
		}
	}

	public final TermoContext termo() throws RecognitionException {
		TermoContext _localctx = new TermoContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_termo);
		try {
			setState(218);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(214);
				match(ID);
				 

				if(resp){
					  						chave = _input.LT(-1).getText();
					  						verificaID(chave);
											_varValue = symbolTable.getValue(chave);
				}
					 			   
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(216);
				match(NUMBER);

				if(resp){
					  						_varValue = _input.LT(-1).getText();
				}
					   			   
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

	public static class OpContext extends ParserRuleContext {
		public TerminalNode SOM() { return getToken(MancoParser.SOM, 0); }
		public TerminalNode SUB() { return getToken(MancoParser.SUB, 0); }
		public TerminalNode MUL() { return getToken(MancoParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(MancoParser.DIV, 0); }
		public OpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MancoListener ) ((MancoListener)listener).enterOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MancoListener ) ((MancoListener)listener).exitOp(this);
		}
	}

	public final OpContext op() throws RecognitionException {
		OpContext _localctx = new OpContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_op);
		try {
			setState(228);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SOM:
				enterOuterAlt(_localctx, 1);
				{
				setState(220);
				match(SOM);

				 							contaSt = contaSt.concat(_varValue);
				 							contaSt = contaSt.concat("+");
								   
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 2);
				{
				setState(222);
				match(SUB);

				 				   			contaSt = contaSt.concat(_varValue);
				 				   			contaSt = contaSt.concat("-");
				 				   
				}
				break;
			case MUL:
				enterOuterAlt(_localctx, 3);
				{
				setState(224);
				match(MUL);

				 				   			contaSt = contaSt.concat(_varValue);
				 				   			contaSt = contaSt.concat("*");
				 				   
				}
				break;
			case DIV:
				enterOuterAlt(_localctx, 4);
				{
				setState(226);
				match(DIV);

				 				   			contaSt = contaSt.concat(_varValue);
				 				   			contaSt = contaSt.concat("/");
				 				   
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

	public static class OprelContext extends ParserRuleContext {
		public TerminalNode MAIOR() { return getToken(MancoParser.MAIOR, 0); }
		public TerminalNode MENOR() { return getToken(MancoParser.MENOR, 0); }
		public TerminalNode IGUAL() { return getToken(MancoParser.IGUAL, 0); }
		public TerminalNode DIF() { return getToken(MancoParser.DIF, 0); }
		public TerminalNode MAIORIGUAL() { return getToken(MancoParser.MAIORIGUAL, 0); }
		public TerminalNode MENORIGUAL() { return getToken(MancoParser.MENORIGUAL, 0); }
		public OprelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oprel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MancoListener ) ((MancoListener)listener).enterOprel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MancoListener ) ((MancoListener)listener).exitOprel(this);
		}
	}

	public final OprelContext oprel() throws RecognitionException {
		OprelContext _localctx = new OprelContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_oprel);
		try {
			setState(242);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAIOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(230);
				match(MAIOR);

				 							logicSt = logicSt.concat(_varValue);
				 							logicSt = logicSt.concat(">");
								   
				}
				break;
			case MENOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(232);
				match(MENOR);

				 							logicSt = logicSt.concat(_varValue);
				 							logicSt = logicSt.concat("<");
								   
				}
				break;
			case IGUAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(234);
				match(IGUAL);

				 							logicSt = logicSt.concat(_varValue);
				 							logicSt = logicSt.concat("==");
								   
				}
				break;
			case DIF:
				enterOuterAlt(_localctx, 4);
				{
				setState(236);
				match(DIF);

				 							logicSt = logicSt.concat(_varValue);
				 							logicSt = logicSt.concat("!=");
								   
				}
				break;
			case MAIORIGUAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(238);
				match(MAIORIGUAL);

				 							logicSt = logicSt.concat(_varValue);
				 							logicSt = logicSt.concat(">=");
								   
				}
				break;
			case MENORIGUAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(240);
				match(MENORIGUAL);

				 							logicSt = logicSt.concat(_varValue);
				 							logicSt = logicSt.concat("<=");
								   
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3#\u00f7\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\2\3\2\3\3\6\3,\n\3\r\3\16\3-\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\5\48\n\4\3\5\6\5;\n\5\r\5\16\5<\3\6\3\6\3\6\3\6\3\6\3\6\7"+
		"\6E\n\6\f\6\16\6H\13\6\3\6\3\6\3\7\3\7\3\7\3\7\5\7P\n\7\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\7\nc\n\n\f\n\16"+
		"\nf\13\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13p\n\13\3\13\3\13"+
		"\3\f\3\f\3\f\5\fw\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0080\n\f\3\f\3"+
		"\f\3\f\6\f\u0085\n\f\r\f\16\f\u0086\5\f\u0089\n\f\3\f\3\f\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\6\r\u0095\n\r\r\r\16\r\u0096\5\r\u0099\n\r\3\r\3"+
		"\r\3\16\3\16\3\16\6\16\u00a0\n\16\r\16\16\16\u00a1\5\16\u00a4\n\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\6\17\u00b8\n\17\r\17\16\17\u00b9\5\17\u00bc\n\17\3\17"+
		"\3\17\3\17\3\17\3\17\6\17\u00c3\n\17\r\17\16\17\u00c4\5\17\u00c7\n\17"+
		"\3\17\5\17\u00ca\n\17\3\17\3\17\3\20\3\20\3\20\3\20\7\20\u00d2\n\20\f"+
		"\20\16\20\u00d5\13\20\3\20\3\20\3\21\3\21\3\21\3\21\5\21\u00dd\n\21\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00e7\n\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00f5\n\23\3\23\2\2"+
		"\24\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$\2\2\2\u0109\2&\3\2\2\2"+
		"\4+\3\2\2\2\6\67\3\2\2\2\b:\3\2\2\2\n>\3\2\2\2\fO\3\2\2\2\16Q\3\2\2\2"+
		"\20X\3\2\2\2\22d\3\2\2\2\24g\3\2\2\2\26s\3\2\2\2\30\u008c\3\2\2\2\32\u009c"+
		"\3\2\2\2\34\u00ae\3\2\2\2\36\u00cd\3\2\2\2 \u00dc\3\2\2\2\"\u00e6\3\2"+
		"\2\2$\u00f4\3\2\2\2&\'\7\3\2\2\'(\5\4\3\2()\7\4\2\2)\3\3\2\2\2*,\5\6\4"+
		"\2+*\3\2\2\2,-\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\5\3\2\2\2/8\5\b\5\2\608\5"+
		"\16\b\2\618\5\20\t\2\628\5\24\13\2\638\5\34\17\2\648\5\26\f\2\658\5\30"+
		"\r\2\668\5\32\16\2\67/\3\2\2\2\67\60\3\2\2\2\67\61\3\2\2\2\67\62\3\2\2"+
		"\2\67\63\3\2\2\2\67\64\3\2\2\2\67\65\3\2\2\2\67\66\3\2\2\28\7\3\2\2\2"+
		"9;\5\n\6\2:9\3\2\2\2;<\3\2\2\2<:\3\2\2\2<=\3\2\2\2=\t\3\2\2\2>?\5\f\7"+
		"\2?@\7 \2\2@F\b\6\1\2AB\7\35\2\2BC\7 \2\2CE\b\6\1\2DA\3\2\2\2EH\3\2\2"+
		"\2FD\3\2\2\2FG\3\2\2\2GI\3\2\2\2HF\3\2\2\2IJ\7\33\2\2J\13\3\2\2\2KL\7"+
		"\5\2\2LP\b\7\1\2MN\7\6\2\2NP\b\7\1\2OK\3\2\2\2OM\3\2\2\2P\r\3\2\2\2QR"+
		"\7\7\2\2RS\7\31\2\2ST\7 \2\2TU\b\b\1\2UV\7\32\2\2VW\7\33\2\2W\17\3\2\2"+
		"\2XY\7\b\2\2YZ\7\31\2\2Z[\5\22\n\2[\\\7\32\2\2\\]\7\33\2\2]\21\3\2\2\2"+
		"^_\7!\2\2_c\b\n\1\2`a\7 \2\2ac\b\n\1\2b^\3\2\2\2b`\3\2\2\2cf\3\2\2\2d"+
		"b\3\2\2\2de\3\2\2\2e\23\3\2\2\2fd\3\2\2\2gh\7 \2\2hi\b\13\1\2io\7\34\2"+
		"\2jk\5\36\20\2kl\b\13\1\2lp\3\2\2\2mn\7!\2\2np\b\13\1\2oj\3\2\2\2om\3"+
		"\2\2\2pq\3\2\2\2qr\7\33\2\2r\25\3\2\2\2st\7\t\2\2tv\7\31\2\2uw\5\24\13"+
		"\2vu\3\2\2\2vw\3\2\2\2wx\3\2\2\2xy\5 \21\2yz\5$\23\2z\177\5 \21\2{|\7"+
		"\33\2\2|}\5 \21\2}~\7\n\2\2~\u0080\3\2\2\2\177{\3\2\2\2\177\u0080\3\2"+
		"\2\2\u0080\u0081\3\2\2\2\u0081\u0082\7\32\2\2\u0082\u0088\7\36\2\2\u0083"+
		"\u0085\5\6\4\2\u0084\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0084\3\2"+
		"\2\2\u0086\u0087\3\2\2\2\u0087\u0089\3\2\2\2\u0088\u0084\3\2\2\2\u0088"+
		"\u0089\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008b\7\37\2\2\u008b\27\3\2\2"+
		"\2\u008c\u008d\7\13\2\2\u008d\u008e\7\31\2\2\u008e\u008f\5 \21\2\u008f"+
		"\u0090\5$\23\2\u0090\u0091\5 \21\2\u0091\u0092\7\32\2\2\u0092\u0098\7"+
		"\36\2\2\u0093\u0095\5\6\4\2\u0094\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096"+
		"\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0099\3\2\2\2\u0098\u0094\3\2"+
		"\2\2\u0098\u0099\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009b\7\37\2\2\u009b"+
		"\31\3\2\2\2\u009c\u009d\7\f\2\2\u009d\u00a3\7\36\2\2\u009e\u00a0\5\6\4"+
		"\2\u009f\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2"+
		"\3\2\2\2\u00a2\u00a4\3\2\2\2\u00a3\u009f\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4"+
		"\u00a5\3\2\2\2\u00a5\u00a6\7\37\2\2\u00a6\u00a7\7\13\2\2\u00a7\u00a8\7"+
		"\31\2\2\u00a8\u00a9\5 \21\2\u00a9\u00aa\5$\23\2\u00aa\u00ab\5 \21\2\u00ab"+
		"\u00ac\7\32\2\2\u00ac\u00ad\7\33\2\2\u00ad\33\3\2\2\2\u00ae\u00af\7\r"+
		"\2\2\u00af\u00b0\7\31\2\2\u00b0\u00b1\5 \21\2\u00b1\u00b2\5$\23\2\u00b2"+
		"\u00b3\5 \21\2\u00b3\u00b4\7\32\2\2\u00b4\u00b5\b\17\1\2\u00b5\u00bb\7"+
		"\36\2\2\u00b6\u00b8\5\6\4\2\u00b7\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9"+
		"\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bc\3\2\2\2\u00bb\u00b7\3\2"+
		"\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00c9\7\37\2\2\u00be"+
		"\u00bf\7\16\2\2\u00bf\u00c0\b\17\1\2\u00c0\u00c6\7\36\2\2\u00c1\u00c3"+
		"\5\6\4\2\u00c2\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4"+
		"\u00c5\3\2\2\2\u00c5\u00c7\3\2\2\2\u00c6\u00c2\3\2\2\2\u00c6\u00c7\3\2"+
		"\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00ca\7\37\2\2\u00c9\u00be\3\2\2\2\u00c9"+
		"\u00ca\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc\b\17\1\2\u00cc\35\3\2\2"+
		"\2\u00cd\u00d3\5 \21\2\u00ce\u00cf\5\"\22\2\u00cf\u00d0\5 \21\2\u00d0"+
		"\u00d2\3\2\2\2\u00d1\u00ce\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d1\3\2"+
		"\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d6\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6"+
		"\u00d7\b\20\1\2\u00d7\37\3\2\2\2\u00d8\u00d9\7 \2\2\u00d9\u00dd\b\21\1"+
		"\2\u00da\u00db\7\"\2\2\u00db\u00dd\b\21\1\2\u00dc\u00d8\3\2\2\2\u00dc"+
		"\u00da\3\2\2\2\u00dd!\3\2\2\2\u00de\u00df\7\25\2\2\u00df\u00e7\b\22\1"+
		"\2\u00e0\u00e1\7\26\2\2\u00e1\u00e7\b\22\1\2\u00e2\u00e3\7\27\2\2\u00e3"+
		"\u00e7\b\22\1\2\u00e4\u00e5\7\30\2\2\u00e5\u00e7\b\22\1\2\u00e6\u00de"+
		"\3\2\2\2\u00e6\u00e0\3\2\2\2\u00e6\u00e2\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7"+
		"#\3\2\2\2\u00e8\u00e9\7\17\2\2\u00e9\u00f5\b\23\1\2\u00ea\u00eb\7\20\2"+
		"\2\u00eb\u00f5\b\23\1\2\u00ec\u00ed\7\21\2\2\u00ed\u00f5\b\23\1\2\u00ee"+
		"\u00ef\7\22\2\2\u00ef\u00f5\b\23\1\2\u00f0\u00f1\7\23\2\2\u00f1\u00f5"+
		"\b\23\1\2\u00f2\u00f3\7\24\2\2\u00f3\u00f5\b\23\1\2\u00f4\u00e8\3\2\2"+
		"\2\u00f4\u00ea\3\2\2\2\u00f4\u00ec\3\2\2\2\u00f4\u00ee\3\2\2\2\u00f4\u00f0"+
		"\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f5%\3\2\2\2\33-\67<FObdov\177\u0086\u0088"+
		"\u0096\u0098\u00a1\u00a3\u00b9\u00bb\u00c4\u00c6\u00c9\u00d3\u00dc\u00e6"+
		"\u00f4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}