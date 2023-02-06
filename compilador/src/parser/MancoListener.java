// Generated from Manco.g4 by ANTLR 4.7.1
package parser;

	import java.util.Scanner;
	import datastructures.Symbol;
	import datastructures.Variable;
	import datastructures.SymbolTable;
	import exceptions.SemanticException;
	import java.util.ArrayList;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MancoParser}.
 */
public interface MancoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MancoParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(MancoParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link MancoParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(MancoParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link MancoParser#bloco}.
	 * @param ctx the parse tree
	 */
	void enterBloco(MancoParser.BlocoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MancoParser#bloco}.
	 * @param ctx the parse tree
	 */
	void exitBloco(MancoParser.BlocoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MancoParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmd(MancoParser.CmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link MancoParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmd(MancoParser.CmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link MancoParser#cmddecl}.
	 * @param ctx the parse tree
	 */
	void enterCmddecl(MancoParser.CmddeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link MancoParser#cmddecl}.
	 * @param ctx the parse tree
	 */
	void exitCmddecl(MancoParser.CmddeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link MancoParser#declaravar}.
	 * @param ctx the parse tree
	 */
	void enterDeclaravar(MancoParser.DeclaravarContext ctx);
	/**
	 * Exit a parse tree produced by {@link MancoParser#declaravar}.
	 * @param ctx the parse tree
	 */
	void exitDeclaravar(MancoParser.DeclaravarContext ctx);
	/**
	 * Enter a parse tree produced by {@link MancoParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(MancoParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MancoParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(MancoParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MancoParser#cmdleitura}.
	 * @param ctx the parse tree
	 */
	void enterCmdleitura(MancoParser.CmdleituraContext ctx);
	/**
	 * Exit a parse tree produced by {@link MancoParser#cmdleitura}.
	 * @param ctx the parse tree
	 */
	void exitCmdleitura(MancoParser.CmdleituraContext ctx);
	/**
	 * Enter a parse tree produced by {@link MancoParser#cmdescrita}.
	 * @param ctx the parse tree
	 */
	void enterCmdescrita(MancoParser.CmdescritaContext ctx);
	/**
	 * Exit a parse tree produced by {@link MancoParser#cmdescrita}.
	 * @param ctx the parse tree
	 */
	void exitCmdescrita(MancoParser.CmdescritaContext ctx);
	/**
	 * Enter a parse tree produced by {@link MancoParser#texto}.
	 * @param ctx the parse tree
	 */
	void enterTexto(MancoParser.TextoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MancoParser#texto}.
	 * @param ctx the parse tree
	 */
	void exitTexto(MancoParser.TextoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MancoParser#cmdattrib}.
	 * @param ctx the parse tree
	 */
	void enterCmdattrib(MancoParser.CmdattribContext ctx);
	/**
	 * Exit a parse tree produced by {@link MancoParser#cmdattrib}.
	 * @param ctx the parse tree
	 */
	void exitCmdattrib(MancoParser.CmdattribContext ctx);
	/**
	 * Enter a parse tree produced by {@link MancoParser#cmdpara}.
	 * @param ctx the parse tree
	 */
	void enterCmdpara(MancoParser.CmdparaContext ctx);
	/**
	 * Exit a parse tree produced by {@link MancoParser#cmdpara}.
	 * @param ctx the parse tree
	 */
	void exitCmdpara(MancoParser.CmdparaContext ctx);
	/**
	 * Enter a parse tree produced by {@link MancoParser#cmdenquanto}.
	 * @param ctx the parse tree
	 */
	void enterCmdenquanto(MancoParser.CmdenquantoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MancoParser#cmdenquanto}.
	 * @param ctx the parse tree
	 */
	void exitCmdenquanto(MancoParser.CmdenquantoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MancoParser#cmdfacaenquanto}.
	 * @param ctx the parse tree
	 */
	void enterCmdfacaenquanto(MancoParser.CmdfacaenquantoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MancoParser#cmdfacaenquanto}.
	 * @param ctx the parse tree
	 */
	void exitCmdfacaenquanto(MancoParser.CmdfacaenquantoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MancoParser#cmdsesenao}.
	 * @param ctx the parse tree
	 */
	void enterCmdsesenao(MancoParser.CmdsesenaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MancoParser#cmdsesenao}.
	 * @param ctx the parse tree
	 */
	void exitCmdsesenao(MancoParser.CmdsesenaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MancoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(MancoParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MancoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(MancoParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MancoParser#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(MancoParser.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MancoParser#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(MancoParser.TermoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MancoParser#op}.
	 * @param ctx the parse tree
	 */
	void enterOp(MancoParser.OpContext ctx);
	/**
	 * Exit a parse tree produced by {@link MancoParser#op}.
	 * @param ctx the parse tree
	 */
	void exitOp(MancoParser.OpContext ctx);
	/**
	 * Enter a parse tree produced by {@link MancoParser#oprel}.
	 * @param ctx the parse tree
	 */
	void enterOprel(MancoParser.OprelContext ctx);
	/**
	 * Exit a parse tree produced by {@link MancoParser#oprel}.
	 * @param ctx the parse tree
	 */
	void exitOprel(MancoParser.OprelContext ctx);
}