package Problems;

//Count frequencies of array elements in O(n) time complexity

public class Problem8 {
	public static void frequencyOfArrayElement(int[] array) {
		int n=array.length, i;
		
		for(i=0; i<n; i++)
			array[i]--;
		
		for(i=0; i<n; i++)
			array[array[i]%n] = n+array[array[i]%n];
		
		for(i=0; i<n; i++)
			System.out.println((i+1)+" "+array[i]/n);
	}
	
	public static void main(String[] args) {
		int[] array = {5, 2, 7, 7, 5, 5, 2};
		frequencyOfArrayElement(array);
	}
}
