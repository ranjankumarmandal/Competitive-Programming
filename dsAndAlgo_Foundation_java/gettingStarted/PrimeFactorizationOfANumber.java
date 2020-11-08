package dsAndAlgo_Foundation_java.gettingStarted;
/*
Sample Input
1440
Sample Output
2 2 2 2 2 3 3 5
 */
import java.util.Scanner;

public class PrimeFactorizationOfANumber {
	public static void main(String[] args) {
		  // write your code here 
		  Scanner scn = new Scanner(System.in);
		  int n = scn.nextInt();
		  
		  while(n % 2 == 0) {
		      System.out.print(2 + " ");
		      n = n/2;
		  }
		  
		  for(int i = 3; i * i <= n; i += 2) {
		      while(n % i == 0) {
		          System.out.print(i + " ");
		          n = n / i;
		      }
		  }
		  
		  if(n > 2) System.out.print(n);
		  
		  
		  
    }
}
