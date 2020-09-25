import java.util.Arrays;

public class NobelInterger {
	int solve(int[] A) {
		Arrays.sort(A);
	    int idx = 0;
	    int n = A.length;
	    while (idx < n){
	      int num = A[idx];
	      while (idx < n && A[idx] == num) {
	        idx++;
	      }
	      if (num == A.length - idx) {
	        return 1;
	      }
	    }
	    return -1;
	}

}
