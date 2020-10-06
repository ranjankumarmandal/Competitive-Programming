package dynamicProgramming;

public class MinNumbOfCoin {
	
	int minCoint(int[] coins, int n, int V) {
		int[] table = new int[V+1];
		table[0] = 0;
		for(int i=1; i<=V; i++) 
			table[i] = Integer.MAX_VALUE;
		
		for(int i=1; i<=V; i++) {
			for(int j=0; j<n; j++) {
				if(coins[j] <= i) {
					int sub_result = table[i-coins[j]];
					
					if(sub_result != Integer.MAX_VALUE && sub_result+1 < table[i]) table[i] = sub_result+1;
				}
			}
		}
		
		return table[V];
	}
	
	public static void main(String[] args) {
		MinNumbOfCoin obj = new MinNumbOfCoin();
		int[] coins = {1, 2, 6, 8, 5, 10};
		
		System.out.println(obj.minCoint(coins, coins.length, 13));
	}

}
