package Problems;

//Jump Game Problem (Array of integers given where each element represents the max number of steps that can be made forward from that element. Write a algorithm to find the minimum number of jumps to reach the end of the array (starting from the first element). If an element is 0, then cannot move through that element.)
//Should be minimum jump in an array to reach the end of array.

public class Problem2 {
	public static void main(String[] args) {
		try {
			int[] array = {4, 3, 2, 6, 2, 6, 1, 7, 8, 9, 3};
			int jump = jumpGameProblem(array);
			System.out.println(jump);
		} catch(Exception e) {
			System.out.println("Sorry, your array is empty!");
		}
	}

	public static int jumpGameProblem(int[] array) {
		int a = array[0], b = array[0];
		int jump = 1;

		for (int i = 1; i < array.length; i++) {
			if (i == array.length - 1)
				return jump;

			a--;
			b--;

			if (array[i] > b)
				b = array[i];

			if (a == 0) {
				jump++;
				a = b;
			}
		}
		return jump;
	}
}
