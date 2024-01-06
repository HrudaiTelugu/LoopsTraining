package basics.java;
import java.util.Scanner;

public class ForLoopEx2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Base Number = ");
		
		int base = sc.nextInt();
		
		System.out.print("Enter the Power Number = ");
		
		int pow = sc.nextInt();
		
		int result=1;
		
		for(int i=1;i<=pow;i++) {
			
			result = result*base;
		}
		System.out.println("The Result is = "+result);
	}

}
