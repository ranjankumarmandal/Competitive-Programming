package Problems;

//Verify whether given two rectangles overlap or not.
//For refer, kindly visit geeksforgeeks for the same problem mentioned here.
public class Problem4 {
	static class Point {
		int x;
		int y;
	}

	public static boolean rectangleNotOverlap(Point l1, Point r1, Point l2, Point r2) {
		if (l1.x >= r2.x || l2.x >= r1.x)
			return true;

		if (l1.y <= r2.y || l2.y <= r1.y)
			return true;

		return false;
	}

	public static void main(String[] args) {
		Point l1 = new Point(), r1 = new Point(), l2 = new Point(), r2 = new Point();
		l1.x = 0;
		l1.y = 10;
		r1.x = 10;
		r1.y = 0;
		l2.x = 5;
		l2.y = 5;
		r2.x = 15;
		r2.y = 0;

		if (rectangleNotOverlap(l1, r1, l2, r2)) {
			System.out.println("Rectangles Don't Overlap");
		} else {
			System.out.println("Rectangles Overlap");
		}
	}
}
