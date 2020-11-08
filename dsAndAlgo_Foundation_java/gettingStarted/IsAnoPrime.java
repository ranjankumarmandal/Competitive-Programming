package dsAndAlgo_Foundation_java.gettingStarted;

import java.util.Scanner;

public class IsAnoPrime {
	public static void main(String[] args) {
	      Scanner scn = new Scanner(System.in);
	      int t = scn.nextInt();
	  
	       // write ur code here
	       
	       for(int i=1; i<=t; i++) {
	           int n = scn.nextInt();
	           int div;
	           for(div=2; div*div<=n; div++) {
	               if(n%div == 0) break;
	           }
	           
	           if(div*div > n) System.out.println("prime");
	           else System.out.println("not prime");
	       }
	  
	   }
}
