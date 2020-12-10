package dsAndAlgo_Foundation_java.RecursionGettingStarted;

import java.util.Scanner;

public class TowerOfHanoi {

	 
	 public static void toh(String src, String aux, String des, int n) {
	     //Write your code here.
	     if(n == 0) {
	         return;
	     }
	     
	     toh(src, des, aux, n - 1);   // Move disc from src to aux, keep des silent
	     System.out.println("Move disk " + n + " from rod " + src + " to rod " + des);
	     toh(aux, src, des, n - 1);   // Move disc from aux to des, keep src silent
	 }

	 public static void main(String[] args) {

	 	 Scanner s = new Scanner(System.in);
	 	 int n = s.nextInt();
	 	 toh("1", "2", "3", n);
	 }


}
