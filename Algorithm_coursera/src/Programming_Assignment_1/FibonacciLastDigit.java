package Programming_Assignment_1;

import java.io.File;
import java.io.FileOutputStream;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.Stream;

public class FibonacciLastDigit {
    private static int getFibonacciLastDigitNaive(int n) {
        if (n <= 1)
            return n;

        int previous = 0;
        int current = 1;
        

        for (int i = 0; i < n - 1; ++i) {
            int tmp_previous = previous;
            previous = current%10;
            current = current%10 +tmp_previous;
           // System.out.println(tmp_previous + " " +previous+ " " + current);
          
        }
        // fn = 1/sqrt(5) ((1+sqrt(5))/2)^n -  1/sqrt(5) ((1-sqrt(5))/2)^n
        
        return current%10;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int c = getFibonacciLastDigitNaive(n);
        System.out.println(c);
    }
}

