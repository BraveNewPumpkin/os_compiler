// Generated from /Users/kylebolton/IdeaProjects/os_compiler/parser/src/main/resources/OS_C.g4 by ANTLR 4.5.3
package edu.uh.cs.os_c;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link OS_CParser}.
 */
public interface OS_CListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link OS_CParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(OS_CParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link OS_CParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(OS_CParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link OS_CParser#translationUnit}.
	 * @param ctx the parse tree
	 */
	void enterTranslationUnit(OS_CParser.TranslationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link OS_CParser#translationUnit}.
	 * @param ctx the parse tree
	 */
	void exitTranslationUnit(OS_CParser.TranslationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link OS_CParser#externalDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterExternalDeclaration(OS_CParser.ExternalDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OS_CParser#externalDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitExternalDeclaration(OS_CParser.ExternalDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OS_CParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinition(OS_CParser.FunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OS_CParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinition(OS_CParser.FunctionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OS_CParser#declarator}.
	 * @param ctx the parse tree
	 */
	void enterDeclarator(OS_CParser.DeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link OS_CParser#declarator}.
	 * @param ctx the parse tree
	 */
	void exitDeclarator(OS_CParser.DeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link OS_CParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStatement(OS_CParser.CompoundStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OS_CParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStatement(OS_CParser.CompoundStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OS_CParser#blockItemList}.
	 * @param ctx the parse tree
	 */
	void enterBlockItemList(OS_CParser.BlockItemListContext ctx);
	/**
	 * Exit a parse tree produced by {@link OS_CParser#blockItemList}.
	 * @param ctx the parse tree
	 */
	void exitBlockItemList(OS_CParser.BlockItemListContext ctx);
	/**
	 * Enter a parse tree produced by {@link OS_CParser#blockItem}.
	 * @param ctx the parse tree
	 */
	void enterBlockItem(OS_CParser.BlockItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link OS_CParser#blockItem}.
	 * @param ctx the parse tree
	 */
	void exitBlockItem(OS_CParser.BlockItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link OS_CParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(OS_CParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OS_CParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(OS_CParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OS_CParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierList(OS_CParser.IdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link OS_CParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierList(OS_CParser.IdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link OS_CParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(OS_CParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OS_CParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(OS_CParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OS_CParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(OS_CParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OS_CParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(OS_CParser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OS_CParser#rExpression}.
	 * @param ctx the parse tree
	 */
	void enterRExpression(OS_CParser.RExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OS_CParser#rExpression}.
	 * @param ctx the parse tree
	 */
	void exitRExpression(OS_CParser.RExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OS_CParser#rValue}.
	 * @param ctx the parse tree
	 */
	void enterRValue(OS_CParser.RValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link OS_CParser#rValue}.
	 * @param ctx the parse tree
	 */
	void exitRValue(OS_CParser.RValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link OS_CParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(OS_CParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OS_CParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(OS_CParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OS_CParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(OS_CParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OS_CParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(OS_CParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OS_CParser#atomicExpression}.
	 * @param ctx the parse tree
	 */
	void enterAtomicExpression(OS_CParser.AtomicExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OS_CParser#atomicExpression}.
	 * @param ctx the parse tree
	 */
	void exitAtomicExpression(OS_CParser.AtomicExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OS_CParser#parallelBlock}.
	 * @param ctx the parse tree
	 */
	void enterParallelBlock(OS_CParser.ParallelBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link OS_CParser#parallelBlock}.
	 * @param ctx the parse tree
	 */
	void exitParallelBlock(OS_CParser.ParallelBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link OS_CParser#parallelItemList}.
	 * @param ctx the parse tree
	 */
	void enterParallelItemList(OS_CParser.ParallelItemListContext ctx);
	/**
	 * Exit a parse tree produced by {@link OS_CParser#parallelItemList}.
	 * @param ctx the parse tree
	 */
	void exitParallelItemList(OS_CParser.ParallelItemListContext ctx);
	/**
	 * Enter a parse tree produced by {@link OS_CParser#parallelItem}.
	 * @param ctx the parse tree
	 */
	void enterParallelItem(OS_CParser.ParallelItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link OS_CParser#parallelItem}.
	 * @param ctx the parse tree
	 */
	void exitParallelItem(OS_CParser.ParallelItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link OS_CParser#ioOperation}.
	 * @param ctx the parse tree
	 */
	void enterIoOperation(OS_CParser.IoOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OS_CParser#ioOperation}.
	 * @param ctx the parse tree
	 */
	void exitIoOperation(OS_CParser.IoOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OS_CParser#ioFunctionName}.
	 * @param ctx the parse tree
	 */
	void enterIoFunctionName(OS_CParser.IoFunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OS_CParser#ioFunctionName}.
	 * @param ctx the parse tree
	 */
	void exitIoFunctionName(OS_CParser.IoFunctionNameContext ctx);
}