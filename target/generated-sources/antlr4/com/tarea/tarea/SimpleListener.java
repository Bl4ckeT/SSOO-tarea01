// Generated from com\tarea\tarea\Simple.g4 by ANTLR 4.5.1
package com.tarea.tarea;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SimpleParser}.
 */
public interface SimpleListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SimpleParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(SimpleParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(SimpleParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(SimpleParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(SimpleParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#sentence}.
	 * @param ctx the parse tree
	 */
	void enterSentence(SimpleParser.SentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#sentence}.
	 * @param ctx the parse tree
	 */
	void exitSentence(SimpleParser.SentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#var_assign}.
	 * @param ctx the parse tree
	 */
	void enterVar_assign(SimpleParser.Var_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#var_assign}.
	 * @param ctx the parse tree
	 */
	void exitVar_assign(SimpleParser.Var_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#ifelse}.
	 * @param ctx the parse tree
	 */
	void enterIfelse(SimpleParser.IfelseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#ifelse}.
	 * @param ctx the parse tree
	 */
	void exitIfelse(SimpleParser.IfelseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#conditions}.
	 * @param ctx the parse tree
	 */
	void enterConditions(SimpleParser.ConditionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#conditions}.
	 * @param ctx the parse tree
	 */
	void exitConditions(SimpleParser.ConditionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#while_}.
	 * @param ctx the parse tree
	 */
	void enterWhile_(SimpleParser.While_Context ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#while_}.
	 * @param ctx the parse tree
	 */
	void exitWhile_(SimpleParser.While_Context ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#for_}.
	 * @param ctx the parse tree
	 */
	void enterFor_(SimpleParser.For_Context ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#for_}.
	 * @param ctx the parse tree
	 */
	void exitFor_(SimpleParser.For_Context ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#show}.
	 * @param ctx the parse tree
	 */
	void enterShow(SimpleParser.ShowContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#show}.
	 * @param ctx the parse tree
	 */
	void exitShow(SimpleParser.ShowContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#expressions}.
	 * @param ctx the parse tree
	 */
	void enterExpressions(SimpleParser.ExpressionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#expressions}.
	 * @param ctx the parse tree
	 */
	void exitExpressions(SimpleParser.ExpressionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(SimpleParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(SimpleParser.AtomContext ctx);
}