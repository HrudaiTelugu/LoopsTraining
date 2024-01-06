package basics.java;
import java.util.Scanner;

public class WhileLoopEx9 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a Number =");
		
		int num =sc.nextInt();
		
		int even_sum=0;
		
		int even_count=0;
		
		int odd_sum=0;
		
		int odd_count = 0;
		
		int rem=0;
		
		while(num>0) {
			
			rem =num%10;
			
			if(rem%2==0) {
				even_sum+=rem;
				even_count++;
			}else {
				odd_sum+=rem;
				odd_count++;
			}
			num/=10;
		}
		System.out.println("Even Sum of a Given Number = "+even_sum+ ", Sum of Even Count in a Given number = "+even_count);
		System.out.println("Odd Sum of a Given Number = "+odd_sum+ ", Sum of Odd Count in a Given number = "+odd_count);
	}

}
