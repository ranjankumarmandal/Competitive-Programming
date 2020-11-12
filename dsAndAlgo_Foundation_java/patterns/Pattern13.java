package dsAndAlgo_Foundation_java.patterns;

import java.util.Scanner;

/*
1	
1	1	
1	2	1	
1	3	3	1	
1	4	6	4	1
 */
public class Pattern13 {
	public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int count = 1;
        //write your code here
        
        for(int cr = 0; cr < n; cr++) {  //n 
            int ncr = 1;
            for(int cc = 0; cc <= cr; cc++) {    //r
                System.out.print(ncr+"\t");
                int ncrp1 = (ncr * (cr - cc)) / (cc+1);
                ncr = ncrp1;
            }
            
            System.out.println();
        }

    }
}
