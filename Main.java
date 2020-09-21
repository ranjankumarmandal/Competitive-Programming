package Problems;

public class Main {
	public void matrixRotation(int[][] matrix) {
		int n = matrix.length;
		
		for(int i=0; i<n/2; i++) {
			for(int j=i; j<n-1-i; j++) {
				
				int temp = matrix[j][n-1-i];
				matrix[j][n-1-i] = matrix[i][j];
				matrix[i][j] = matrix[n-1-j][i];
				matrix[n-1-j][i] = matrix[n-1-i][n-1-j];
				matrix[n-1-i][n-1-j] = temp;
			}
		}
	}

	static void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++)
				System.out.print(matrix[i][j] + " ");
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Main rotate = new Main();
		int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		System.out.println("Before Rotation, matrix is: ");
		rotate.printMatrix(matrix);

		System.out.println("\nAfter Rotation, matrix is: ");
		rotate.matrixRotation(matrix);
		rotate.printMatrix(matrix);
	}
}