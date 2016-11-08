/**
 * Created by Kyle Bolton on 11/6/2016.
 */

import edu.uh.cs.os_c.OS_CBaseVisitor;
import edu.uh.cs.os_c.OS_CParser;
import org.antlr.v4.runtime.misc.ParseCancellationException;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentMap;
import java.util.function.Function;

public class OS_CVisitorCalculations extends OS_CBaseVisitor<Function<Integer, Integer>> {
    private ConcurrentMap<String, Integer> variables;
    private List<Function<Integer, Integer>> stack;
    private int parallelCount;

    public OS_CVisitorCalculations(ConcurrentMap<String, Integer> variables){
        parallelCount = 0;
        this.variables = variables;
        stack = new ArrayList<>();
    }

    public boolean isParallel(){
        return parallelCount > 0;
    }

    @Override
    public Function<Integer, Integer> visitStartParallel(OS_CParser.StartParallelContext ctx) {
        parallelCount++;
        //dummy return
        return i -> 0;
    }

    @Override
    public Function<Integer, Integer> visitEndParallel(OS_CParser.EndParallelContext ctx) {
        if(!isParallel()){
            //would be a checked exception except that we can't change the interface as it's dynamically generated
            throw new ParseCancellationException("mismatched end of parallel block");
        }
        parallelCount--;
        if(!isParallel()){
           stack.parallelStream().forEach(frame -> frame.apply(0));
        }
        //dummy return
        return i -> 0;
    }

    @Override
    public Function<Integer, Integer> visitAssignmentExpression(OS_CParser.AssignmentExpressionContext ctx) {
        String variable_name = ctx.Identifier().getText();
        if(!variables.containsKey(variable_name)){
            //would be a checked exception except that we can't change the interface as it's dynamically generated
            throw new ParseCancellationException("undefined variable in assignment: \"" + variable_name + "\"");
        }
        Function<Integer, Integer> right_expression = visit(ctx.rExpression());
        //create lambdas
        Function<Integer, Integer> assignment = value -> {
            return variables.replace(variable_name, right_expression.apply(0));
        };
        if(isParallel()){
            stack.add(assignment);
        }else {
            assignment.apply(0);
        }

        //dummy return
        return i -> 0;
    }

    @Override
    public Function<Integer, Integer> visitSubtractiveExpression(OS_CParser.SubtractiveExpressionContext ctx) {
        Function<Integer, Integer> left_expression = visit(ctx.rExpression(0));
        Function<Integer, Integer> right_expression = visit(ctx.rExpression(1));
        return i -> left_expression.apply(0) - right_expression.apply(0);
    }

    @Override
    public Function<Integer, Integer> visitAdditiveExpression(OS_CParser.AdditiveExpressionContext ctx) {
        Function<Integer, Integer> left_expression = visit(ctx.rExpression(0));
        Function<Integer, Integer> right_expression = visit(ctx.rExpression(1));
        return i -> left_expression.apply(0) + right_expression.apply(0);
    }

    @Override
    public Function<Integer, Integer> visitDivisiveExpression(OS_CParser.DivisiveExpressionContext ctx) {
        Function<Integer, Integer> left_expression = visit(ctx.rExpression(0));
        Function<Integer, Integer> right_expression = visit(ctx.rExpression(1));
        return i -> left_expression.apply(0) / right_expression.apply(0);
    }

    @Override
    public Function<Integer, Integer> visitMultiplicativeExpression(OS_CParser.MultiplicativeExpressionContext ctx) {
        Function<Integer, Integer> left_expression = visit(ctx.rExpression(0));
        Function<Integer, Integer> right_expression = visit(ctx.rExpression(1));
        return i -> left_expression.apply(0) * right_expression.apply(0);
    }

    public Function<Integer, Integer> visitParentheticalExpression(OS_CParser.ParentheticalExpressionContext ctx) {
        Function<Integer, Integer> expression = visit(ctx.rExpression());
        return i -> expression.apply(0);
    }

    @Override
    public Function<Integer, Integer> visitRValue(OS_CParser.RValueContext ctx) {
        final String r_value_name = ctx.Identifier().getText();
        return i -> {
            Integer value = variables.get(r_value_name);
            if(value == null){
                throw new UndefinedVariableException("undefined variable \"" + r_value_name + "\"");
            }
            return value;
        };
    }
}
