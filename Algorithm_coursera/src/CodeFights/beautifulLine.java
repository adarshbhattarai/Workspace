package CodeFights;

public class beautifulLine {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			System.out.println(beautifulText("Look at this example of a correct text",5,15));
	}
	
	static boolean beautifulText(String inputString, int l, int r) {

		  for (int i = l + 1; i <= r + 1; i++) {
			  System.out.println(i);
		    	
		    if (inputString.length() % i != i - 1) {
		    	System.out.println("found: " + i);
		    	
		      continue;
		    }

		    boolean ok = true;
		    for (int k = i - 1; k < inputString.length(); k=k+i) {
		    	System.out.println("K: " +k);
		      if (inputString.charAt(k) != ' ') {
		    	  System.out.println("K" +k);
		        ok = false;
		        break;
		      }
		    }

		    if (ok ) {
		      return true;
		    }
		  }

		  return false;
		}


}
