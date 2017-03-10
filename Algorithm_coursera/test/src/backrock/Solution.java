package backrock;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Solution {
	
	public static void main(String[] args) {
		
		String[] a = new String []{"victor","verona","victor","arina","wilson"};
		//System.out.println(electionWinner(a));
		
	}
	

    static int findMax(int n, String tree) {
        String [] a = tree.split(" ");
        //  3 4 5 1 3 # 1
        	
        	int count1 = 0;
        	int count2=0;
        	int j=0;
        	for(int i=0; i<a.length;i++){
        		
        		if(!a[i].equals("#")  ) count1+=Integer.valueOf(i);
        		i= (int)Math.pow(2,j+1)
        	}
        
        return 0;

    }

	/*
	 *   3 4 5 1 3 # 1
	 * 
	 * 
	static String electionWinner(String[] votes) {
		
			
			Map<String,Integer> m = new HashMap<String,Integer>();
			Set<String> s = new TreeSet<String>();
			int maximum = 0;
			String winner = "";
			for(String vote : votes){
				if(m.containsKey(vote)) {
					m.put(vote, m.get(vote)+1);
					if(m.get(vote) >= maximum){
						s.add(vote);
						}
					else{
						s.remove(vote);
					}
					};
				m.put(vote,1);
			}
			
			
			
			return  ((TreeSet<String>) s).last();
    }
*/
	
/*
	 static int[] arbitrage(String[] quotes) {

	        int[] a = new int[quotes.length-1];
	        
	        for(int i = 0; i< quotes.length;i++ ){
	        	String[] b = quotes[i].split(" ");
	        	float f = Integer.parseInt(b[0]);
	        	int s = Integer.parseInt(b[1]);
	        	int t = Integer.parseInt(b[2]);
	        	float result = ((100000/f)/s)/t;
	        	if(result > 100000 ) a[i] = 100000-(int)(result);
	        	else a[i] = 0;
                System.out.print(a[i] + " ");
	        }
	        return a;
	 
	    }*/
}
