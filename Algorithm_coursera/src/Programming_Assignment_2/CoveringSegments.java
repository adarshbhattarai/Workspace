package Programming_Assignment_2;

import java.util.*;

public class CoveringSegments {

    private static int[] optimalPoints(Segment[] segments) {
       
    	
    	HashSet<Integer> intersection = new HashSet<>();
    	
    	int[] points = new int[2 * segments.length];
        for (int i = 0; i < segments.length; i++) {
            points[2 * i] = segments[i].start;
            points[2 * i + 1] = segments[i].end;
        }
        
        
        for(int i=1; i<points.length;i=i+2){
        	int minimum = points[i];
        	for(int j=i+2; j<points.length; j=j+2){
        		if(points[j]<minimum){
        			minimum = points[j];
        			int tempa = points[j-1];
        			int tempb = points[j];
        			points[j-1] = points[i-1];
        			points[j]= points[i];
        			points[i-1]=tempa;
        			points[i]=tempb;
        			
        		}
        	}
        }
        
       
        
        int i = 1;
        int j=1;
        while(j<points.length){
        	int initialendPoint = points[i];
        	if( j+1 < points.length &&  initialendPoint < points[j+1]){
        		intersection.add(initialendPoint);
        		i=j+2;
        		
        	}
        	intersection.add(initialendPoint);
        	
        	j=j+2;
        	
        }
    	Integer[] arrayInt= intersection.toArray(new Integer[intersection.size()]);

    	int[] array = new int[arrayInt.length]; 
    	int k = 0;
    	for (int a: arrayInt){
    		array[k] = a;
    		k++;
    	}
    	Arrays.sort(array);
        return array;
    }

    private static class Segment {
        int start, end;

        Segment(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Segment[] segments = new Segment[n];
        for (int i = 0; i < n; i++) {
            int start, end;
            start = scanner.nextInt();
            end = scanner.nextInt();
            segments[i] = new Segment(start, end);
        }
        int[] points = optimalPoints(segments);
        System.out.println(points.length);
        for (int point : points) {
            System.out.print(point + " ");
        }
      /*
        
   	int a=0;
    	while(a<1){
    		Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
    		System.out.println(n);
    		Segment[] segments = new Segment[n];
            for (int i = 0; i < n; i++) {
             int start, end;
             start = (int) Math.floor(Math.random() * 101);
             end = (int) Math.floor(Math.random() * 101);
            segments[i] = new Segment(start, end);
            System.out.print(start + " " + end + " ");
            System.out.println("");
            }
            int[] points = optimalPoints(segments);
            System.out.println( "\t" +points.length);
            for (int point : points) {
                System.out.print(point + " ");
            }
            a++;
    		
    	}
*/  	
    }
}