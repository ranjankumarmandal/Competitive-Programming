package dsAndAlgo_Foundation_java.RecursionGettingStarted;

import java.util.*;

public class PrintDecreasing {
   
    public static void main(String[] args) throws Exception {
    	Scanner scn = new Scanner(System.in);
    	
        int n = scn.nextInt();
        // expectation
        pd(n);
    }

    public static void pd(int n) {
        // base case
        if (n == 0) {
            return;
        }
        // done by myself
        System.out.println(n);
        // faith
        pd(n - 1);
    }
}