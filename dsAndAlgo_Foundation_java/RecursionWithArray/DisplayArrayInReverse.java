package dsAndAlgo_Foundation_java.RecursionWithArray;

import java.io.*;
import java.util.*;

public class DisplayArrayInReverse {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        
        int n = scn.nextInt();
        int[] array = new int[n];
        for(int i = 0; i < n; i++) {
            array[i] = scn.nextInt();
        }
        
        displayArrReverse(array, 0);
        
    }

    public static void displayArrReverse(int[] arr, int idx) {
        if(idx == arr.length) {
            return;
        }
        
        displayArrReverse(arr, idx + 1);
        System.out.println(arr[idx]);
    }

}