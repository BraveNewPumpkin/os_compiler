import edu.uh.cs.os_c.OS_CBaseVisitor;
import edu.uh.cs.os_c.OS_CParser;

import java.util.Arrays;
import java.util.List;

/**
 * Created by kylebolton on 10/31/16.
 */
public class OS_CVisitorDeclarations extends OS_CBaseVisitor<List<String>> {
    private List<String> input_variables;
    public OS_CVisitorDeclarations(List<String> input_variables) {
       this.input_variables = input_variables;
    }

    @Override
    public List<String> visitDeclaration(OS_CParser.DeclarationContext ctx) {
        List<String> variable_names;
        //TODO visit both input_var and internal_var declarations and populate variable names
        variable_names = Arrays.asList(ctx.identifierList().getText().split("[, ]"));
        input_variables.addAll(variable_names);
        return variable_names;
    }

//    @Override
//    public List<String> visit
}
