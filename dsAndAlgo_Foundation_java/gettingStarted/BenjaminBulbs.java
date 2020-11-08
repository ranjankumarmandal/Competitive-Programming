package dsAndAlgo_Foundation_java.gettingStarted;

import java.util.Scanner;

/*
Sample Input
6
Sample Output
1
4
 */
public class BenjaminBulbs {
	public static void main(String[] args) {
	       Scanner scn = new Scanner(System.in);
	       int bulbs = scn.nextInt();
	       
	       for(int i = 1; i * i <= bulbs ; i++) {
	           System.out.println(i*i);
	       }
	      
	 }
}
