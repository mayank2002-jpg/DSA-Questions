public class Solution {
    public static int maxDepth(String s) {
        int cnt = 0;
        int ans = 0;

        for(int i = 0; i<s.length();i++){
            if(s.charAt(i)=='('){
                cnt++;
            }
            else if(s.charAt(i)==')'){
                cnt--;
            }
            ans = (cnt>ans)?cnt:ans;
        }
        return ans;
    }
}