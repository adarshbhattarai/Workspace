package running_a_shell_script;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class hello {
	public static void main(String[] args) {
		 String fs = System.getProperty("file.separator");
	     //   String command = System.getenv("home") + fs + "adarsh" + fs + "aaa.sh";
		 String command = new String("/home/adarsh/aaa.sh");
	        String output = executeCommand(command);
	        System.out.println(output);
		
	}
	
	 
	    private static String executeCommand(String command) {

	        StringBuffer output = new StringBuffer();

	        Process p;
	        try {
	            p = Runtime.getRuntime().exec(command);
	            p.waitFor();
	            BufferedReader reader =
	                    new BufferedReader(new InputStreamReader(p.getInputStream()));

	            String line = "";
	            while ((line = reader.readLine())!= null) {
	                output.append(line + "\n");
	            }

	        } catch (Exception e) {
	            e.printStackTrace();
	        }

	        return output.toString();
	    }

}
