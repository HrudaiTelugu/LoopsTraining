package basics.java;
import java.util.Scanner;

public class MultiplicationTableUsingWhileLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a Number for Multiplication Table = ");
		int mul=sc.nextInt();
		System.out.print("Give the input for Multiplication = ");
		int num=sc.nextInt();
		
		while(num<=15) {
			System.out.println(mul+" * "+num+" = "+(mul*num));
			num++;
		}
	}

}
