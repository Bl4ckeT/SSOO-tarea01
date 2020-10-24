// Generated from com\tarea\tarea\Simple.g4 by ANTLR 4.5.1
package com.tarea.tarea;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SimpleParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SimpleVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SimpleParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(SimpleParser.ParseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(SimpleParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentence(SimpleParser.SentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#var_assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_assign(SimpleParser.Var_assignContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#ifelse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfelse(SimpleParser.IfelseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#conditions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditions(SimpleParser.ConditionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#while_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_(SimpleParser.While_Context ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#for_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_(SimpleParser.For_Context ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#show}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShow(SimpleParser.ShowContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#expressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressions(SimpleParser.ExpressionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(SimpleParser.AtomContext ctx);
}