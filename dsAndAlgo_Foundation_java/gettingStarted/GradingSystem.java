package dsAndAlgo_Foundation_java.gettingStarted;

import java.util.Scanner;

public class GradingSystem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int i=1; i<=t; i++) {
			int n = sc.nextInt();
			boolean isPrime = true;
			for(int div=2; div*div<=n; i++) {
				if(n%div == 0) {
					isPrime = false;
					break;
				}
			}
			
			if(isPrime) System.out.println("Prime!");
			else System.out.println("notPrime!!");
		}
	}

}
