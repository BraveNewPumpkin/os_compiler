/**
 * Created by Kyle Bolton on 10/20/2016.
 */

import edu.uh.cs.os_c.*;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.*;
import java.util.stream.Collectors;
//import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class OS_CRunner {
    private OS_CParser parser;
    private ParseTree tree;

    public String parse(FileInputStream source_code_input_stream) throws IOException {
        ANTLRInputStream input = new ANTLRInputStream(source_code_input_stream);
        OS_CLexer lexer = new OS_CLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        parser = new OS_CParser(tokens);
        tree = parser.compilationUnit();
        return tree.toStringTree(parser);
    }

    public Map<String, Integer> getInputVariables(BufferedReader data_input) throws IOException, InvalidDataException {
        Map<String, Integer> variables = new HashMap<>();
        return getInputVariables(data_input, variables);
    }

    public Map<String, Integer>
    getInputVariables(
            BufferedReader data_input,
            Map<String, Integer> variables
    ) throws IOException, InvalidDataException {
        List<String> input_variables = new ArrayList<String>();
        OS_CVisitor visitor = new OS_CVisitorDeclarations(input_variables);
        //visit declarations and get list of all variables
        visitor.visit(tree);
        //put all variables in map. initial values are null.
        variables.putAll(input_variables.parallelStream().collect(Collectors.toConcurrentMap(
                input_variable -> input_variable,
                input_variable -> 0,
                (left_input_variable, right_input_variable) -> left_input_variable
        )));

        //get list of variables to read from data file
        input_variables.clear();
        visitor = new OS_CVisitorRead(input_variables);
        visitor.visit(tree);
        //create and populate list of values parallel to list of variable names
        List<Integer> values = new ArrayList<>(input_variables.size());
        String line = data_input.readLine();
        String[] value_strings = line.split("[, ]");
        for(String value_string: value_strings){
            values.add(Integer.parseInt(value_string));
        }
        Iterator<Integer> values_iter = values.iterator();
        //map each variable name to each read in value and store in variables
        input_variables.forEach(variable_name -> variables.put(variable_name, values_iter.next()));
        if(values_iter.hasNext()){
            throw new InvalidDataException("More values in data input buffer than specified in read() command");
        }

        return variables;
    }

    public void runCalculations(Map<String, Integer> variables) {
        OS_CVisitor visitor = new OS_CVisitorCalculations(variables);
        //visit and perform all calculations
        visitor.visit(tree);
    }
    public void write(Map<String, Integer> variables, PrintStream out){
        //TODO implement OS_CVisitorWrite
        //TODO write all specified variables to out
    }
}
