package Problems;

public class Problem7 {
	
	static void spiralPrint(int r2, int c2, int a[][]) 
    { 
        int i, r1 = 0, c1 = 0; 
    /*  r1 - starting row index, r2 - ending row index, c1 - starting column index, c2 - ending column index, i - iterator  */
  
        while (r1 < r2 && c1 < c2) {  
            for (i = c1; i < c2; i++) { 
                System.out.print(a[r1][i] + " ");                 // Print the first row from the remaining rows
            } 
            r1++; 
  
            for (i = r1; i < r2; i++) { 
                System.out.print(a[i][c2 - 1] + " ");             // Print the last column from the remaining columns 
            } 
            c2--; //1 2 3 4 5 6 12 18 17 16 15 14 13 7 8 9 10 11 
  
            if (r1 < r2) { 
                for (i = c2 - 1; i >= c1; i--) { 
                    System.out.print(a[r2 - 1][i] + " ");          // Print the last row from the remaining rows
                } 
                r2--; 
            } 
  
            if (c1 < c2) { 
                for (i = r2 - 1; i >= r1; i--) { 
                    System.out.print(a[i][c1] + " ");              // Print the first column from the remaining columns
                } 
                c1++; 
            } 
        } 
    } 
  
    // driver program 
    public static void main(String[] args) 
    { 
        int R = 3; 
        int C = 6; 
        int a[][] = { { 1, 2, 3, 4, 5, 6 }, 
                      { 7, 8, 9, 10, 11, 12 }, 
                      { 13, 14, 15, 16, 17, 18 } }; 
        spiralPrint(R, C, a); 
        //1 2 3 4 5 6 12 18 18 17 16 15 14 13 8 9 10 11 11 10 9 
    } 

}
