/**
 * Created by kylebolton on 10/28/16.
 */

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Runner {
    public static void main(String args[]) {
        String code_filepath = args[0]; //TODO error checking?
        String data_filepath = args[1]; //TODO error checking?
        Boolean verbose = true; //TODO get from args
        try (
                FileInputStream source_code_input_stream = new FileInputStream(code_filepath);
                BufferedReader data_input = new BufferedReader(new FileReader(data_filepath));
        ) {
            OS_CRunner os_c_runner = new OS_CRunner();
            String string_tree = os_c_runner.parse(source_code_input_stream);
            if(verbose){
                System.out.println(string_tree);
            }
            Map<String, Integer> variables = os_c_runner.getInputVariables(data_input);
//            os_c_runner.runCalculations(variables);
//            os_c_runner.write(variables, System.out);

        } catch (IOException e) {
            System.err.printf("failed to load config file: %s\n", code_filepath);
        } catch (InvalidDataException e){
            System.err.print(e.toString());
        }
    }
}
