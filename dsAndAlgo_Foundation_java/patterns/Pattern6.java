package dsAndAlgo_Foundation_java.patterns;

import java.util.Scanner;

/*
*	*	*		*	*	*	
*	*				*	*	
*						*	
*	*				*	*	
*	*	*		*	*	*	
 */
public class Pattern6 {
	public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nosp = 1;
        int nost = n;
        // write ur code here
        
        for(int cr = 1; cr <= n; cr++) {
            for(int cst = 1; cst <= nost+1; cst++) {
                System.out.print("*\t");
                if(cst == (nost+1) / 2) {
                    for(int csp = 1; csp <= nosp; csp++) System.out.print("\t");
                }
            }
            
            if(cr <= n/2) {
                nost -= 2;
                nosp += 2;
            }
            else {
                nost += 2;
                nosp -= 2;
            }
            System.out.println();
        }

     }
}
