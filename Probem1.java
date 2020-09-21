package Problems;

//Segrigation logic to sort an array of 0's, 1's, and 2's

public class Probem1 {

	public static void main(String[] args) {		
		int[] arrayData = {2, 1, 1, 0, 0, 1, 2, 0, 1};
		sort(arrayData);
		for(int x : arrayData)
			System.out.print(x);

	}
	
	public static void sort(int[] array) {
		int low = 0, mid = 0, high = 8;
		while(mid <= high) {
			if(array[mid] == 2) {
				swap(array, mid, high);
				--high;
			}
			
			if(array[mid] == 0) {
				swap(array, mid, low);
				++low;
				++mid;
			}
			
			else 
				++mid;
		}
	}
	
	public static void swap(int array[], int x, int y) {
		int temp = array[x];
		array[x] = array[y];
		array[y] = temp;
	}

}
