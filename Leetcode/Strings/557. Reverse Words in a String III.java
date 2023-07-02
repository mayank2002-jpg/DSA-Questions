class Solution {
    public String reverseWords(String s) {
       int lastSpaceIndex = -1;
       char[] ch = s.toCharArray();
       for(int i = 0; i<=s.length();i++){
           if(i == s.length() || ch[i] == ' '){
               int startIdx = lastSpaceIndex + 1;
               int endIdx = i - 1;

               while(startIdx < endIdx){
                   char temp = ch[startIdx];
                   ch[startIdx] = ch[endIdx];
                   ch[endIdx] = temp;
                   startIdx++;
                   endIdx--;
               }
               lastSpaceIndex = i;
           }
       }
       return new String(ch); 
    }
}