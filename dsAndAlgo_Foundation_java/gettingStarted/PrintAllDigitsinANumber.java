package dsAndAlgo_Foundation_java.gettingStarted;

import java.util.Scanner;

public class PrintAllDigitsinANumber {
	public static void main(String[] args) {
	      // write your code here  
	      Scanner scn = new Scanner(System.in);
	      int n = scn.nextInt(); 
	      int copy=n, pow=1;
	    
	      while(copy >= 10) {
	        copy = copy/10;
	        pow = pow*10;
	      }
	    
	      
	      while(pow>0) {
	          int q = n/pow;
	          int rem = n%pow;
	          
	          System.out.println(q);
	          n = rem;
	          pow = pow/10;
	      }
	      
   }
}
