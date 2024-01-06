package basics.java;
import java.util.Scanner;

public class WhileLoopEx5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a Number = ");
		int num =sc.nextInt();
		
		int rem=0;
		
		int count = 0;
		
		while(num>0) {
			rem =num%10;
			count++;
			num/=10;
		}
		System.out.println("No of Digits in a Number = "+count);
	}

}
