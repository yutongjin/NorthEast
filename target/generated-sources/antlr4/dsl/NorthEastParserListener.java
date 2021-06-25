// Generated from dsl/NorthEastParser.g4 by ANTLR 4.7
package dsl;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link NorthEastParser}.
 */
public interface NorthEastParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link NorthEastParser#spec}.
	 * @param ctx the parse tree
	 */
	void enterSpec(NorthEastParser.SpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link NorthEastParser#spec}.
	 * @param ctx the parse tree
	 */
	void exitSpec(NorthEastParser.SpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link NorthEastParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(NorthEastParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link NorthEastParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(NorthEastParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link NorthEastParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(NorthEastParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NorthEastParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(NorthEastParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NorthEastParser#printstatement}.
	 * @param ctx the parse tree
	 */
	void enterPrintstatement(NorthEastParser.PrintstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NorthEastParser#printstatement}.
	 * @param ctx the parse tree
	 */
	void exitPrintstatement(NorthEastParser.PrintstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NorthEastParser#vartype}.
	 * @param ctx the parse tree
	 */
	void enterVartype(NorthEastParser.VartypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link NorthEastParser#vartype}.
	 * @param ctx the parse tree
	 */
	void exitVartype(NorthEastParser.VartypeContext ctx);
}