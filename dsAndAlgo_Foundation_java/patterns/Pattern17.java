package dsAndAlgo_Foundation_java.patterns;

import java.util.Scanner;

/*
 		*	
		*	*	
*	*	*	*	*	
		*	*	
		*	
 */
public class Pattern17 {
	public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
       
        int nost = 1;
        // write ur code here
        
        for(int cr = 1; cr <= n; cr++) {
            int nosp = n / 2;
            if(cr == (n/2) + 1) {
                nosp = 0;
                for(int extSt = 1; extSt <= n / 2; extSt++) System.out.print("*\t");
            }
            
            for(int csp = 1; csp <= nosp; csp++) System.out.print("\t");
            for(int cst = 1; cst <= nost; cst++) System.out.print("*\t");
            
            if(cr <= n / 2) nost++;
            else nost--;
            
            System.out.println();
        }

    }
}
