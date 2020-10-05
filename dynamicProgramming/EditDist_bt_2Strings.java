package dynamicProgramming;
//Here, we are finding the length of characters that we have inserted, deleted, or updated total.

public class EditDist_bt_2Strings {
	
	int editDist(String str1, String str2) {
		int l1=str1.length(), l2=str2.length(), result1=0;
		int[][] lcs2 = new int[l1+1][l2+1];
		
		for(int i=0; i<=l1; i++) {
			for(int j=0; j<=l2; j++) {
				if(i == 0) lcs2[i][j] = j;
				else if(j == 0) lcs2[i][j] = i;
				else if(str1.charAt(i-1) == str2.charAt(j-1)) lcs2[i][j] = lcs2[i-1][j-1];
				else {
					result1 = Math.min(lcs2[i-1][j], lcs2[i][j-1]);
					lcs2[i][j] = 1 + Math.min(result1, lcs2[i-1][j-1]);
				}
			}
		}
		
		return lcs2[l1][l2];
	}
	
	public static void main(String[] args) {
		EditDist_bt_2Strings obj = new EditDist_bt_2Strings();
		
		System.out.println(obj.editDist("GEEK", "GESEK"));
	}

}
