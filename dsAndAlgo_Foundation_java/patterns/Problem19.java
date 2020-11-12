package dsAndAlgo_Foundation_java.patterns;

import java.util.Scanner;

/*
 *	*	*	
*	*	*	                    Swastic pattern
*	*	*
 */
public class Problem19 {
	public static void main(String[] args) {
	    Scanner scn = new Scanner(System.in);
	    int n = scn.nextInt();
	     // write ur code here
	     
	     for(int cr = 1; cr <= n; cr++) {
	         for(int cc = 1; cc <= n; cc++) {
	             if(cr == (n/2) + 1) System.out.print("*\t");
	             else if(cc == (n/2) + 1) System.out.print("*\t");
	             
	             else if(cc <= n / 2 && cr == 1) System.out.print("*\t");
	             else if(cc == n && cr <= n / 2) System.out.print("*\t");
	             else if(cc == 1  && cr > n / 2) System.out.print("*\t");
	             else if(cc > n / 2  && cr == n) System.out.print("*\t");
	             else System.out.print("\t");
	         }
	         
	         System.out.println();
	     }

	 }
}
