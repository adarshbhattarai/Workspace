package CodeFights;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CodeFight {

/*	Given a positive integer n, output the string representation of all the numbers from 1 to n inclusive while replacing multiples of 5 with Code, multiples of 7 with Fight and multiples of both 5 and 7 with CodeFight.

	Example

	For n = 15, the output should be

	CodeFight(n) = 
	[
	    "1",
	    "2",
	    "3",
	    "4",
	    "Code",
	    "6",
	    "Fight",
	    "8",
	    "9",
	    "Code",
	    "11",
	    "12",
	    "13",
	    "Fight",
	    "Code"
	]*/


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0 ; i< 5; i++){
			System.out.println(CodeFight(0)[0]);
		}
		

	}
	
	static String[] CodeFight(int n) {
		
		if(n==0) return new String[0];
	    
		 List<String> code = new ArrayList<>();
		    for(int i = 1; i<= n ; i++){
		    	
		    	 if(i%35 == 0)	  code.add("CodeFight");
		    	 
		         else if(i%5 == 0)code.add("Code");
		              
		         else if(i%7 == 0)code.add("Fight");
	    
		         else code.add(String.valueOf(i));
		    }
		    String[] array = new String[code.size()];
		    code.toArray(array);
		    return array;
		}

}
