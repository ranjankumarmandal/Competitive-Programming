package dynamicProgramming;
//All array elements must adjacent for finding this problem.

public class MaxSubArraySum {
	
	int maxSubArrSum(int[] array, int size) {
		int max_so_far = array[0];
		int curr_max = array[0];
		
		for(int i=0; i<size; i++) {
			curr_max = Math.max(array[i], array[i]+curr_max);
			max_so_far = Math.max(curr_max, max_so_far);
		}
		
		return max_so_far;
	}
	
	public static void main(String[] args) {
		MaxSubArraySum obj = new MaxSubArraySum();
		int[] array = {-2, -3, 4, -1, -2, 1, 5, -3};
		System.out.println(obj.maxSubArrSum(array, array.length));
	}

}
