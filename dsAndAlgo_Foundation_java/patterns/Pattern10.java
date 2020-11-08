package dsAndAlgo_Foundation_java.patterns;

import java.util.Scanner;

/*
		*	
	*		*	
*				*	
	*		*	
		*	
 */
public class Pattern10 {
	public static void main(String[] args) {
	    Scanner scn = new Scanner(System.in);
	    int nr = scn.nextInt();
	    int nosp = nr / 2;
	    int nosp1 = 1;
	     // write ur code here
	     
	     for(int cr = 1; cr <= nr; cr++) {
	         for(int csp = 1; csp <= nosp; csp++) System.out.print("\t");
	         if(cr == 1 || cr == nr) System.out.print("*");
	         else {
	             System.out.print("*");
	             for(int csp = 1; csp <= nosp1 - 1; csp++) System.out.print("\t");
	             System.out.print("*");
	         };
	         
	         if(cr <= nr / 2) {
	             nosp--;
	             nosp1 = nosp1 + 2;
	         } else {
	             nosp++;
	             nosp1 = nosp1 - 2;
	         }
	         
	         System.out.println();
	     }

	 }
}
