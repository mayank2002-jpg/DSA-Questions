import java.util.*;
import java.io.*;

public class Solution {

	public static String isSubsequence(String str1, String str2) {
		int j = 0;
		for (int i = 0; i < str2.length(); i++) {
			if (str2.charAt(i) == str1.charAt(j))
				j++;
			if (j == str1.length()) {
				break;
			}
		}
		if(j == str1.length()){
			return "True";
		}
		else{
			return "False";
		}
	}

}