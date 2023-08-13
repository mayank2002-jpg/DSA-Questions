 /*
    *
   ***  
  *****
 *******
*********
*********
 *******
  *****
   ***
    *
*/



class Solution {

    void printDiamond(int n) {
        // Upper triangle
        
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        //Lower Triangle
        
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i-1;j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=n-i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}