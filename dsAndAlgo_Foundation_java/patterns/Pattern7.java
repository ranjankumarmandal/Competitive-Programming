package dsAndAlgo_Foundation_java.patterns;

import java.util.Scanner;

/*
*	
	*	
		*	
			*	
				*	
 */
public class Pattern7 {
	public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int nr = scn.nextInt();
        // write ur code here
        
        for(int cr = 1; cr <= nr; cr++) {
            for(int cc = 1; cc <= nr; cc++) {
                if(cr == cc) System.out.print("*\t");
                else System.out.print("\t");
            }
            
            System.out.println();
        }

    }
}
