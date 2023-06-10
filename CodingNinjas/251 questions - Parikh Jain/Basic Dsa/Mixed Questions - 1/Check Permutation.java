import java.util.*;
import java.io.*;

public class Solution {
    public static boolean areAnagram(String str1, String str2) {
        int[] arr1 = new int[26];
        for (int i = 0; i < str1.length(); i++) {
            arr1[str1.charAt(i) - 'a']++;
        }
        for (int i = 0; i < str2.length(); i++) {
            arr1[str2.charAt(i) - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (arr1[i] != 0) {
                return false;
            }
        }
        return true;

    }
}