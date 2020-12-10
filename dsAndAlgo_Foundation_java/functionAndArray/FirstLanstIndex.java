package dsAndAlgo_Foundation_java.functionAndArray;

import java.util.Scanner;
/*Sample Input
15
1
5
10
15
22
33
33
33
33
33
40
42
55
66
77
33
Sample Output
5
9 */
public class FirstLanstIndex {
	public static void main(String[] args) throws Exception {
	    // write your code here
	    Scanner scn = new Scanner(System.in);
	    int n = scn.nextInt();
	    int[] array = new int[n];
	    
	    for(int i = 0; i < n; i++) {
	        array[i] = scn.nextInt();
	    }
	    
	    int d = scn.nextInt();
	    
	    int[] result = firstLastIndex(array, d);
	    
	    for(int i = 0; i < result.length; i++) {
	        System.out.println(result[i]);
	    }
	 }
	 
	 public static int[] firstLastIndex(int[] array, int data) {
	     int start = 0, end = array.length;
	     int[] result = new int[2];
	     result[0] = -1;
	     result[1] = -1;
	     
	     while(start <= end) {
	         int middle = (start + end) / 2;
	         
	         if(array[middle] == data) {
	             result[0] = middle;
	             end = middle - 1;
	         } else if(data < array[middle]) {
	             end = middle - 1;
	         } else {
	             start = middle + 1;
	         }
	     }
	     
	     start = 0;
	     end = array.length;
	     while(start <= end) {
	         int middle = (start + end) / 2;
	         
	         if(array[middle] == data) {
	             result[1] = middle;
	             start = middle + 1;
	         } else if(data < array[middle]) {
	             end = middle - 1;
	         } else {
	             start = middle + 1;
	         }
	     }
	     
	     return result;
	 }
}
