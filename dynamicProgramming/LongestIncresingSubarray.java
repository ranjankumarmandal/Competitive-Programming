package dynamicProgramming;
//Here, we are finding the length of longestIncresingSubArray. SubArray means the consecutive elements only.

public class LongestIncresingSubarray {
	
	int longestIncreasingSubarr(int[] array, int n) {
		int max_so_far = 1;
		int curr = 1;
		
		for(int i=1; i<n; i++) {
			if(array[i] > array[i-1])  curr = curr+1;
			else curr = 1;
			max_so_far = Math.max(max_so_far, curr);
		}
		
		return max_so_far;
	}
	
	public static void main(String[] args) {
		LongestIncresingSubarray obj = new LongestIncresingSubarray();
		int[] array = {2, -3, 4, -1, -2, 1, 5, -3};
		
		System.out.println(obj.longestIncreasingSubarr(array, array.length));
	}

}
