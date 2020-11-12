package dsAndAlgo_Foundation_java.patterns;

import java.util.Scanner;

/*
 *				*	
*				*	
*		*		*	
*	*		*	*	
*				*	
 */
public class Problem20 {
	public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        // write ur code here
        
        for(int cr = 1; cr <= n; cr++) {
            for(int cc = 1; cc <= n; cc++) {
                if(cr == cc  && cr > n / 2) System.out.print("*\t");
                else if(cr + cc == n + 1 && cr > n / 2) System.out.print("*\t");
                
                else if(cc == 1) System.out.print("*\t");
                else if(cc == n) System.out.print("*\t");
                else System.out.print("\t");
            }
            
            System.out.println();
        }

    }
}
