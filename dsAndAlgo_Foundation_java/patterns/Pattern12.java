package dsAndAlgo_Foundation_java.patterns;

import java.util.Scanner;

/*
0	
1	1	
2	3	5	
8	13	21	34	
55	89	144	233	377
 */
public class Pattern12 {
	public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int nr = scn.nextInt();
        int f1 = 0, f2 = 1;
        // write ur code here
        
        for(int cr = 1; cr <= nr; cr++) {
            for(int cc = 1; cc <= cr; cc++) {
                System.out.print(f1 + "\t");
                int count = f1 + f2;
                f1 = f2;
                f2 = count;
            }
            
            System.out.println();
        }

    }
}
