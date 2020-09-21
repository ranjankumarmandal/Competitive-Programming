package Problems;

public class Problem6 {
	public static void spiralPrint(int r2, int c2, int[][] array) {
		int r1 = 0, c1 = 0;
		int i;

		while (r1 < r2) {
			for (i = c1; i < c2; i++)
				System.out.print(array[r1][i]+" ");
			r1++;

			for (i = r1; i < r2; i++)
				System.out.print(array[i][c2-1]+" ");
			c2--;

			for (i = c2; i > c1; i--)
				System.out.print(array[r2-1][i]+" ");
			r2--;

			for (i = r2; i > r1; i--)
				System.out.print(array[i][c1]+" ");
			c1++;
		}
	}

	public static void main(String[] args) {
		int R = 3;
		int C = 6;
		int a[][] = { { 1, 2, 3, 4, 5, 6 }, { 7, 8, 9, 10, 11, 12 }, { 13, 14, 15, 16, 17, 18 } };
		spiralPrint(R, C, a);
	}
}
