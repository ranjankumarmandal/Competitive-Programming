package dsAndAlgo_Foundation_java.patterns;

import java.util.Scanner;

/*
3 * 1 = 3
3 * 2 = 6
3 * 3 = 9
3 * 4 = 12
3 * 5 = 15
3 * 6 = 18
3 * 7 = 21
3 * 8 = 24
3 * 9 = 27
3 * 10 = 30
 */
public class Pattern14 {
	public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        // write ur code here
        
        for(int cr = 1; cr <= 10; cr++) {
            int mult = n*cr;
            System.out.println(n+" * "+cr+" = "+mult);
        }

    }
}
