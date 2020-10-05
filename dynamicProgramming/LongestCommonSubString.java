package dynamicProgramming;
//Here, we are finding the length of longest common SubString. SubString means only consecutive chars.

public class LongestCommonSubString {
	
	int longestCommonSubStr(String str1, String str2) {
		int l1=str1.length(), l2=str2.length(), result=0;
		int[][] lcs1 = new int[l1+1][l2+1];
		
		for(int i=0; i<=l1; i++) {
			for(int j=0; j<=l2; j++) {
				if(i==0 || j==0) lcs1[i][j] = 0;
				else if(str1.charAt(i-1) == str2.charAt(j-1)) {
					lcs1[i][j] = lcs1[i-1][j-1]+1;
					result = Math.max(result, lcs1[i][j]);
				}
				
				else lcs1[i][j] = 0;
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		LongestCommonSubString obj = new LongestCommonSubString();
		
		System.out.println(obj.longestCommonSubStr("Geeksfor", "Geeksanr"));
	}

}
