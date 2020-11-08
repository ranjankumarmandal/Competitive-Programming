package dsAndAlgo_Foundation_java.gettingStarted;

import java.util.Scanner;

public class CountDigitsInANumber {
	public static void main(String[] args) {
	    // write your code here  
	    Scanner scn = new Scanner(System.in);
	    int n = scn.nextInt();
	    int d=0;
	    
	    while(n>0) {
	        n = n/10;
	        d = d+1;
	    }
	    
	    System.out.println(d);
	    
	   }
}
