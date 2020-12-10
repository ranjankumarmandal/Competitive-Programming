package dsAndAlgo_Foundation_java.functionAndArray;

import java.util.Scanner;

public class SumOf2ArraysConsideringAs2Numbers {
	 public static void main(String[] args) throws Exception {
	        // write your code here
	        Scanner scn = new Scanner(System.in);
	        int n1 = scn.nextInt();
	        int[] array1 = new int[n1];
	        for (int i = 0; i < n1; i++) array1[i] = scn.nextInt();

	        int n2 = scn.nextInt();
	        int[] array2 = new int[n2];
	        for (int i = 0; i < n2; i++) array2[i] = scn.nextInt();

	        int[] result = sumOfTwoArray(array1, array2);

	        if (result[0] != 0) System.out.println(result[0]);

	        for (int i = 1; i < result.length; i++) System.out.println(result[i]);
	    }

	    public static int[] sumOfTwoArray(int[] array1, int[] array2) {
	        int ml = array1.length; //ml -> maxLength
	        if (array2.length > array1.length) ml = array2.length;

	        int[] res = new int[ml + 1];
	        int i = array1.length - 1, j = array2.length - 1, k = res.length - 1, carry = 0;;


	        while (k >= 0) {
	            int sum = 0;

	            if (i >= 0) sum += array1[i];
	            if (j >= 0) sum += array2[j];
	            sum += carry;

	            carry = sum / 10;
	            res[k] = sum % 10;

	            i--;
	            j--;
	            k--;
	        }

	        return res;
	    }
}
