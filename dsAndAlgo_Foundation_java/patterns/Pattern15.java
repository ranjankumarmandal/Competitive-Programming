package dsAndAlgo_Foundation_java.patterns;

import java.util.Scanner;
/*
		1	
	2	3	2	
3	4	5	4	3	
	2	3	2	
		1
 */

public class Pattern15 {
	public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nosp = n/2;
        int nost = 1;
        int sp = 1;
        // write ur code here
        
        for(int cr = 1; cr <= n; cr++) {
            int count = sp;
            for(int csp = 1; csp <= nosp; csp++) System.out.print("\t");
            for(int cst = 1; cst <= nost; cst++) {
                System.out.print(count+"\t");
                if(cst <= nost / 2) count++;
                else count--;
            }
            
            if(cr <= n/2) {
                sp++;
                nosp--;
                nost = nost + 2;
            }
            else {
                sp--;
                nosp++;
                nost = nost - 2;
            }
            
            System.out.println();
        }

    }
}
