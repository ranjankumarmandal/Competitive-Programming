package Problems;

import java.util.Arrays;

//Write an algorithm to find out next greater number to given number with the same set of digits 

public class Problem3 {
	public static void main(String[] args) {
		int[] array = {2, 3, 1, 5, 8, 7, 6};
		nextGreaterNumber(array);
	}
	
	public static void nextGreaterNumber(int[] array) {
		int i;
		
		for(i=array.length-1; i>0; i--) {
			if(array[i-1] < array[i])
				break;
		}
		
		if(i == 0)
			System.out.println("Not Possible!");
		
		else {
			int x = array[i-1], min = i;
			
			for (int j = i + 1; j < array.length; j++)  
            { 
                if (array[j] > x && array[j] < array[min])  
                { 
                    min = j; 
                } 
            } 
  
            swap(array, i-1, min); 
            Arrays.sort(array, i, array.length); 
            System.out.print("Next number with same" + 
                                    " set of digits is "); 
            for (i = 0; i < array.length; i++) 
                System.out.print(array[i]);
		}
	}
	
	public static void swap(int[] array, int x, int y) {
		int temp = array[x];
		array[x] = array[y];
		array[y] = temp;
	}
	
}
