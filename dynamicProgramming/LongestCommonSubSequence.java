package dynamicProgramming;
//Here we are finding the length of the longest common subsequence of a string, subsequence means chars may be consecutive or mayn't.

public class LongestCommonSubSequence {
	
	int longestCommonSubSeq(String str1, String str2) {
		int l1 = str1.length(), l2 = str2.length();
		int[][] lcs = new int[l1+1][l2+1];
		
		for(int i=0; i<=l1; i++) {
			for(int j=0; j<=l2; j++) {
				if(i==0 || j==0) lcs[i][j] = 0;
				else if(str1.charAt(i-1) == str2.charAt(j-1)) lcs[i][j] = lcs[i-1][j-1]+1;
				else lcs[i][j] = Math.max(lcs[i-1][j], lcs[i][j-1]);
			}
		}
		
		return lcs[l1][l2];
	}
	
	public static void main(String[] args) {
		LongestCommonSubSequence obj = new LongestCommonSubSequence();
		
		System.out.println(obj.longestCommonSubSeq("AGGTAB", "GXTXAYB"));
	}

}
