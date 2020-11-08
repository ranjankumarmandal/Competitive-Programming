package dsAndAlgo_Foundation_java.patterns;

import java.util.Scanner;

/*
				*	
			*	*	
		*	*	*	
	*	*	*	*	
*	*	*	*	*	

 */
public class Pattern3 {
	public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int copyN = n;
        // write ur code here
        
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= copyN-1; j++) System.out.print("\t");
            for(int k = 1; k <= i; k++) System.out.print("*\t");
            copyN--;
            System.out.println();
        }

    }
}
