package recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


class IntegerPointer{
    int val;
    public IntegerPointer(int val){
        this.val = val;
    }
}



class Solution {
    public String makeLargestSpecial(String s) {
        IntegerPointer i = new IntegerPointer(0);
        
        return dfs(s.toCharArray(), i);
    }
    
    
    String dfs(char[] str, IntegerPointer i){
        String res = "";
        List<String> tokens = new ArrayList<>();
        while (i.val < str.length && res.length() == 0){
            if (str[i.val++] == '1') tokens.add(dfs(str, i));
            else res += "1";
        }
        
        boolean prefix = res.length() > 0;
        Collections.sort(tokens);
        for (int j = tokens.size()-1; j >= 0; j--) res += tokens.get(j);
        
        if (prefix) res += '0';
        return res;
    }
}


public class SpecialBinaryString {
	public static void main(String[] args) {
		Solution obj = new Solution();
		System.out.println(obj.makeLargestSpecial("101100"));
	}

}
