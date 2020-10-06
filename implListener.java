// Generated from impl.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link implParser}.
 */
public interface implListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link implParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(implParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link implParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(implParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SingleCommand}
	 * labeled alternative in {@link implParser#program}.
	 * @param ctx the parse tree
	 */
	void enterSingleCommand(implParser.SingleCommandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SingleCommand}
	 * labeled alternative in {@link implParser#program}.
	 * @param ctx the parse tree
	 */
	void exitSingleCommand(implParser.SingleCommandContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MultipleCommands}
	 * labeled alternative in {@link implParser#program}.
	 * @param ctx the parse tree
	 */
	void enterMultipleCommands(implParser.MultipleCommandsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MultipleCommands}
	 * labeled alternative in {@link implParser#program}.
	 * @param ctx the parse tree
	 */
	void exitMultipleCommands(implParser.MultipleCommandsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Assignment}
	 * labeled alternative in {@link implParser#command}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(implParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Assignment}
	 * labeled alternative in {@link implParser#command}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(implParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Output}
	 * labeled alternative in {@link implParser#command}.
	 * @param ctx the parse tree
	 */
	void enterOutput(implParser.OutputContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Output}
	 * labeled alternative in {@link implParser#command}.
	 * @param ctx the parse tree
	 */
	void exitOutput(implParser.OutputContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WhileLoop}
	 * labeled alternative in {@link implParser#command}.
	 * @param ctx the parse tree
	 */
	void enterWhileLoop(implParser.WhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhileLoop}
	 * labeled alternative in {@link implParser#command}.
	 * @param ctx the parse tree
	 */
	void exitWhileLoop(implParser.WhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForLoop}
	 * labeled alternative in {@link implParser#command}.
	 * @param ctx the parse tree
	 */
	void enterForLoop(implParser.ForLoopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForLoop}
	 * labeled alternative in {@link implParser#command}.
	 * @param ctx the parse tree
	 */
	void exitForLoop(implParser.ForLoopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfStatement}
	 * labeled alternative in {@link implParser#command}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(implParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfStatement}
	 * labeled alternative in {@link implParser#command}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(implParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ListAssignment}
	 * labeled alternative in {@link implParser#command}.
	 * @param ctx the parse tree
	 */
	void enterListAssignment(implParser.ListAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ListAssignment}
	 * labeled alternative in {@link implParser#command}.
	 * @param ctx the parse tree
	 */
	void exitListAssignment(implParser.ListAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SingleExpression}
	 * labeled alternative in {@link implParser#command}.
	 * @param ctx the parse tree
	 */
	void enterSingleExpression(implParser.SingleExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SingleExpression}
	 * labeled alternative in {@link implParser#command}.
	 * @param ctx the parse tree
	 */
	void exitSingleExpression(implParser.SingleExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Parenthesis}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParenthesis(implParser.ParenthesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parenthesis}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParenthesis(implParser.ParenthesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVariable(implParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVariable(implParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ListVariable}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterListVariable(implParser.ListVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ListVariable}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitListVariable(implParser.ListVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PlusPlus}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPlusPlus(implParser.PlusPlusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PlusPlus}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPlusPlus(implParser.PlusPlusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Constant}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterConstant(implParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Constant}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitConstant(implParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MultiDivtion}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMultiDivtion(implParser.MultiDivtionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MultiDivtion}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMultiDivtion(implParser.MultiDivtionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSubtion}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSubtion(implParser.AddSubtionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSubtion}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSubtion(implParser.AddSubtionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Unequal}
	 * labeled alternative in {@link implParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterUnequal(implParser.UnequalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Unequal}
	 * labeled alternative in {@link implParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitUnequal(implParser.UnequalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LessThan}
	 * labeled alternative in {@link implParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterLessThan(implParser.LessThanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LessThan}
	 * labeled alternative in {@link implParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitLessThan(implParser.LessThanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Not}
	 * labeled alternative in {@link implParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterNot(implParser.NotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Not}
	 * labeled alternative in {@link implParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitNot(implParser.NotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Or}
	 * labeled alternative in {@link implParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterOr(implParser.OrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Or}
	 * labeled alternative in {@link implParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitOr(implParser.OrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LessThanOrEqual}
	 * labeled alternative in {@link implParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterLessThanOrEqual(implParser.LessThanOrEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LessThanOrEqual}
	 * labeled alternative in {@link implParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitLessThanOrEqual(implParser.LessThanOrEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Equal}
	 * labeled alternative in {@link implParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterEqual(implParser.EqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Equal}
	 * labeled alternative in {@link implParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitEqual(implParser.EqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GreaterThan}
	 * labeled alternative in {@link implParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterGreaterThan(implParser.GreaterThanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GreaterThan}
	 * labeled alternative in {@link implParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitGreaterThan(implParser.GreaterThanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code And}
	 * labeled alternative in {@link implParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterAnd(implParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code And}
	 * labeled alternative in {@link implParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitAnd(implParser.AndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GreaterThanOrEqual}
	 * labeled alternative in {@link implParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterGreaterThanOrEqual(implParser.GreaterThanOrEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GreaterThanOrEqual}
	 * labeled alternative in {@link implParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitGreaterThanOrEqual(implParser.GreaterThanOrEqualContext ctx);
}