package recursion;

public class PowerOfX1 {
	
	double power(int x, int y) {
		if(y == 0) 
			return 1;
		if(y == 1)
			return x;
		
		double temp = power(x, y/2);
		return (y%2 == 0) ? temp*temp : temp*temp*x;
	}
	
	public static void main(String[] args) {
		PowerOfX1 obj = new PowerOfX1();
		System.out.println(obj.power(2, 5));
	}

}
//Recursion - Bottom Up approach
//Time complexity = O(log(n)), for this problem x^y