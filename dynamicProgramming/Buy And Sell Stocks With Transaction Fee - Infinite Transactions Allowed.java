import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        
        int tf = scn.nextInt();
        
        //--------------------
        
        int[] buy = new int[arr.length];
        int[] sell = new int[arr.length];
        
        buy[0] = -arr[0];
        sell[0] = 0;
        
        for(int i = 1; i < arr.length; i++) {
            buy[i] = Math.max(buy[i -  1], sell[i - 1] - arr[i]);
            sell[i] = Math.max(sell[i - 1], buy[i - 1] + arr[i] - tf);
        }
        
        System.out.println(sell[arr.length - 1]);
    }

}
