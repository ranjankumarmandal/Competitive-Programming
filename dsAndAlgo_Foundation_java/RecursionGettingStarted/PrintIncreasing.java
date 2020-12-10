package dsAndAlgo_Foundation_java.RecursionGettingStarted;

import java.util.*;

public class PrintIncreasing {

    public static void main(String[] args) throws Exception {
    	Scanner scn = new Scanner(System.in);
    	
        int n = scn.nextInt();
        pi(n);
    }

    public static void pi(int n) {
        if (n == 0)
            return;
        pi(n - 1);
        System.out.println(n);
    }
}