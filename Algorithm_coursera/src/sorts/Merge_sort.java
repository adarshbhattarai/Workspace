package sorts;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;



public class Merge_sort {
				
	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		int number = n.nextInt();
		int [] array = new int[number];
		for (int i = 0; i < number; i++) {
			array[i] = (int) Math.floor(Math.random()*100);
			System.out.print(array[i] + " ");
		}
		System.out.println(" ");
		int[] result = mergeSort(array);
		for (int i : result) {
			System.out.print(" "+ i);
		}
		
	}

	private static int[] mergeSort(int[] array) {
		// TODO Auto-generated method stub
		if(array.length==1) return array;
		int m = (int)Math.floor(array.length/2);
		int [] b = new int[m];
		int [] c = new int[array.length-m];
		int [] resultArray = new int[array.length];
		for(int i=0; i<m ; i++){
			b[i] = array[i];
		}
		for(int i=0;i< c.length; i++){
			c[i] = array[m+ i];
		}	
		int[] first_array = mergeSort(b);
		int[] second_array = mergeSort(c);
		resultArray = Merge(first_array,second_array);
		for (int i : resultArray) {
			System.out.print(" result Array = " + i);
		}
		System.out.println();
		return resultArray;
	}

	private static int[] Merge(int[] a, int[] b) {
		// TODO Auto-generated method stub
		int[] d = new int[a.length + b.length];
		int k=0;
		int i = 0;
		int j=0;
		while(i<a.length && j<b.length){
			
			if(a[i]<=b[j]){
				d[k] = a[i];
				k++;
				i++;
			}
			else{
				d[k] = b[j];
				j++;
				k++;
			}
			if(i == a.length && j <b.length){
				d[k] = b[j];
				j++;
				k++;
			} 
			if(j== b.length && i < a.length){
				d[k]= a[i];
				i++;
				k++;
			}
			
		}

		return d;
	}

}