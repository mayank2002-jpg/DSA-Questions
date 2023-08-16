import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(isArmstrong(n));
	}

	public static boolean isArmstrong(int n){
		int temp = n;
		int sum = 0;
		int power = countDigits(n);
		while(temp!=0){
			int lastDigit = temp%10;
			sum += Math.pow(lastDigit, power);
			temp = temp/10;
		}
		if(sum == n){
		return true;
		}
		 return false;
	}
	public static int countDigits(int n){
		int count = 0;
		while(n!=0){
			n = n/10;
			count++;
		}
		return count;
	}
}
