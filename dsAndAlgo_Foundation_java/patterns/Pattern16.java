package dsAndAlgo_Foundation_java.patterns;

import java.util.Scanner;

/*
1												1	
1	2										2	1	
1	2	3								3	2	1	
1	2	3	4						4	3	2	1	
1	2	3	4	5				5	4	3	2	1	
1	2	3	4	5	6		6	5	4	3	2	1	
1	2	3	4	5	6	7	6	5	4	3	2	1	
 */
public class Pattern16 {
	public static void main(String[] args) {
	    Scanner scn = new Scanner(System.in);
	    int n = scn.nextInt();
	    int nosp = (n-2)*2 + 1;
	    int nost = 1;
	     // write ur code here
	     
	     for(int cr = 1; cr <= n; cr++) {
	         int number = 1;
	         for(int cst = 1; cst <= nost; cst++) {
	             System.out.print(number+"\t"); 
	             number++;
	         }
	         
	         for(int csp = 1; csp <= nosp; csp++) System.out.print("\t");
	         
	         if(cr == n) {
	             number--;
	             nost--;
	         }
	         
	         for(int cst = 1; cst <= nost; cst++) {
	             number--;
	             System.out.print(number+"\t"); 
	         }
	         
	         nost++;
	         nosp = nosp - 2;
	         System.out.println();
	     }

	 }
}
