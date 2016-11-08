/**
 * Created by Kyle Bolton on 11/7/2016.
 */
import edu.uh.cs.os_c.OS_CBaseVisitor;
import edu.uh.cs.os_c.OS_CParser;

import java.util.Arrays;
import java.util.List;

public class OS_CVisitorWrite extends OS_CBaseVisitor<List<String>> {
    private List<String> input_variables;
    public OS_CVisitorWrite(List<String> input_variables) {
        this.input_variables = input_variables;
    }

    @Override
    public List<String> visitWriteFunction(edu.uh.cs.os_c.OS_CParser.WriteFunctionContext ctx) {
        List<String> variable_names;
        variable_names = Arrays.asList(ctx.identifierList().getText().split("[, ]"));
        input_variables.addAll(variable_names);
        return variable_names;
    }
}
