package dynamicProgramming;
//Here we are finding length of LongestIncreasingSubSequence. SubSequence means subsets ie, elements may be consecutive or mayn't.

public class LongestIncreasingSubSequence {
	
	int longestIncresingSubSeq (int[] array, int n) {
		int[] LIS = new int[n];
		int max=0;
		
		for(int i=0; i<n; i++) 
			LIS[i] = 1;
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<i; j++) {
				if(array[i]>array[j] && LIS[i]<LIS[j]+1) LIS[i] = LIS[j] +1;
			}
		}
		
		for(int i=0; i<n; i++) 
			if(max < LIS[i]) max = LIS[i];
		
		return max;
		
	}
	
	public static void main(String[] args) {
		LongestIncreasingSubSequence obj = new LongestIncreasingSubSequence();
		int[] array = {10, 22, 9, 33, 21, 50, 41, 60};
		
		System.out.println(obj.longestIncresingSubSeq(array, array.length));
	}

}
