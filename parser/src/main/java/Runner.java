/**
 * Created by kylebolton on 10/28/16.
 */

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;

import com.sun.org.apache.xpath.internal.operations.Bool;
import org.antlr.v4.runtime.tree.ParseTree;

public class Runner {
    public static void main(String args[]) {
        String code_filepath = args[0]; //TODO error checking?
        Boolean verbose; //TODO get from args
        try (FileInputStream source_code_input_stream = new FileInputStream(code_filepath)) {
            OSCAntlrParser parser = new OSCAntlrParser(source_code_input_stream);
            ParseTree tree = parser.parse(source_code_input_stream);//TODO decide which one gets the input stream
            if(verbose){
                //TODO print tree
            }
            Map<String, Integer> variables;
            parser.getInputVariables();
            parser.runCalculations(variables);
            parser.write(variables, System.out);

        } catch (IOException e) {
            System.err.printf("failed to load config file: %s\n", code_filepath);
        }
    }
}
