import edu.uh.cs.os_c.OS_CBaseVisitor;
import edu.uh.cs.os_c.OS_CParser;

import java.util.ArrayList;

/**
 * Created by kylebolton on 10/31/16.
 */
public class OS_CVisitorRead extends OS_CBaseVisitor<ArrayList<String>> {
    @Override
    public ArrayList<String> visitReadFunction(OS_CParser.IoOperationContext ctx) {
        ArrayList<String> variable_names;
        //TODO get variable names from ctx
        return variable_names;
    }
}
