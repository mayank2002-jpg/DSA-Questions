import java.util.Scanner;

class Solution {

    static String reverseStringWordWise(String input) {
        String[] res = input.split(" ");
        String rev = "";
        for(int i = (res.length)-1;i>=0;i--){
            rev+=res[i];
           rev+=" ";
        }
        return rev;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String ans = reverseStringWordWise(input);
        System.out.println(ans);
    }
}