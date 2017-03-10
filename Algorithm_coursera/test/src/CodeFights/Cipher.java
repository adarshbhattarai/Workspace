package CodeFights;

public class Cipher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println(decipher("10197115121"));
	}
	static String decipher(String cipher) {
	    String code="";
	    int i = 0;
	    String abc="";
	    while(i !=cipher.length()){
	    Character value = cipher.charAt(i);
	    if(Character.getNumericValue(value) ==  1){
	        abc =  ""+cipher.charAt(i)+cipher.charAt(i+1) + cipher.charAt(i+2);
	        i =i + 3;
	    }
	    
	    else{
	    	// System.out.println(cipher.charAt(0));
	    	 abc = "" +cipher.charAt(i)+cipher.charAt(i+1);
		      i=i+2;
	    }
	        
	    code = code + Character.toString((char) (Integer.parseInt(abc)));

	    }
	    return code;
	}


}
