package dsAndAlgo_Foundation_java.gettingStarted;

import java.util.Scanner;

public class ReverseANumber {
	public static void main(String[] args) {
	     // write your code here  
	     Scanner scn = new Scanner(System.in);
	     int n = scn.nextInt();
	     int q;
	     
	     while(n > 0) {
	         q = n%10;
	         n = n/10;
	         System.out.println(q);
	     }
	     
	}
}
