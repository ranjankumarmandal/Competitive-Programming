package dsAndAlgo_Foundation_java.patterns;

import java.util.Scanner;

/*
*	*	*	*	*	
	*	*	*	*	
		*	*	*	
			*	*	
				*
 */
public class Pattern4 {
	public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int copyN = n;
        // write ur code here
        
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= copyN; j++) System.out.print("*\t");
            System.out.println();
            for(int k = 1; k <= i; k++) System.out.print("\t");
            copyN--;
        }

    }
}
