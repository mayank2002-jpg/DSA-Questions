public class Solution {
    public static boolean isPalindrome(String str) {
        return helper(str,0,str.length()-1);
    }
    public static boolean helper(String str, int i, int j){
        if(i>=j)
        return true;

        return(str.charAt(i)==str.charAt(j) && helper(str, i+1, j-1));
    }
}
