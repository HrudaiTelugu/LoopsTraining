package basics.java;
import java.util.Scanner;

public class WhileLoopEx7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Value of Outer Loop =");
		
		int outer = sc.nextInt();
	
		while(outer<=5) {
			System.out.println("My Study Timmings");
			
			
			int inner = 1;
			while(inner<=9) {
				System.out.println((inner+5)+" - "+(inner+6));
				inner++;
			}
			outer++;
		}

	}

}
