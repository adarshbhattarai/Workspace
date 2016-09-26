/* Worst case run time O(1), best case O(1), Averagecase O(logn) */

package divide_conquer;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner scanner = new Scanner(System.in);
			int n = scanner.nextInt();
			int[] array = new int[n];
			for(int i=0; i<n;i++){
				System.out.print(i+1 + " ");
				array[i]= (int)Math.floor(Math.random()*100);
				System.out.println(array[i]);
			}
			Arrays.sort(array);
			for (int a :  array) {
				System.out.print(a + " "); 
			}
			System.out.println("");
			System.out.println("Enter number you want to find");
			int key = scanner.nextInt();
				
			System.out.println("The index is " + binarysearch(array,0,n-1,key));
			
	}

	private static int binarysearch(int[] array, int low, int high, int key) {
		
		
		
		if(low>high)
			return low-1;
		int mid = (int) (Math.floor( (high+low)/2));
		if(key == array[mid])
			return mid;
		if(key>array[mid])
			return binarysearch(array, mid+1, high, key);
		
		return binarysearch(array, low, mid-1, key);
		
	}

}
