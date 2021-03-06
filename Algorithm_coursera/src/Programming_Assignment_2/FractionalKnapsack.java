package Programming_Assignment_2;


import java.util.Scanner;


public class FractionalKnapsack {
    private static double getOptimalValue(int capacity, int[] values, int[] weights) {
        double value = 0;
        double total = capacity;
        double[] valuePerWeight = new double[values.length];
        for(int i=0; i<values.length; i++){
        	valuePerWeight[i] = (double)values[i]/weights[i];   
        	//System.out.println(valuePerWeight[i] + " " + weights[i]);
        }
        
        double temp;
        for(int i=0; i<valuePerWeight.length;i++){
        	double max =valuePerWeight[i];
        	for(int j=i+1; j<valuePerWeight.length;j++){
        		if(valuePerWeight[j]>max){
        			max= valuePerWeight[j];
        			temp= valuePerWeight[j];
        			valuePerWeight[j] = valuePerWeight[i];
        			valuePerWeight[i]=temp;
        			temp = weights[j];
        			weights[j] = weights[i];
        			weights[i] = (int) temp;
        			
        		}
        	}
        /*	System.out.println("Changed");
        	System.out.println(valuePerWeight[i] + " " + weights[i]);*/
        }
        
        for (int i = 0; i < valuePerWeight.length; i++) {
        	
        	
			if(weights[i]<= total){
				value += valuePerWeight[i]*weights[i];
				total = total - weights[i];
			}
			
			
			else{
				value +=  total * valuePerWeight[i];	
			}
			
			
			
		}
        
       
        
        
        return value;
    }

    public static void main(String args[]) {
      Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int capacity = scanner.nextInt();
        int[] values = new int[n];
        int[] weights = new int[n];
        for (int i = 0; i < n; i++) {
            values[i] = scanner.nextInt();
            weights[i] = scanner.nextInt();
        }
        System.out.println(getOptimalValue(capacity, values, weights));
        
      
    }
} 
