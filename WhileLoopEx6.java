package basics.java;
import java.util.Scanner;

public class WhileLoopEx6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a Number = ");
		
		int num = sc.nextInt();
		int rev=0;
		int rem =0;
		int temp=num;
		
		while(num>0) {
			rem = num%10;
			rev = rev*10+rem;
			num/=10;
		}
		if(rev == temp) {
		System.out.println("Given Number is a Palindrom Number "+rev);
	}else {
		System.out.println("Given Number is a not Palindrom Number "+rev);
	}
	}
}
