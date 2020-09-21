package Problems;

public class KthSmallestElement {
	
	void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	
	int divideArray(int[] array, int low, int high) {
		int pivot=array[high], i=low;
		for(int j=low; j<=high-1; j++) {
			if(array[j] <= pivot) {
				swap(array, i, j);
				i++;
			}
		}
		swap(array, i, high);
		return i;
	}
	
	int findKthElement(int[] array, int low, int high, int k) {
		if(k>0 && k<=high-low+1) {
			int index = divideArray(array, low, high);
			
			if(index-low == k-1)
				return array[index];
			
			if(index-low > k-1)
				return findKthElement(array, low, index-1, k);
			
			return findKthElement(array, index+1, high, k-index+low-1);
		}
		
		return Integer.MAX_VALUE;
	}
	
	public static void main(String[] aargs) {
		KthSmallestElement obj = new KthSmallestElement();
		int[] array = {54, 93, 17, 77, 31, 44, 20, 55, 21, 10};
		int n=array.length, k=6;
		
		System.out.println("K'th Smallest Element is "+obj.findKthElement(array, 0, n-1, k));
	}
}