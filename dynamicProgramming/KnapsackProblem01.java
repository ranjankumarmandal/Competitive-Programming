package dynamicProgramming;

public class KnapsackProblem01 {
	
	int knapsack01(int[] value, int[] wt, int W) {  // W is the maximum weight
		int n=value.length;
		int[][] table = new int[n+1][W+1];
		
		for(int i=0; i<=n; i++) {
			for(int j=0; j<=W; j++) {
				if(i==0 || j==0) table[i][j] = 0;
				else if(wt[i-1] <= j) table[i][j] = Math.max(table[i-1][j], value[i-1]+table[i-1][j-wt[i-1]]);
				else table[i][j] = table[i-1][j];
			}
		}
		
		return table[n][W];
	}
	
	public static void main(String[] args) {
		KnapsackProblem01 obj = new KnapsackProblem01();
		int[] value = {60, 100, 120}; 
		int[] wt = {10, 20, 30};
		
		System.out.println(obj.knapsack01(value, wt, 50));
	}

}
