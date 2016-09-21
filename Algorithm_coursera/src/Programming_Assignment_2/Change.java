package Programming_Assignment_2;

import java.util.Scanner;

public class Change {
    private static int getChange(int m) {
    	int count=0;
    	int change=0;
    	int total =m;
    	if(total/10 > 0){
    		count = total/10;
    		total = total- 10*count;
    		change=count;
    	}
    	
    	if(total/5 > 0){
    		count = total/5;
    		change = change+count;
    		total = total- 5;
    	}
    	
    	if(total>0){
    		change = change+total;
    	}
       
        return change;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        System.out.println(getChange(m));

    }
}

