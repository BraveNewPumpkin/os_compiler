/**
 * Created by kylebolton on 10/28/16.
 */

import java.io.FileInputStream;
import java.io.IOException;

public class Runner {
    public static void main(String args[]) {
        String code_filepath = args[0]; //TODO error checking?
        try (FileInputStream source_code_input_stream = new FileInputStream(code_filepath)) {
            OSCAntlrParser parser = new OSCAntlrParser(source_code_input_stream);
            parser.parseAndRun(source_code_input_stream);//TODO decide which one gets the input stream
        } catch (IOException e) {
            System.err.printf("failed to load config file: %s\n", configFileName);
        }
    }
}
