// Generated from IsiLang.g4 by ANTLR 4.7.1
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
public class IsiLangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, SOM=9, 
		SUB=10, MUL=11, DIV=12, AP=13, FP=14, SC=15, OPREL=16, ATTR=17, VIR=18, 
		ACH=19, FCH=20, ID=21, PALAVRAS=22, NUMBER=23, WS=24;
	public static final int
		RULE_prog = 0, RULE_decl = 1, RULE_declaravar = 2, RULE_tipo = 3, RULE_bloco = 4, 
		RULE_cmd = 5, RULE_cmdleitura = 6, RULE_cmdescrita = 7, RULE_texto = 8, 
		RULE_cmdattrib = 9, RULE_cmdsesenao = 10, RULE_expr = 11, RULE_termo = 12, 
		RULE_op = 13;
	public static final String[] ruleNames = {
		"prog", "decl", "declaravar", "tipo", "bloco", "cmd", "cmdleitura", "cmdescrita", 
		"texto", "cmdattrib", "cmdsesenao", "expr", "termo", "op"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'programa'", "'fimprog'", "'numero'", "'texto'", "'leia'", "'escreva'", 
		"'se'", "'senao'", "'+'", "'-'", "'*'", "'/'", "'('", "')'", "';'", null, 
		"'='", "','", "'{'", "'}'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, "SOM", "SUB", "MUL", 
		"DIV", "AP", "FP", "SC", "OPREL", "ATTR", "VIR", "ACH", "FCH", "ID", "PALAVRAS", 
		"NUMBER", "WS"
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
	public String getGrammarFileName() { return "IsiLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	 	String contaSt = "";
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

	public IsiLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			match(T__0);
			setState(29);
			decl();
			setState(30);
			bloco();
			setState(31);
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

	public static class DeclContext extends ParserRuleContext {
		public List<DeclaravarContext> declaravar() {
			return getRuleContexts(DeclaravarContext.class);
		}
		public DeclaravarContext declaravar(int i) {
			return getRuleContext(DeclaravarContext.class,i);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitDecl(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(33);
				declaravar();
				}
				}
				setState(36); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__2 || _la==T__3 );
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
		public List<TerminalNode> ID() { return getTokens(IsiLangParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(IsiLangParser.ID, i);
		}
		public TerminalNode SC() { return getToken(IsiLangParser.SC, 0); }
		public List<TerminalNode> VIR() { return getTokens(IsiLangParser.VIR); }
		public TerminalNode VIR(int i) {
			return getToken(IsiLangParser.VIR, i);
		}
		public DeclaravarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaravar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterDeclaravar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitDeclaravar(this);
		}
	}

	public final DeclaravarContext declaravar() throws RecognitionException {
		DeclaravarContext _localctx = new DeclaravarContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaravar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			tipo();
			setState(39);
			match(ID);

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
								   
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIR) {
				{
				{
				setState(41);
				match(VIR);
				setState(42);
				match(ID);

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
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(49);
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
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitTipo(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_tipo);
		try {
			setState(55);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(51);
				match(T__2);
				 _tipo = Variable.NUMBER;
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(53);
				match(T__3);
				 _tipo = Variable.TEXT ;
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
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterBloco(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitBloco(this);
		}
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_bloco);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(57);
				cmd();
				}
				}
				setState(60); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << ID))) != 0) );
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
		public CmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitCmd(this);
		}
	}

	public final CmdContext cmd() throws RecognitionException {
		CmdContext _localctx = new CmdContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_cmd);
		try {
			setState(66);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				cmdleitura();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				cmdescrita();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(64);
				cmdattrib();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 4);
				{
				setState(65);
				cmdsesenao();
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
		public TerminalNode AP() { return getToken(IsiLangParser.AP, 0); }
		public TerminalNode ID() { return getToken(IsiLangParser.ID, 0); }
		public TerminalNode FP() { return getToken(IsiLangParser.FP, 0); }
		public TerminalNode SC() { return getToken(IsiLangParser.SC, 0); }
		public CmdleituraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdleitura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterCmdleitura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitCmdleitura(this);
		}
	}

	public final CmdleituraContext cmdleitura() throws RecognitionException {
		CmdleituraContext _localctx = new CmdleituraContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_cmdleitura);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(T__4);
			setState(69);
			match(AP);
			setState(70);
			match(ID);
			 
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
						   
			setState(72);
			match(FP);
			setState(73);
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
		public TerminalNode AP() { return getToken(IsiLangParser.AP, 0); }
		public TextoContext texto() {
			return getRuleContext(TextoContext.class,0);
		}
		public TerminalNode FP() { return getToken(IsiLangParser.FP, 0); }
		public TerminalNode SC() { return getToken(IsiLangParser.SC, 0); }
		public CmdescritaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdescrita; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterCmdescrita(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitCmdescrita(this);
		}
	}

	public final CmdescritaContext cmdescrita() throws RecognitionException {
		CmdescritaContext _localctx = new CmdescritaContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_cmdescrita);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(T__5);
			setState(76);
			match(AP);
			setState(77);
			texto();
			setState(78);
			match(FP);
			setState(79);
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
		public List<TerminalNode> PALAVRAS() { return getTokens(IsiLangParser.PALAVRAS); }
		public TerminalNode PALAVRAS(int i) {
			return getToken(IsiLangParser.PALAVRAS, i);
		}
		public List<TerminalNode> ID() { return getTokens(IsiLangParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(IsiLangParser.ID, i);
		}
		public TextoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_texto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterTexto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitTexto(this);
		}
	}

	public final TextoContext texto() throws RecognitionException {
		TextoContext _localctx = new TextoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_texto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID || _la==PALAVRAS) {
				{
				setState(85);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PALAVRAS:
					{
					setState(81);
					match(PALAVRAS);
							
										_varValue = _input.LT(-1).getText();
										_varValue = _varValue.replaceAll( "~", "");             //Retira todos os caracters "~" da String
										System.out.print(_varValue);
								
					}
					break;
				case ID:
					{
					setState(83);
					match(ID);
					 
											chave = _input.LT(-1).getText();
											verificaID(chave); 
											
											_varValue = symbolTable.getValue(chave);
											System.out.println(_varValue);
								  
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(89);
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
		public TerminalNode ID() { return getToken(IsiLangParser.ID, 0); }
		public TerminalNode ATTR() { return getToken(IsiLangParser.ATTR, 0); }
		public TerminalNode SC() { return getToken(IsiLangParser.SC, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PALAVRAS() { return getToken(IsiLangParser.PALAVRAS, 0); }
		public CmdattribContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdattrib; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterCmdattrib(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitCmdattrib(this);
		}
	}

	public final CmdattribContext cmdattrib() throws RecognitionException {
		CmdattribContext _localctx = new CmdattribContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_cmdattrib);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(ID);
			 
									chaveR = _input.LT(-1).getText();
									verificaID(chaveR);       {/*verifica se for declarado */}
							 
			setState(92);
			match(ATTR);
			setState(98);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
			case NUMBER:
				{
				setState(93);
				expr();

										if(symbolTable.getTipo(chaveR) == 0){
												//atribuição de valor do tipo numeral				
												_tipo = symbolTable.getTipo(chaveR);
												variable = new Variable(chaveR, _tipo, _varValue);
												atribuirValor (chaveR, variable);
												System.out.println("Variavel possui novo valor: "+variable);
										}else{
												throw new SemanticException("A atribuição não é permitida, tipo de variavel incompativel!!" );
										}		
								
				}
				break;
			case PALAVRAS:
				{
				setState(96);
				match(PALAVRAS);
						
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
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(100);
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
		public TerminalNode AP() { return getToken(IsiLangParser.AP, 0); }
		public List<TerminalNode> ID() { return getTokens(IsiLangParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(IsiLangParser.ID, i);
		}
		public TerminalNode OPREL() { return getToken(IsiLangParser.OPREL, 0); }
		public TerminalNode FP() { return getToken(IsiLangParser.FP, 0); }
		public List<TerminalNode> ACH() { return getTokens(IsiLangParser.ACH); }
		public TerminalNode ACH(int i) {
			return getToken(IsiLangParser.ACH, i);
		}
		public List<TerminalNode> FCH() { return getTokens(IsiLangParser.FCH); }
		public TerminalNode FCH(int i) {
			return getToken(IsiLangParser.FCH, i);
		}
		public TerminalNode NUMBER() { return getToken(IsiLangParser.NUMBER, 0); }
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
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterCmdsesenao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitCmdsesenao(this);
		}
	}

	public final CmdsesenaoContext cmdsesenao() throws RecognitionException {
		CmdsesenaoContext _localctx = new CmdsesenaoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_cmdsesenao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(T__6);
			setState(103);
			match(AP);
			setState(104);
			match(ID);
			setState(105);
			match(OPREL);
			setState(106);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(107);
			match(FP);
			setState(108);
			match(ACH);
			setState(110); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(109);
				cmd();
				}
				}
				setState(112); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << ID))) != 0) );
			setState(114);
			match(FCH);
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(115);
				match(T__7);
				setState(116);
				match(ACH);
				{
				setState(118); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(117);
					cmd();
					}
					}
					setState(120); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << ID))) != 0) );
				}
				setState(122);
				match(FCH);
				}
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
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			termo();
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SOM) | (1L << SUB) | (1L << MUL) | (1L << DIV))) != 0)) {
				{
				{
				setState(127);
				op();
				setState(128);
				termo();
				}
				}
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

										//operações aritmeticas
										
										
				  						contaSt = contaSt.concat(_varValue);	
				  						System.out.println(contaSt);
				  						
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
		public TerminalNode ID() { return getToken(IsiLangParser.ID, 0); }
		public TerminalNode NUMBER() { return getToken(IsiLangParser.NUMBER, 0); }
		public TermoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterTermo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitTermo(this);
		}
	}

	public final TermoContext termo() throws RecognitionException {
		TermoContext _localctx = new TermoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_termo);
		try {
			setState(141);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				match(ID);
				 
					  						chave = _input.LT(-1).getText();
					  						verificaID(chave);
											_varValue = symbolTable.getValue(chave);
					 			   
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
				match(NUMBER);

					  						_varValue = _input.LT(-1).getText();
					   			   
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
		public TerminalNode SOM() { return getToken(IsiLangParser.SOM, 0); }
		public TerminalNode SUB() { return getToken(IsiLangParser.SUB, 0); }
		public TerminalNode MUL() { return getToken(IsiLangParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(IsiLangParser.DIV, 0); }
		public OpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitOp(this);
		}
	}

	public final OpContext op() throws RecognitionException {
		OpContext _localctx = new OpContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_op);
		try {
			setState(151);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SOM:
				enterOuterAlt(_localctx, 1);
				{
				setState(143);
				match(SOM);

				 							contaSt = contaSt.concat(_varValue);
				 							contaSt = contaSt.concat("+");
								   
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				match(SUB);

				 				   			contaSt = contaSt.concat(_varValue);
				 				   			contaSt = contaSt.concat("-");
				 				   
				}
				break;
			case MUL:
				enterOuterAlt(_localctx, 3);
				{
				setState(147);
				match(MUL);

				 				   			contaSt = contaSt.concat(_varValue);
				 				   			contaSt = contaSt.concat("*");
				 				   
				}
				break;
			case DIV:
				enterOuterAlt(_localctx, 4);
				{
				setState(149);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\32\u009c\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\2\3\2\3\3\6\3"+
		"%\n\3\r\3\16\3&\3\4\3\4\3\4\3\4\3\4\3\4\7\4/\n\4\f\4\16\4\62\13\4\3\4"+
		"\3\4\3\5\3\5\3\5\3\5\5\5:\n\5\3\6\6\6=\n\6\r\6\16\6>\3\7\3\7\3\7\3\7\5"+
		"\7E\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3"+
		"\n\3\n\7\nX\n\n\f\n\16\n[\13\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\5\13e\n\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\6\fq\n\f\r\f\16"+
		"\fr\3\f\3\f\3\f\3\f\6\fy\n\f\r\f\16\fz\3\f\3\f\5\f\177\n\f\3\r\3\r\3\r"+
		"\3\r\7\r\u0085\n\r\f\r\16\r\u0088\13\r\3\r\3\r\3\16\3\16\3\16\3\16\5\16"+
		"\u0090\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u009a\n\17\3"+
		"\17\2\2\20\2\4\6\b\n\f\16\20\22\24\26\30\32\34\2\3\4\2\27\27\31\31\2\u009f"+
		"\2\36\3\2\2\2\4$\3\2\2\2\6(\3\2\2\2\b9\3\2\2\2\n<\3\2\2\2\fD\3\2\2\2\16"+
		"F\3\2\2\2\20M\3\2\2\2\22Y\3\2\2\2\24\\\3\2\2\2\26h\3\2\2\2\30\u0080\3"+
		"\2\2\2\32\u008f\3\2\2\2\34\u0099\3\2\2\2\36\37\7\3\2\2\37 \5\4\3\2 !\5"+
		"\n\6\2!\"\7\4\2\2\"\3\3\2\2\2#%\5\6\4\2$#\3\2\2\2%&\3\2\2\2&$\3\2\2\2"+
		"&\'\3\2\2\2\'\5\3\2\2\2()\5\b\5\2)*\7\27\2\2*\60\b\4\1\2+,\7\24\2\2,-"+
		"\7\27\2\2-/\b\4\1\2.+\3\2\2\2/\62\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61"+
		"\63\3\2\2\2\62\60\3\2\2\2\63\64\7\21\2\2\64\7\3\2\2\2\65\66\7\5\2\2\66"+
		":\b\5\1\2\678\7\6\2\28:\b\5\1\29\65\3\2\2\29\67\3\2\2\2:\t\3\2\2\2;=\5"+
		"\f\7\2<;\3\2\2\2=>\3\2\2\2><\3\2\2\2>?\3\2\2\2?\13\3\2\2\2@E\5\16\b\2"+
		"AE\5\20\t\2BE\5\24\13\2CE\5\26\f\2D@\3\2\2\2DA\3\2\2\2DB\3\2\2\2DC\3\2"+
		"\2\2E\r\3\2\2\2FG\7\7\2\2GH\7\17\2\2HI\7\27\2\2IJ\b\b\1\2JK\7\20\2\2K"+
		"L\7\21\2\2L\17\3\2\2\2MN\7\b\2\2NO\7\17\2\2OP\5\22\n\2PQ\7\20\2\2QR\7"+
		"\21\2\2R\21\3\2\2\2ST\7\30\2\2TX\b\n\1\2UV\7\27\2\2VX\b\n\1\2WS\3\2\2"+
		"\2WU\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z\23\3\2\2\2[Y\3\2\2\2\\]\7"+
		"\27\2\2]^\b\13\1\2^d\7\23\2\2_`\5\30\r\2`a\b\13\1\2ae\3\2\2\2bc\7\30\2"+
		"\2ce\b\13\1\2d_\3\2\2\2db\3\2\2\2ef\3\2\2\2fg\7\21\2\2g\25\3\2\2\2hi\7"+
		"\t\2\2ij\7\17\2\2jk\7\27\2\2kl\7\22\2\2lm\t\2\2\2mn\7\20\2\2np\7\25\2"+
		"\2oq\5\f\7\2po\3\2\2\2qr\3\2\2\2rp\3\2\2\2rs\3\2\2\2st\3\2\2\2t~\7\26"+
		"\2\2uv\7\n\2\2vx\7\25\2\2wy\5\f\7\2xw\3\2\2\2yz\3\2\2\2zx\3\2\2\2z{\3"+
		"\2\2\2{|\3\2\2\2|}\7\26\2\2}\177\3\2\2\2~u\3\2\2\2~\177\3\2\2\2\177\27"+
		"\3\2\2\2\u0080\u0086\5\32\16\2\u0081\u0082\5\34\17\2\u0082\u0083\5\32"+
		"\16\2\u0083\u0085\3\2\2\2\u0084\u0081\3\2\2\2\u0085\u0088\3\2\2\2\u0086"+
		"\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0089\3\2\2\2\u0088\u0086\3\2"+
		"\2\2\u0089\u008a\b\r\1\2\u008a\31\3\2\2\2\u008b\u008c\7\27\2\2\u008c\u0090"+
		"\b\16\1\2\u008d\u008e\7\31\2\2\u008e\u0090\b\16\1\2\u008f\u008b\3\2\2"+
		"\2\u008f\u008d\3\2\2\2\u0090\33\3\2\2\2\u0091\u0092\7\13\2\2\u0092\u009a"+
		"\b\17\1\2\u0093\u0094\7\f\2\2\u0094\u009a\b\17\1\2\u0095\u0096\7\r\2\2"+
		"\u0096\u009a\b\17\1\2\u0097\u0098\7\16\2\2\u0098\u009a\b\17\1\2\u0099"+
		"\u0091\3\2\2\2\u0099\u0093\3\2\2\2\u0099\u0095\3\2\2\2\u0099\u0097\3\2"+
		"\2\2\u009a\35\3\2\2\2\20&\609>DWYdrz~\u0086\u008f\u0099";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}