package dsAndAlgo_Foundation_java.gettingStarted;

import java.util.Scanner;

public class AllPrimeInARange {
	public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int low = scn.nextInt();
        int high = scn.nextInt();
        
        while(low <= high) {
            int div;
            for(div=2; div*div<=low; div++) {
                if(low%div == 0) break;
            }
            
            if(div*div > low) System.out.println(low);
            low = low+1;
        }
        
    }
}
