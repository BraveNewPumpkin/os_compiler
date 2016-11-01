// Generated from /Users/kylebolton/IdeaProjects/os_compiler/parser/src/main/resources/OS_C.g4 by ANTLR 4.5.3
package edu.uh.cs.os_c;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link OS_CParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface OS_CVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link OS_CParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(OS_CParser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link OS_CParser#translationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTranslationUnit(OS_CParser.TranslationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link OS_CParser#externalDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExternalDeclaration(OS_CParser.ExternalDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link OS_CParser#functionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefinition(OS_CParser.FunctionDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OS_CParser#declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarator(OS_CParser.DeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link OS_CParser#compoundStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundStatement(OS_CParser.CompoundStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link OS_CParser#blockItemList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockItemList(OS_CParser.BlockItemListContext ctx);
	/**
	 * Visit a parse tree produced by {@link OS_CParser#blockItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockItem(OS_CParser.BlockItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link OS_CParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(OS_CParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link OS_CParser#identifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierList(OS_CParser.IdentifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link OS_CParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(OS_CParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link OS_CParser#assignmentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExpression(OS_CParser.AssignmentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OS_CParser#rExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRExpression(OS_CParser.RExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OS_CParser#rValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRValue(OS_CParser.RValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link OS_CParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(OS_CParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OS_CParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(OS_CParser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OS_CParser#atomicExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomicExpression(OS_CParser.AtomicExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OS_CParser#parallelBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParallelBlock(OS_CParser.ParallelBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link OS_CParser#parallelItemList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParallelItemList(OS_CParser.ParallelItemListContext ctx);
	/**
	 * Visit a parse tree produced by {@link OS_CParser#parallelItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParallelItem(OS_CParser.ParallelItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link OS_CParser#ioOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIoOperation(OS_CParser.IoOperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link OS_CParser#ioFunctionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIoFunctionName(OS_CParser.IoFunctionNameContext ctx);
}