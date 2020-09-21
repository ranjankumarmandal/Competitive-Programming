package Problems;

public class Problem10 {
	public boolean knows(int[][] matrix, int i, int j) {
		if(matrix[i][j] == 1)
			return true;
		else
			return false;
	}
	
	public void findCelebrity(int[][] matrix) {
		int n = matrix.length;
		int i=0, j=n-1, result=0;
		
		while(i<j) {
			if(knows(matrix, i, j))
				i++;
			else
				j--;
		}
		
		for(int k=0; k<n; k++)
			if(k!=i && (knows(matrix, i, k) || !knows(matrix, k, i)))
				result = -1;
		
		if(result == -1)
			System.out.println("NO Celebrity found!!");
		else
			System.out.println("Celebrity is "+i);
	}
	
	public static void main(String[] args) {
		Problem10 fc = new Problem10();
		
		int[][] matrix = {{0, 0, 1, 0}, {0, 0, 1, 0}, {0, 0, 0, 0}, {0, 0, 1, 0}};
		fc.findCelebrity(matrix);
	}
}