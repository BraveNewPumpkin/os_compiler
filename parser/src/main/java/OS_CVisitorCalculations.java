/**
 * Created by Kyle Bolton on 11/6/2016.
 */

import edu.uh.cs.os_c.OS_CBaseVisitor;
import edu.uh.cs.os_c.OS_CParser;
import org.antlr.v4.runtime.misc.ParseCancellationException;

import java.util.Map;
import java.util.concurrent.Semaphore;
import java.util.function.Function;

public class OS_CVisitorCalculations extends OS_CBaseVisitor<Function<Integer, Integer>> {
    private Map<String, Integer> variables;
    private Map<String, Semaphore> locks;
    private int parallelCount;

    public OS_CVisitorCalculations(Map<String, Integer> variables){
        parallelCount = 0;
        this.variables = variables;
    }

    public boolean isParallel(){
        return parallelCount > 0;
    }

    @Override
    public Function<Integer, Integer> visitStartParallel(OS_CParser.StartParallelContext ctx) {
        parallelCount++;
        return i -> 0;
    }

    @Override
    public Function<Integer, Integer> visitEndParallel(OS_CParser.EndParallelContext ctx) {
        parallelCount--;
        //TODO runParallel()
        return i -> 0;
    }

    @Override
    public Function<Integer, Integer> visitAssignmentExpression(OS_CParser.AssignmentExpressionContext ctx) {
        String variable_name = ctx.Identifier().getText();
        if(!variables.containsKey(variable_name)){
            //would be a checked exception except that we can't change the interface as it's dynamically generated
            throw new ParseCancellationException("undefined variable in assignment: \"" + variable_name + "\"");
        }
        //TODO figure out how to call visitRExpression() and use lambda in lambda
        //create lambdas
        Function<Integer, Integer> assignment = value -> {
            return value;
        };

        return assignment;
    }



}
