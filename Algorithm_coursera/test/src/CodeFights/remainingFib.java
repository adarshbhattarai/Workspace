package CodeFights;

public class remainingFib {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(remainFib("2527321323"));

	}
	static String remainFib(String number) {
	    long fib1 = 3;
	    long fib2 = 5;
	    long fibn;
	    boolean found = false;
	    long k = 4;
	    long num = 0;
	    long diff = 0;
	    long lnum = Long.parseLong(number);
	    while(!found){ 
	        diff = fib2 - fib1 -1;
	        if(diff > 0 && num + diff < lnum){
	            num = num + diff;
	            fibn = fib1 + fib2;
	            fib1 = fib2;
	            fib2 = fibn;
	        }
	        if(diff > 0 && num + diff >= lnum ){
	            //this gets missing fibonacchi
	            fib1 = fib1 + (lnum - num);
	            found = true;
	        }
	        
	        
	        /*
	        if(k<fib2){
	            num++;
	            k++;
	        }
	        else{
	        fibn = fib1 + fib2;
	        diff = fib2  - fib1; 
	            if(num+ diff > = number){
	                //it is within here
	            }
	            else{
	                fib1 = fib2;
	                fib2 = fib2 + diff + 1;
	            }
	        fib1 = fib2;
	        fib2 = fibn;
	        k= fib1 + 1;
	        }
	        if(num  == Long.parseLong(number)){
	            found = true;
	        }      */  
	        
	    }
	    return String.valueOf(fib1);
	    

	}



}
