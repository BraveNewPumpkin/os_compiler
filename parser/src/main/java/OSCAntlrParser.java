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
        ANTLRInputStream input = new ANTLRInputStream();
        // parse
        // this
        // file
        JavaLexer lexer = new JavaLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JavaParser parser = new JavaParser(tokens);
        ParseTree tree = parser.compilationUnit(); // see the grammar ->
        // starting point for
        // parsing a java file



        MyVisitor visitor = new MyVisitor(); // extends JavaBaseVisitor<Void>
        // and overrides the methods
        // you're interested
        visitor.visit(tree);
    }
}
