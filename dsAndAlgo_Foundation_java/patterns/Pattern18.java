package dsAndAlgo_Foundation_java.patterns;

import java.util.Scanner;

/*
 *	*	*	*	*	*	*	
	*				*	
		*		*	
			*	
		*	*	*	
	*	*	*	*	*	
*	*	*	*	*	*	*
 */
public class Pattern18 {
	public static void main(String[] args) {
	    Scanner scn = new Scanner(System.in);
	    int n = scn.nextInt();
	    int nosp = (n / 2) - 1;
	    int nost = 3;
	     // write ur code here
	     
	     for(int cr = 1; cr <= n; cr++) {
	         if(cr > (n/2) + 1) {
	             for(int csp = 1; csp <= nosp; csp++) System.out.print("\t");
	             for(int cst = 1; cst <= nost; cst++) System.out.print("*\t");
	             nosp--;
	             nost = nost + 2;
	         }
	         else {
	             for(int cc = 1; cc <= n; cc++) {
	                 if(cc == cr) System.out.print("*\t");
	                 else if(cr + cc == n + 1) System.out.print("*\t");
	                 else if(cr == 1 || cr == n) System.out.print("*\t");
	                 else System.out.print("\t");
	             }
	         
	         }
	         
	         System.out.println();
	     }

	 }
}
