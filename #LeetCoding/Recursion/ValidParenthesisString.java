package recursion;
//Here simply recursion has been replaced using iteration technique for finding the ValidParenthesisString problem. (#LeetCoding)

public class ValidParenthesisString {
	public boolean checkValidString(String s) {
	       int lo = 0, hi = 0;
	       for (char c: s.toCharArray()) {
	           lo += c == '(' ? 1 : -1;
	           hi += c != ')' ? 1 : -1;
	           if (hi < 0) break;
	           lo = Math.max(lo, 0);
	       }
	       return lo == 0;
	    }
	
	public static void main(String[] args) {
		ValidParenthesisString obj = new ValidParenthesisString();
		System.out.println(obj.checkValidString("(())()"));
	}

}
