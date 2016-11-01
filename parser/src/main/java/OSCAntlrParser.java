/**
 * Created by Kyle Bolton on 10/20/2016.
 */

import java.io.FileInputStream;
import java.io.IOException;

import edu.uh.cs.os_c.*;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
//import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class OSCAntlrParser implements OS_CBaseVisitor{
    public Class parse(String source_code) {
        ANTLRInputStream input = new ANTLRInputStream(source_code);
        OS_CLexer lexer = new OS_CLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        OS_CParser parser = new OS_CParser(tokens);
        ParseTree tree = parser.compilationUnit(); // see the grammar ->
        // starting point for
        // parsing a java file



        OS_CVisitor visitor = new OS_CVisitor(); // extends JavaBaseVisitor<Void>
        // and overrides the methods
        // you're interested
        visitor.visit(tree);
    }
}
