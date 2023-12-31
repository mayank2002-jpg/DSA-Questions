class Solution {
    public boolean isPalindrome(String s) {
        if(s.isEmpty()){
            return true;
        }
        int start = 0;
        int end = s.length()-1;

        while(start<=end){
            char currF = s.charAt(start);
            char currE = s.charAt(end);

            if(!Character.isLetterOrDigit(currF)){
                start++;
            }
            else if(!Character.isLetterOrDigit(currE)){
                end--;
            }
            else{
                if(Character.toLowerCase(currF)!=Character.toLowerCase(currE)){
                    return false;
                }
                start++;
                end--;
            }
        }
        return true;
    }
}