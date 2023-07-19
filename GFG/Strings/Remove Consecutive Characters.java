class Solution{
    public String removeConsecutiveCharacter(String S){
        String ans = "";
        ans += S.charAt(0);
        for(int i = 1; i<S.length();i++)
        {
            if(S.charAt(i)!=S.charAt(i-1)){
                ans += S.charAt(i);
            }
        }
        return ans;
    }
}