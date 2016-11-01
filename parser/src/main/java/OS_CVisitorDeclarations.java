import edu.uh.cs.os_c.OS_CBaseVisitor;
import edu.uh.cs.os_c.OS_CParser;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kylebolton on 10/31/16.
 */
public class OS_CVisitorDeclarations extends OS_CBaseVisitor<List<String>> {
    @Override
    public List<String> visitDeclaration(OS_CParser.DeclarationContext ctx) {
        List<String> variable_names = new ArrayList<>();
        //TODO visit both input_var and internal_var declarations and populate variable names
        return visitChildren(ctx);
    }

    @Override
    public List<String> visitReadFunction(OS_CParser.IoOperationContext ctx) {
        List<String> variable_names = new ArrayList<>();
        //TODO get variable names from ctx
        return variable_names;
    }
}
