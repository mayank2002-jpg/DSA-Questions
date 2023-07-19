public static String printNumber(String s, int n) 
{
    String ans = "";
    int value[] = {2,2,2,3,3,3,4,4,4,5,5,5,6,6,6,7,7,7,7,8,8,8,9,9,9,9};
    for(int i = 0; i<n;i++){
        ans += value[s.charAt(i)-'a'];
    }
    return ans;
}