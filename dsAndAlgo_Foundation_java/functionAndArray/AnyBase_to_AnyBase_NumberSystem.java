package dsAndAlgo_Foundation_java.functionAndArray;

import java.util.Scanner;

public class AnyBase_to_AnyBase_NumberSystem {
	public static void main(String[] args) {
	      Scanner scn = new Scanner(System.in);
	      int n = scn.nextInt();
	      int sourceBase = scn.nextInt();
	      int  destBase= scn.nextInt();
	      int result = getValueToAnyBase(n, sourceBase, destBase);
	      System.out.println(result);
	   }  
	   
	   public static int getValueToAnyBase(int n, int sourceBase, int destBase) {
	       int res = 0;
	       int pow = 1;
	       while(n > 0) {
	           int rem = n % 10;
	           n = n / 10;
	           res = rem * pow + res;
	           
	           pow = pow * sourceBase;
	       }
	       
	       int resFinal = 0;
	       int powFinal = 1;
	       while(res > 0) {
	           int rem = res % destBase;
	           res = res / destBase;
	           resFinal = rem * powFinal + resFinal;
	           
	           powFinal = powFinal * 10;
	       } 
	       
	       return resFinal;
	   }
}
