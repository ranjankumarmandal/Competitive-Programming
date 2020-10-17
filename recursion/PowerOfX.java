package recursion;

public class PowerOfX {
	
	void power(int x, int y, int prod) {
		if(y == 0) {
			System.out.println(prod);
			return;
		}
		
		power(x, y-1, prod*x);
	}
	
	public static void main(String[] args) {
		PowerOfX obj = new PowerOfX();
		obj.power(2, 5, 1);
	}
}
//Recursion - Top Down approach
//TIme Complexity = space complexity = O(n),  for this problem x^y.