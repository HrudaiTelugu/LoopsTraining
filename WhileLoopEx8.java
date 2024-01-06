package basics.java;
import java.util.Scanner;

public class WhileLoopEx8 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a Value = ");
		
		int num = sc.nextInt();
		
		int temp=num;
		
		int sum=0; 
		
		int rem=0;
		
		while(num>0) {
			rem =num%10;
			
			sum=sum+rem*rem*rem;
			
			num/=10;
		}
		if(sum==temp) {
			System.out.println("Given Number is a Armstrong = "+sum);
		}else {
			System.out.println("Given Number is not a Armstrong = "+sum);
		}
	}

}
