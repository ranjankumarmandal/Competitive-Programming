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
        
        //------------ 1st method
        
     /* int bd = 0;
        int sd = 0; 
        int profit = 0;
        
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] >= arr[i - 1]) {
                sd++;
            } else {
                profit += arr[sd] - arr[bd];
                bd = sd = i;
            }
        }
        
        profit += arr[sd] - arr[bd];
        System.out.println(profit);          */
        
        //------------ 2nd method
        
        int[] buy = new int[arr.length];
        int[] sell = new int[arr.length];
        
        buy[0] = -arr[0];
        sell[0] = 0;
        
        for(int i = 1; i < arr.length; i++) {
            buy[i] = Math.max(buy[i -  1], sell[i - 1] - arr[i]);
            sell[i] = Math.max(sell[i - 1], buy[i - 1] + arr[i]);
        }
        
        System.out.println(sell[arr.length - 1]);
    }

}
