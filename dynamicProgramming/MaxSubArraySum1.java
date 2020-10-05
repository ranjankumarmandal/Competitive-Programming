package dynamicProgramming;
//Any of the array element should not be adjacent with each other for finding this problem.

public class MaxSubArraySum1 {
	int maxSbArrSum(int[] array, int n) {
		int incld = array[0];
		int excld = 0;
		int new_maxSmExcld;

		for (int i = 1; i < n; i++) {
			new_maxSmExcld = Math.max(incld, excld);
			incld = excld + array[i];
			excld = new_maxSmExcld;
		}

		return Math.max(incld, excld);
	}

	public static void main(String[] args) {
		MaxSubArraySum1 obj = new MaxSubArraySum1();
		int[] array = { 7, 5, 10, 40, 50, 35 };

		System.out.println(obj.maxSbArrSum(array, array.length));
	}

}
