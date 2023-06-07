public class Solution {
    public static int makeBeautiful(String str) {
        int n = str.length();
        int op1 = 0, op2 = 0;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0)
                if (str.charAt(i) != '0')
                    op1++;
            if (i % 2 != 0)
                if (str.charAt(i) != '1')
                    op1++;
        }

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0)
                if (str.charAt(i) != '1')
                    op2++;
            if (i % 2 != 0)
                if (str.charAt(i) != '0')
                    op2++;
        }
        return Math.min(op1, op2);
    }
}