package basics.java;
import java.util.Scanner;

public class MultiplicationTableUsingForLoop {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		System.out.print("Enter a Number for Multiplication = ");
		
		int mul =sc.nextInt();
		
		System.out.print("Enter the Starting value for a Multiplication Table = ");
		
		for(int num=sc.nextInt();num<=15;num++) {
			System.out.println(mul+" * "+num+" = "+(mul*num));
		}

	}

}
