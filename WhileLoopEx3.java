package basics.java;
import java.util.Scanner;

public class WhileLoopEx3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a Value = ");
		
		int num = sc.nextInt();
		
		int sum=0;
		
		while(num>0) {
			int rem = num%10;
			sum=sum+rem;
			num/=10;
		}
		System.out.println("Sum of Digits in a Given Number = "+sum);
	}

}
