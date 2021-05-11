//Check if matrix is a magic square

import java.util.*;

class CheckMagicSquare {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int grid[][] = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                grid[i][j] = sc.nextInt();
        }

        String result = checkMagicSquare(n, grid);

        System.out.println(result);

    }

    // TODO: Implement this method
    static String checkMagicSquare(int n, int[][] grid) {
        int sum = 0, sum1 = 0;
        
        for(int i = 0; i < n; i++) {
            sum = sum + grid[i][i];
        }

        for(int i = 0; i < n; i++) {
            sum1 = sum1 + grid[i][n - 1 - i];
        }

        if(sum1 != sum) {
            return "No";
        }

        for(int i = 0; i < grid.length; i++) {
            int rowSum = 0;
            for(int j = 0; j < grid[0].length; j++) {
                rowSum = rowSum + grid[i][j];
            }

            if(rowSum != sum) {
                return "No";
            }
        }

        for(int i = 0; i < grid[0].length; i++) {
            int colSum = 0;
            for(int j = 0; j < grid.length; j++) {
                colSum = colSum + grid[j][i];
            }

            if(colSum != sum) {
                return "No";
            }
        }

        return "Yes";
    }
}
