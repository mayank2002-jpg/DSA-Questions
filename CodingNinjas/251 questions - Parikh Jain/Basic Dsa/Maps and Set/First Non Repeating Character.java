import java.util.*;
import java.io.*;

public class Solution {

	public static char firstNonRepeatingCharacter(String str) {

		Map<Character,Integer> map = new HashMap<>();
		
		for(int i = 0;i<str.length();i++){
			char ch = str.charAt(i);

			int number = map.getOrDefault(ch, 0);
			map.put(ch,number+1);
		}
		
		for(int i = 0;i<str.length();i++){
			char ch = str.charAt(i);
			if(map.get(ch).intValue()==1){
				return ch;
			}
		}
		return str.charAt(0);
	}
}