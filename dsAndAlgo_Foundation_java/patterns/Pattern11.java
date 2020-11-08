package dsAndAlgo_Foundation_java.patterns;

import java.util.Scanner;

/*
1	
2	3	
4	5	6	
7	8	9	10	
11	12	13	14	15
 */
public class Pattern11 {
	public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int nr = scn.nextInt();
        int count = 1;
        // write ur code here
        
        for(int cr = 1; cr <= nr; cr++) {
            for(int cc = 1; cc <= cr; cc++) {
                System.out.print(count + "\t");
                count++;
            }
            
            System.out.println();
        }

    }
}
