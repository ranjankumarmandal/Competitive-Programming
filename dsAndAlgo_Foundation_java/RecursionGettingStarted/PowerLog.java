package dsAndAlgo_Foundation_java.RecursionGettingStarted;

import java.util.*;

public class PowerLog {

    public static void main(String[] args) throws Exception {
    	Scanner scn = new Scanner(System.in);
    	
        int x = scn.nextInt();
        int n = scn.nextInt();
        int res = powerFakeBtr(x, n);
        System.out.println(res);
    }
    
/* DP Approach
 
    public static int powerBtr(int x, int n) {
        if (n == 0)
            return 1;

        int halfPower = powerBtr(x, n / 2);
        int fullPower = halfPower * halfPower;
        if (n % 2 != 0) {
            // power is odd
            fullPower *= x;
        }
        return fullPower;
    }
*/
    
    public static int powerFakeBtr(int x, int n) {
        if (n == 0)
            return 1;

        int fullPower = powerFakeBtr(x, n / 2) * powerFakeBtr(x, n / 2);
        if (n % 2 != 0) {
            // power is odd
            fullPower *= x;
        }
        return fullPower;
    }
}