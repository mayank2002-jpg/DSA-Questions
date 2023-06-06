import java.util.* ;
import java.io.*; 
public class Solution {
	public static int minimumParentheses(String pattern) {
		int m = pattern.length();
		int count = 0,r = 0;

		for(int i = 0;i<m;i++){
			char a = pattern.charAt(i);
			if(a=='('){
				count += 1;
			}
			if(a==')'&& count>0){
				count--;
			}
			else if(a==')'){
				r+=1;
			}
		}
		return(r+count);
	}
}