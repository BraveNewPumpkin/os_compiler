// Generated from /Users/kylebolton/IdeaProjects/os_compiler/parser/src/main/resources/OS_C.g4 by ANTLR 4.5.3
package edu.uh.cs.os_c;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class OS_CParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, TypeSpecifier=15, StartParallel=16, 
		EndParallel=17, Identifier=18, Constant=19, Whitespace=20, Newline=21, 
		BlockComment=22, LineComment=23;
	public static final int
		RULE_compilationUnit = 0, RULE_translationUnit = 1, RULE_externalDeclaration = 2, 
		RULE_functionDefinition = 3, RULE_declarator = 4, RULE_compoundStatement = 5, 
		RULE_blockItemList = 6, RULE_blockItem = 7, RULE_declaration = 8, RULE_identifierList = 9, 
		RULE_statement = 10, RULE_assignmentExpression = 11, RULE_rExpression = 12, 
		RULE_rValue = 13, RULE_additiveExpression = 14, RULE_multiplicativeExpression = 15, 
		RULE_atomicExpression = 16, RULE_parallelBlock = 17, RULE_parallelItemList = 18, 
		RULE_parallelItem = 19, RULE_ioOperation = 20, RULE_readFunction = 21, 
		RULE_writeFunction = 22;
	public static final String[] ruleNames = {
		"compilationUnit", "translationUnit", "externalDeclaration", "functionDefinition", 
		"declarator", "compoundStatement", "blockItemList", "blockItem", "declaration", 
		"identifierList", "statement", "assignmentExpression", "rExpression", 
		"rValue", "additiveExpression", "multiplicativeExpression", "atomicExpression", 
		"parallelBlock", "parallelItemList", "parallelItem", "ioOperation", "readFunction", 
		"writeFunction"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'('", "')'", "'{'", "'}'", "','", "'='", "'+'", "'-'", "'*'", 
		"'/'", "'%'", "'read('", "'write('", null, "'cobegin'", "'coend'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "TypeSpecifier", "StartParallel", "EndParallel", "Identifier", 
		"Constant", "Whitespace", "Newline", "BlockComment", "LineComment"
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
	public String getGrammarFileName() { return "OS_C.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public OS_CParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CompilationUnitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(OS_CParser.EOF, 0); }
		public TranslationUnitContext translationUnit() {
			return getRuleContext(TranslationUnitContext.class,0);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OS_CListener ) ((OS_CListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OS_CListener ) ((OS_CListener)listener).exitCompilationUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OS_CVisitor ) return ((OS_CVisitor<? extends T>)visitor).visitCompilationUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << TypeSpecifier) | (1L << Identifier))) != 0)) {
				{
				setState(46);
				translationUnit(0);
				}
			}

			setState(49);
			match(EOF);
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

	public static class TranslationUnitContext extends ParserRuleContext {
		public ExternalDeclarationContext externalDeclaration() {
			return getRuleContext(ExternalDeclarationContext.class,0);
		}
		public TranslationUnitContext translationUnit() {
			return getRuleContext(TranslationUnitContext.class,0);
		}
		public TranslationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_translationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OS_CListener ) ((OS_CListener)listener).enterTranslationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OS_CListener ) ((OS_CListener)listener).exitTranslationUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OS_CVisitor ) return ((OS_CVisitor<? extends T>)visitor).visitTranslationUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TranslationUnitContext translationUnit() throws RecognitionException {
		return translationUnit(0);
	}

	private TranslationUnitContext translationUnit(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TranslationUnitContext _localctx = new TranslationUnitContext(_ctx, _parentState);
		TranslationUnitContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_translationUnit, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(52);
			externalDeclaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(58);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TranslationUnitContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_translationUnit);
					setState(54);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(55);
					externalDeclaration();
					}
					} 
				}
				setState(60);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExternalDeclarationContext extends ParserRuleContext {
		public FunctionDefinitionContext functionDefinition() {
			return getRuleContext(FunctionDefinitionContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public ExternalDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_externalDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OS_CListener ) ((OS_CListener)listener).enterExternalDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OS_CListener ) ((OS_CListener)listener).exitExternalDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OS_CVisitor ) return ((OS_CVisitor<? extends T>)visitor).visitExternalDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExternalDeclarationContext externalDeclaration() throws RecognitionException {
		ExternalDeclarationContext _localctx = new ExternalDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_externalDeclaration);
		try {
			setState(64);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(61);
				functionDefinition();
				}
				break;
			case TypeSpecifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(62);
				declaration();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 3);
				{
				setState(63);
				match(T__0);
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

	public static class FunctionDefinitionContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public FunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OS_CListener ) ((OS_CListener)listener).enterFunctionDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OS_CListener ) ((OS_CListener)listener).exitFunctionDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OS_CVisitor ) return ((OS_CVisitor<? extends T>)visitor).visitFunctionDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_functionDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			declarator();
			setState(67);
			compoundStatement();
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

	public static class DeclaratorContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(OS_CParser.Identifier, 0); }
		public DeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OS_CListener ) ((OS_CListener)listener).enterDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OS_CListener ) ((OS_CListener)listener).exitDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OS_CVisitor ) return ((OS_CVisitor<? extends T>)visitor).visitDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaratorContext declarator() throws RecognitionException {
		DeclaratorContext _localctx = new DeclaratorContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(Identifier);
			setState(70);
			match(T__1);
			setState(71);
			match(T__2);
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

	public static class CompoundStatementContext extends ParserRuleContext {
		public BlockItemListContext blockItemList() {
			return getRuleContext(BlockItemListContext.class,0);
		}
		public CompoundStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OS_CListener ) ((OS_CListener)listener).enterCompoundStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OS_CListener ) ((OS_CListener)listener).exitCompoundStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OS_CVisitor ) return ((OS_CVisitor<? extends T>)visitor).visitCompoundStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompoundStatementContext compoundStatement() throws RecognitionException {
		CompoundStatementContext _localctx = new CompoundStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_compoundStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(T__3);
			setState(75);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << TypeSpecifier) | (1L << StartParallel) | (1L << Identifier))) != 0)) {
				{
				setState(74);
				blockItemList(0);
				}
			}

			setState(77);
			match(T__4);
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

	public static class BlockItemListContext extends ParserRuleContext {
		public BlockItemContext blockItem() {
			return getRuleContext(BlockItemContext.class,0);
		}
		public BlockItemListContext blockItemList() {
			return getRuleContext(BlockItemListContext.class,0);
		}
		public BlockItemListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockItemList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OS_CListener ) ((OS_CListener)listener).enterBlockItemList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OS_CListener ) ((OS_CListener)listener).exitBlockItemList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OS_CVisitor ) return ((OS_CVisitor<? extends T>)visitor).visitBlockItemList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockItemListContext blockItemList() throws RecognitionException {
		return blockItemList(0);
	}

	private BlockItemListContext blockItemList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BlockItemListContext _localctx = new BlockItemListContext(_ctx, _parentState);
		BlockItemListContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_blockItemList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(80);
			blockItem();
			}
			_ctx.stop = _input.LT(-1);
			setState(86);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BlockItemListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_blockItemList);
					setState(82);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(83);
					blockItem();
					}
					} 
				}
				setState(88);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class BlockItemContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public BlockItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OS_CListener ) ((OS_CListener)listener).enterBlockItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OS_CListener ) ((OS_CListener)listener).exitBlockItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OS_CVisitor ) return ((OS_CVisitor<? extends T>)visitor).visitBlockItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockItemContext blockItem() throws RecognitionException {
		BlockItemContext _localctx = new BlockItemContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_blockItem);
		try {
			setState(91);
			switch (_input.LA(1)) {
			case TypeSpecifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				declaration();
				}
				break;
			case T__12:
			case T__13:
			case StartParallel:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				statement();
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

	public static class DeclarationContext extends ParserRuleContext {
		public TerminalNode TypeSpecifier() { return getToken(OS_CParser.TypeSpecifier, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OS_CListener ) ((OS_CListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OS_CListener ) ((OS_CListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OS_CVisitor ) return ((OS_CVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(TypeSpecifier);
			setState(94);
			identifierList(0);
			setState(95);
			match(T__0);
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

	public static class IdentifierListContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(OS_CParser.Identifier, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OS_CListener ) ((OS_CListener)listener).enterIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OS_CListener ) ((OS_CListener)listener).exitIdentifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OS_CVisitor ) return ((OS_CVisitor<? extends T>)visitor).visitIdentifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		return identifierList(0);
	}

	private IdentifierListContext identifierList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, _parentState);
		IdentifierListContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_identifierList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(98);
			match(Identifier);
			}
			_ctx.stop = _input.LT(-1);
			setState(105);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new IdentifierListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_identifierList);
					setState(100);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(101);
					match(T__5);
					setState(102);
					match(Identifier);
					}
					} 
				}
				setState(107);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public ParallelBlockContext parallelBlock() {
			return getRuleContext(ParallelBlockContext.class,0);
		}
		public IoOperationContext ioOperation() {
			return getRuleContext(IoOperationContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OS_CListener ) ((OS_CListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OS_CListener ) ((OS_CListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OS_CVisitor ) return ((OS_CVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_statement);
		try {
			setState(117);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				assignmentExpression();
				setState(109);
				match(T__0);
				}
				break;
			case StartParallel:
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				parallelBlock();
				setState(112);
				match(T__0);
				}
				break;
			case T__12:
			case T__13:
				enterOuterAlt(_localctx, 3);
				{
				setState(114);
				ioOperation();
				setState(115);
				match(T__0);
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

	public static class AssignmentExpressionContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(OS_CParser.Identifier, 0); }
		public RExpressionContext rExpression() {
			return getRuleContext(RExpressionContext.class,0);
		}
		public AssignmentExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OS_CListener ) ((OS_CListener)listener).enterAssignmentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OS_CListener ) ((OS_CListener)listener).exitAssignmentExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OS_CVisitor ) return ((OS_CVisitor<? extends T>)visitor).visitAssignmentExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentExpressionContext assignmentExpression() throws RecognitionException {
		AssignmentExpressionContext _localctx = new AssignmentExpressionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_assignmentExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(Identifier);
			setState(120);
			match(T__6);
			setState(121);
			rExpression();
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

	public static class RExpressionContext extends ParserRuleContext {
		public RValueContext rValue() {
			return getRuleContext(RValueContext.class,0);
		}
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public RExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OS_CListener ) ((OS_CListener)listener).enterRExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OS_CListener ) ((OS_CListener)listener).exitRExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OS_CVisitor ) return ((OS_CVisitor<? extends T>)visitor).visitRExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RExpressionContext rExpression() throws RecognitionException {
		RExpressionContext _localctx = new RExpressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_rExpression);
		try {
			setState(125);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				rValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(124);
				additiveExpression(0);
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

	public static class RValueContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(OS_CParser.Identifier, 0); }
		public TerminalNode Constant() { return getToken(OS_CParser.Constant, 0); }
		public RValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OS_CListener ) ((OS_CListener)listener).enterRValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OS_CListener ) ((OS_CListener)listener).exitRValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OS_CVisitor ) return ((OS_CVisitor<? extends T>)visitor).visitRValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RValueContext rValue() throws RecognitionException {
		RValueContext _localctx = new RValueContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_rValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			_la = _input.LA(1);
			if ( !(_la==Identifier || _la==Constant) ) {
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

	public static class AdditiveExpressionContext extends ParserRuleContext {
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OS_CListener ) ((OS_CListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OS_CListener ) ((OS_CListener)listener).exitAdditiveExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OS_CVisitor ) return ((OS_CVisitor<? extends T>)visitor).visitAdditiveExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		return additiveExpression(0);
	}

	private AdditiveExpressionContext additiveExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, _parentState);
		AdditiveExpressionContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_additiveExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(130);
			multiplicativeExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(140);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(138);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new AdditiveExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(132);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(133);
						match(T__7);
						setState(134);
						multiplicativeExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new AdditiveExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(135);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(136);
						match(T__8);
						setState(137);
						multiplicativeExpression(0);
						}
						break;
					}
					} 
				}
				setState(142);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public AtomicExpressionContext atomicExpression() {
			return getRuleContext(AtomicExpressionContext.class,0);
		}
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OS_CListener ) ((OS_CListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OS_CListener ) ((OS_CListener)listener).exitMultiplicativeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OS_CVisitor ) return ((OS_CVisitor<? extends T>)visitor).visitMultiplicativeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		return multiplicativeExpression(0);
	}

	private MultiplicativeExpressionContext multiplicativeExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, _parentState);
		MultiplicativeExpressionContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_multiplicativeExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(144);
			atomicExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(157);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(155);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(146);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(147);
						match(T__9);
						setState(148);
						atomicExpression();
						}
						break;
					case 2:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(149);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(150);
						match(T__10);
						setState(151);
						atomicExpression();
						}
						break;
					case 3:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(152);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(153);
						match(T__11);
						setState(154);
						atomicExpression();
						}
						break;
					}
					} 
				}
				setState(159);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AtomicExpressionContext extends ParserRuleContext {
		public RValueContext rValue() {
			return getRuleContext(RValueContext.class,0);
		}
		public RExpressionContext rExpression() {
			return getRuleContext(RExpressionContext.class,0);
		}
		public AtomicExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomicExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OS_CListener ) ((OS_CListener)listener).enterAtomicExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OS_CListener ) ((OS_CListener)listener).exitAtomicExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OS_CVisitor ) return ((OS_CVisitor<? extends T>)visitor).visitAtomicExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomicExpressionContext atomicExpression() throws RecognitionException {
		AtomicExpressionContext _localctx = new AtomicExpressionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_atomicExpression);
		try {
			setState(165);
			switch (_input.LA(1)) {
			case Identifier:
			case Constant:
				enterOuterAlt(_localctx, 1);
				{
				setState(160);
				rValue();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(161);
				match(T__1);
				setState(162);
				rExpression();
				setState(163);
				match(T__2);
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

	public static class ParallelBlockContext extends ParserRuleContext {
		public TerminalNode StartParallel() { return getToken(OS_CParser.StartParallel, 0); }
		public ParallelItemListContext parallelItemList() {
			return getRuleContext(ParallelItemListContext.class,0);
		}
		public TerminalNode EndParallel() { return getToken(OS_CParser.EndParallel, 0); }
		public ParallelBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parallelBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OS_CListener ) ((OS_CListener)listener).enterParallelBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OS_CListener ) ((OS_CListener)listener).exitParallelBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OS_CVisitor ) return ((OS_CVisitor<? extends T>)visitor).visitParallelBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParallelBlockContext parallelBlock() throws RecognitionException {
		ParallelBlockContext _localctx = new ParallelBlockContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_parallelBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(StartParallel);
			setState(168);
			parallelItemList(0);
			setState(169);
			match(EndParallel);
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

	public static class ParallelItemListContext extends ParserRuleContext {
		public ParallelItemContext parallelItem() {
			return getRuleContext(ParallelItemContext.class,0);
		}
		public ParallelItemListContext parallelItemList() {
			return getRuleContext(ParallelItemListContext.class,0);
		}
		public ParallelItemListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parallelItemList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OS_CListener ) ((OS_CListener)listener).enterParallelItemList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OS_CListener ) ((OS_CListener)listener).exitParallelItemList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OS_CVisitor ) return ((OS_CVisitor<? extends T>)visitor).visitParallelItemList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParallelItemListContext parallelItemList() throws RecognitionException {
		return parallelItemList(0);
	}

	private ParallelItemListContext parallelItemList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ParallelItemListContext _localctx = new ParallelItemListContext(_ctx, _parentState);
		ParallelItemListContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_parallelItemList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(172);
			parallelItem();
			}
			_ctx.stop = _input.LT(-1);
			setState(178);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ParallelItemListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_parallelItemList);
					setState(174);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(175);
					parallelItem();
					}
					} 
				}
				setState(180);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ParallelItemContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ParallelItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parallelItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OS_CListener ) ((OS_CListener)listener).enterParallelItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OS_CListener ) ((OS_CListener)listener).exitParallelItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OS_CVisitor ) return ((OS_CVisitor<? extends T>)visitor).visitParallelItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParallelItemContext parallelItem() throws RecognitionException {
		ParallelItemContext _localctx = new ParallelItemContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_parallelItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			statement();
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

	public static class IoOperationContext extends ParserRuleContext {
		public ReadFunctionContext readFunction() {
			return getRuleContext(ReadFunctionContext.class,0);
		}
		public WriteFunctionContext writeFunction() {
			return getRuleContext(WriteFunctionContext.class,0);
		}
		public IoOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ioOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OS_CListener ) ((OS_CListener)listener).enterIoOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OS_CListener ) ((OS_CListener)listener).exitIoOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OS_CVisitor ) return ((OS_CVisitor<? extends T>)visitor).visitIoOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IoOperationContext ioOperation() throws RecognitionException {
		IoOperationContext _localctx = new IoOperationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_ioOperation);
		try {
			setState(185);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(183);
				readFunction();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(184);
				writeFunction();
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

	public static class ReadFunctionContext extends ParserRuleContext {
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public ReadFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OS_CListener ) ((OS_CListener)listener).enterReadFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OS_CListener ) ((OS_CListener)listener).exitReadFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OS_CVisitor ) return ((OS_CVisitor<? extends T>)visitor).visitReadFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadFunctionContext readFunction() throws RecognitionException {
		ReadFunctionContext _localctx = new ReadFunctionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_readFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(T__12);
			setState(188);
			identifierList(0);
			setState(189);
			match(T__2);
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

	public static class WriteFunctionContext extends ParserRuleContext {
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public WriteFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_writeFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OS_CListener ) ((OS_CListener)listener).enterWriteFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OS_CListener ) ((OS_CListener)listener).exitWriteFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OS_CVisitor ) return ((OS_CVisitor<? extends T>)visitor).visitWriteFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WriteFunctionContext writeFunction() throws RecognitionException {
		WriteFunctionContext _localctx = new WriteFunctionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_writeFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(T__13);
			setState(192);
			identifierList(0);
			setState(193);
			match(T__2);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return translationUnit_sempred((TranslationUnitContext)_localctx, predIndex);
		case 6:
			return blockItemList_sempred((BlockItemListContext)_localctx, predIndex);
		case 9:
			return identifierList_sempred((IdentifierListContext)_localctx, predIndex);
		case 14:
			return additiveExpression_sempred((AdditiveExpressionContext)_localctx, predIndex);
		case 15:
			return multiplicativeExpression_sempred((MultiplicativeExpressionContext)_localctx, predIndex);
		case 18:
			return parallelItemList_sempred((ParallelItemListContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean translationUnit_sempred(TranslationUnitContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean blockItemList_sempred(BlockItemListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean identifierList_sempred(IdentifierListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean additiveExpression_sempred(AdditiveExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean multiplicativeExpression_sempred(MultiplicativeExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 3);
		case 6:
			return precpred(_ctx, 2);
		case 7:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean parallelItemList_sempred(ParallelItemListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\31\u00c6\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\5\2\62"+
		"\n\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\7\3;\n\3\f\3\16\3>\13\3\3\4\3\4\3\4\5"+
		"\4C\n\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\5\7N\n\7\3\7\3\7\3\b\3\b\3"+
		"\b\3\b\3\b\7\bW\n\b\f\b\16\bZ\13\b\3\t\3\t\5\t^\n\t\3\n\3\n\3\n\3\n\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\7\13j\n\13\f\13\16\13m\13\13\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\5\fx\n\f\3\r\3\r\3\r\3\r\3\16\3\16\5\16\u0080"+
		"\n\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u008d"+
		"\n\20\f\20\16\20\u0090\13\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\7\21\u009e\n\21\f\21\16\21\u00a1\13\21\3\22\3\22\3"+
		"\22\3\22\3\22\5\22\u00a8\n\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\3\24\7\24\u00b3\n\24\f\24\16\24\u00b6\13\24\3\25\3\25\3\26\3\26\5\26"+
		"\u00bc\n\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\2\b\4\16\24\36"+
		" &\31\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\2\3\3\2\24\25\u00c1"+
		"\2\61\3\2\2\2\4\65\3\2\2\2\6B\3\2\2\2\bD\3\2\2\2\nG\3\2\2\2\fK\3\2\2\2"+
		"\16Q\3\2\2\2\20]\3\2\2\2\22_\3\2\2\2\24c\3\2\2\2\26w\3\2\2\2\30y\3\2\2"+
		"\2\32\177\3\2\2\2\34\u0081\3\2\2\2\36\u0083\3\2\2\2 \u0091\3\2\2\2\"\u00a7"+
		"\3\2\2\2$\u00a9\3\2\2\2&\u00ad\3\2\2\2(\u00b7\3\2\2\2*\u00bb\3\2\2\2,"+
		"\u00bd\3\2\2\2.\u00c1\3\2\2\2\60\62\5\4\3\2\61\60\3\2\2\2\61\62\3\2\2"+
		"\2\62\63\3\2\2\2\63\64\7\2\2\3\64\3\3\2\2\2\65\66\b\3\1\2\66\67\5\6\4"+
		"\2\67<\3\2\2\289\f\3\2\29;\5\6\4\2:8\3\2\2\2;>\3\2\2\2<:\3\2\2\2<=\3\2"+
		"\2\2=\5\3\2\2\2><\3\2\2\2?C\5\b\5\2@C\5\22\n\2AC\7\3\2\2B?\3\2\2\2B@\3"+
		"\2\2\2BA\3\2\2\2C\7\3\2\2\2DE\5\n\6\2EF\5\f\7\2F\t\3\2\2\2GH\7\24\2\2"+
		"HI\7\4\2\2IJ\7\5\2\2J\13\3\2\2\2KM\7\6\2\2LN\5\16\b\2ML\3\2\2\2MN\3\2"+
		"\2\2NO\3\2\2\2OP\7\7\2\2P\r\3\2\2\2QR\b\b\1\2RS\5\20\t\2SX\3\2\2\2TU\f"+
		"\3\2\2UW\5\20\t\2VT\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y\17\3\2\2\2"+
		"ZX\3\2\2\2[^\5\22\n\2\\^\5\26\f\2][\3\2\2\2]\\\3\2\2\2^\21\3\2\2\2_`\7"+
		"\21\2\2`a\5\24\13\2ab\7\3\2\2b\23\3\2\2\2cd\b\13\1\2de\7\24\2\2ek\3\2"+
		"\2\2fg\f\3\2\2gh\7\b\2\2hj\7\24\2\2if\3\2\2\2jm\3\2\2\2ki\3\2\2\2kl\3"+
		"\2\2\2l\25\3\2\2\2mk\3\2\2\2no\5\30\r\2op\7\3\2\2px\3\2\2\2qr\5$\23\2"+
		"rs\7\3\2\2sx\3\2\2\2tu\5*\26\2uv\7\3\2\2vx\3\2\2\2wn\3\2\2\2wq\3\2\2\2"+
		"wt\3\2\2\2x\27\3\2\2\2yz\7\24\2\2z{\7\t\2\2{|\5\32\16\2|\31\3\2\2\2}\u0080"+
		"\5\34\17\2~\u0080\5\36\20\2\177}\3\2\2\2\177~\3\2\2\2\u0080\33\3\2\2\2"+
		"\u0081\u0082\t\2\2\2\u0082\35\3\2\2\2\u0083\u0084\b\20\1\2\u0084\u0085"+
		"\5 \21\2\u0085\u008e\3\2\2\2\u0086\u0087\f\4\2\2\u0087\u0088\7\n\2\2\u0088"+
		"\u008d\5 \21\2\u0089\u008a\f\3\2\2\u008a\u008b\7\13\2\2\u008b\u008d\5"+
		" \21\2\u008c\u0086\3\2\2\2\u008c\u0089\3\2\2\2\u008d\u0090\3\2\2\2\u008e"+
		"\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\37\3\2\2\2\u0090\u008e\3\2\2"+
		"\2\u0091\u0092\b\21\1\2\u0092\u0093\5\"\22\2\u0093\u009f\3\2\2\2\u0094"+
		"\u0095\f\5\2\2\u0095\u0096\7\f\2\2\u0096\u009e\5\"\22\2\u0097\u0098\f"+
		"\4\2\2\u0098\u0099\7\r\2\2\u0099\u009e\5\"\22\2\u009a\u009b\f\3\2\2\u009b"+
		"\u009c\7\16\2\2\u009c\u009e\5\"\22\2\u009d\u0094\3\2\2\2\u009d\u0097\3"+
		"\2\2\2\u009d\u009a\3\2\2\2\u009e\u00a1\3\2\2\2\u009f\u009d\3\2\2\2\u009f"+
		"\u00a0\3\2\2\2\u00a0!\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a8\5\34\17"+
		"\2\u00a3\u00a4\7\4\2\2\u00a4\u00a5\5\32\16\2\u00a5\u00a6\7\5\2\2\u00a6"+
		"\u00a8\3\2\2\2\u00a7\u00a2\3\2\2\2\u00a7\u00a3\3\2\2\2\u00a8#\3\2\2\2"+
		"\u00a9\u00aa\7\22\2\2\u00aa\u00ab\5&\24\2\u00ab\u00ac\7\23\2\2\u00ac%"+
		"\3\2\2\2\u00ad\u00ae\b\24\1\2\u00ae\u00af\5(\25\2\u00af\u00b4\3\2\2\2"+
		"\u00b0\u00b1\f\3\2\2\u00b1\u00b3\5(\25\2\u00b2\u00b0\3\2\2\2\u00b3\u00b6"+
		"\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\'\3\2\2\2\u00b6"+
		"\u00b4\3\2\2\2\u00b7\u00b8\5\26\f\2\u00b8)\3\2\2\2\u00b9\u00bc\5,\27\2"+
		"\u00ba\u00bc\5.\30\2\u00bb\u00b9\3\2\2\2\u00bb\u00ba\3\2\2\2\u00bc+\3"+
		"\2\2\2\u00bd\u00be\7\17\2\2\u00be\u00bf\5\24\13\2\u00bf\u00c0\7\5\2\2"+
		"\u00c0-\3\2\2\2\u00c1\u00c2\7\20\2\2\u00c2\u00c3\5\24\13\2\u00c3\u00c4"+
		"\7\5\2\2\u00c4/\3\2\2\2\22\61<BMX]kw\177\u008c\u008e\u009d\u009f\u00a7"+
		"\u00b4\u00bb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}