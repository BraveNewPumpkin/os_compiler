/**
 * Created by kylebolton on 10/28/16.
 */

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.sun.org.apache.xpath.internal.operations.Bool;
import org.antlr.v4.runtime.tree.ParseTree;

public class Runner {
    public static void main(String args[]) {
        String code_filepath = args[0]; //TODO error checking?
        String data_filepath = args[1]; //TODO error checking?
        Boolean verbose = true; //TODO get from args
        try (
                FileInputStream source_code_input_stream = new FileInputStream(code_filepath);
                FileInputStream data_input_stream = new FileInputStream(data_filepath);
        ) {
            OSCAntlrParser parser = new OSCAntlrParser();
            ParseTree tree = parser.parse(source_code_input_stream);
            if(verbose){
                //TODO print tree
            }
            Map<String, Integer> variables = new HashMap<>();
            parser.getInputVariables(data_input_stream);
            parser.runCalculations(variables);
            parser.write(variables, System.out);

        } catch (IOException e) {
            System.err.printf("failed to load config file: %s\n", code_filepath);
        }
    }
}
