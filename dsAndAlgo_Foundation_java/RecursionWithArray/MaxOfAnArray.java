package dsAndAlgo_Foundation_java.RecursionWithArray;

import java.io.*;
import java.util.*;

public class MaxOfAnArray {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        
        int n = scn.nextInt();
        int[] array = new int[n];
        for(int i = 0; i < n; i++) {
            array[i] = scn.nextInt();
        }
        
        int result = maxOfArray(array, 0);
        System.out.println(result);
    }

    public static int maxOfArray(int[] arr, int idx){
        if(idx == arr.length) {
            return Integer.MIN_VALUE;
        }
        
        int maxT = maxOfArray(arr, idx + 1);
        int maxO = Math.max(maxT, arr[idx]);
        
        return maxO;
    }

}
