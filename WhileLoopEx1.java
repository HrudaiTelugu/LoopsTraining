package basics.java;
import java.util.Scanner;

public class WhileLoopEx1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number ");
		
		int num = sc.nextInt();
		
		while(num<=10) {
			if(num%2==0) {
				System.out.println("Even Number : "+num);
			}else {
				System.out.println("Odd Number : "+num);
			}
			num++;
		}
		

	}

}
