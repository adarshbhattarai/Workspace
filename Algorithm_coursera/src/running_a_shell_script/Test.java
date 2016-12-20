package running_a_shell_script;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test {

	  public static void main(String[] args) throws Exception {
          try {
                 
        	  String target = new String("/home/adarsh/aaa.sh");
                  Runtime rt = Runtime.getRuntime();
                  Process proc = rt.exec(target);
                  proc.waitFor();
                  StringBuffer output = new StringBuffer();
                  BufferedReader reader = new BufferedReader(new InputStreamReader(proc.getInputStream()));
                  String line = "";                       
                  while ((line = reader.readLine())!= null) {
                          output.append(line + "\n");
                  }
                  System.out.println("### " + output);
          } catch (Throwable t) {
                  t.printStackTrace();
          }
  }

}
