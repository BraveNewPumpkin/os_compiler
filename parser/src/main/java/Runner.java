/**
 * Created by kylebolton on 10/28/16.
 */
public class Runner {
    public static void main(String args[]) {
        String code_filepath = args[0]; //TODO error checking?
        String code_string = readSource(code_filepath);
        Parser parser = new OSCAntlrParser;
        parser.parse(code_string);
    }
    String readSource(code_filepath){
        new FileInputStream(code_filepath);
        //TODO read in code from file
        String code_string;
        return code_string;
    }
