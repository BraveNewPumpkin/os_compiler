import edu.uh.cs.os_c.OS_CBaseVisitor;
import edu.uh.cs.os_c.OS_CParser;

/**
 * Created by kylebolton on 10/31/16.
 */
public class OS_CVisitorIo extends OS_CBaseVisitor<String> {
    @Override
    public String visitReadFunction(OS_CParser.IoOperationContext ctx) {

        return str;
    }
}
