package CodeFights;

/*
 * 
 *Every Christmas Mary's brother buys her a jar of candies, which naturally makes here very happy. Each year she counts the candies in the jar and writes down their number in her notebook, along with the current year.

The Christmas is coming, and Mary wants to know in advance how many candies she will get this time. She turns to you, her brother's best friend, for help. To get you started, Mary gave you the list of values where she has been writing all the information so far.

Your task is to study the list and try to determine how many candies Mary will get this year. You know that Mary's brother is very fond of statistics, so you want to approach the problem with the simple least squares linear regression model. Here's the result you should return:

the next year number;
the predicted number of candies Mary will get, rounded down to the nearest integer;
the trend in the number of candies that can be "increasing", "decreasing" or "stable'.
Example

For

values = [2012, 3, 2013, 4, 2014, 5, 2015, 6, 
          2016, 7, 2017, 8, 2018, 9, 2019, 10]
the output should be
candyForeCast(values) = ["2020", "11", "increasing"].

As you can see, each year Mary receives one more candy than the previous one. Thus, the trend is clearly "increasing", and in the next year of 2020 she will get 10 + 1 = 11 candies.
 * 
 * */

public class LeastSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}
	
	String[] candyForeCast(int[] values) {
	    
	    String [] candy = new String [3];
	    int [] year = new int[values.length /2];
	    int[] data = new int[values.length/2];
	   for(int i = 0; i< values.length ; i++){
	       if(i%2 == 0){
	           year[i/2] = values[i];
	       }
	       else {
	           data[i/2] = values[i];
	       }
	   }
	        int N = values.length/2;
	    
	        int numerator = ((N * mul(data,year)) - (sum(year)*sum(data)));
	            int denomenator = ((N*sumsq(year)) - (sum(year) * sum(year)));
	    
	        float b = numerator/denomenator; 
	            
	            
	        float a = (sum(data) - b*sum(year))/N;
	    
	        int  newYear = year[year.length-1] + 1;
	        String status = "";
	    status = (b<0? "decreasing" : "increasing");
	        if(b == 0) status = "stable";
	        float newVal = (a +( b * newYear));
	          System.out.println(a + " "+ b);
	        candy[0] = String.valueOf(newYear);
	        candy[1] = String.valueOf((int)newVal);
	        candy[2] = status;
	    
	        System.out.println(candy[0] + " "+ candy[1] + " " + candy[2]);
	        return candy;
	        

	    
	}

	int mul (int [] data , int [] year){
	    int sum =0;
	    for(int i=0; i< data.length; i++){
	        sum = sum + (data[i]* year[i]);
	    } 
	    return sum;
	}
	int sum (int[] data){
	    int sum =0;
	    for(int i=0; i< data.length; i++){
	        sum = sum + data[i];
	    } 
	    return sum;
	}
	int sumsq(int [] year){
	    int sum =0;
	    for(int i=0; i< year.length; i++){
	        sum = sum + (year[i]* year[i]);
	    } 
	    return sum;
	}


}
