/**
 * Created by Kyle Bolton on 10/20/2016.
 */

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import edu.uh.cs.os_c.*;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
//import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class OSCAntlrParser{
    private OS_CParser parser;
    private ParseTree tree;

    public ParseTree parse(FileInputStream source_code_input_stream) throws IOException {
        ANTLRInputStream input = new ANTLRInputStream(source_code_input_stream);
        OS_CLexer lexer = new OS_CLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        parser = new OS_CParser(tokens);
        tree = parser.compilationUnit();
    }
    public Map<String, Integer> getInputVariables(FileInputStream data_input_stream) throws IOException {
        Map<String, Integer> variables = new HashMap<>();
        //TODO define OS_CVisitorDeclarations
        //TODO visit declarations and get list of all variables
        OS_CVisitorDeclarations visitor = new OS_CVisitorDeclarations();
        List<String> input_variables = visitor.visit(tree);
        //TODO loop through variables and read them from data file
        return variables;
    }
    public void runCalculations(Map<String, Integer> variables) {
        //TODO implement OS_CVisitorCalculations
    }
    public void write(Map<String, Integer> variables, PrintStream out){
        //TODO implement OS_CVisitorWrite
        //TODO write all specified variables to out
    }
}
