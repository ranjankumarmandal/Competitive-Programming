package dsAndAlgo_Foundation_java.gettingStarted;
/*
Sample Input
562984
2
Sample Output
845629
 */
import java.util.Scanner;

public class RotateANumber {
	public static void main(String[] args) {
	       Scanner scn = new Scanner(System.in);
	       int n = scn.nextInt();
	       int k = scn.nextInt();
	       
	       int copy = n;
	       int length = 0;
	       
	       while(copy >  0) {
	           copy = copy/10;
	           length++;
	       }
	       
	       k = k % length;
	       if(k < 0) k = k + length;
	       
	       int div = 1;
	       int mult = 1;
	       
	       for(int i = 1 ; i <= length ; i++) {
	           if( i <= k) div = div * 10;
	           else mult = mult * 10;
	       }
	       
	       int rem = n % div;
	       int q = n / div;
	       
	       int ans = (rem * mult) + q;
	       System.out.println(ans);
	      
	}
}
