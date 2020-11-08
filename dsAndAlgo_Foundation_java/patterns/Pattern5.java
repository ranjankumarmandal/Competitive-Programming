package dsAndAlgo_Foundation_java.patterns;

import java.util.Scanner;

/*
		*	
	*	*	*	
*	*	*	*	*	
	*	*	*	
		*	
 */
public class Pattern5 {
	public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nosp = n / 2;
        int nost = 1;
        
        for(int cr = 1; cr <= n; cr++) {
            for(int csp = 1; csp <= nosp; csp++) System.out.print("\t");
            for(int cst = 1; cst <= nost; cst++) System.out.print("*\t");
            
            if(cr <= n/2) {
                nosp--;
                nost += 2;
            }
            else {
                nosp++;
                nost -= 2;
            }
            
            System.out.println();
        }
    }
}
