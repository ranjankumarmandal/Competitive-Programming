package dsAndAlgo_Foundation_java.functionAndArray;

import java.util.Scanner;

public class DigitFrequency_NumberSystem {
	public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int d = scn.nextInt();
        int f = getDigitFrequency(n, d);
        System.out.println(f);
    }

    public static int getDigitFrequency(int n, int d) {
        // write code here
        int count = 0;
        while(n > 0) {
            int rem = n % 10;
            n = n / 10;
            
            if(rem == d) count = count + 1;
        }
        
        return count;
    }
}
