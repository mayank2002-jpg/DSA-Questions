import java.util.List;
public class Solution {
    public static void printNtimes(int n){
        if(n==0) return;
       printNtimes(n-1);
       
      System.out.print("Coding Ninjas ");
    }
}