package dsAndAlgo_Foundation_java.functionAndArray;

import java.util.Scanner;

public class DiffOf2ArrayConsideringAs2Number {
	public static void main(String[] args) throws Exception {
	    // write your code here
	    Scanner scn = new Scanner(System.in);
	    
	    int n1 = scn.nextInt();
	    int[] array1 = new int[n1];
	    for(int i = 0; i < n1; i++) {
	        array1[i] = scn.nextInt();
	    }
	    
	    int n2 = scn.nextInt();
	    int[] array2 = new int[n2];
	    for(int i = 0; i < n2; i++) {
	        array2[i] = scn.nextInt();
	    }
	    
	    int[] result = diffOf2Array(array1, array2);
	    
	    if(result[0] != 0) {
	        for(int j = 0; j < result.length; j++) {
	            System.out.println(result[j]);
	        }
	    } else {
	        for(int j = 1; j < result.length; j++) {
	            System.out.println(result[j]);
	        }
	    }
	 }
	 
	 public static int[] diffOf2Array(int[] array1, int[] array2) {
	     int i1 = array1.length - 1;
	     int i2 = array2.length - 1;
	     int borrow = 0;
	     
	     while(i2 >= 0) {
	         array2[i2] = array2[i2] - borrow;
	         borrow = 0;
	         
	         if(i1 >= 0) {
	             if(array2[i2] < array1[i1]) {
	                 array2[i2] += 10;
	                 borrow = 1;
	             }
	             
	             array2[i2] = array2[i2] - array1[i1];
	         } else {
	             array2[i2] = array2[i2];
	         }
	         
	         i2--;
	         i1--;
	     }
	     
	     return array2;
	 }
}
