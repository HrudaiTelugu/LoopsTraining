package basics.java;
import java.util.Scanner;

public class WhileLoopEx2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a StartNumber = ");
		
		int start = sc.nextInt();
		
		int even_sum=0;
		
		System.out.print("Enter a EndNumber = ");
		
		int end = sc.nextInt();
		
		int odd_sum=0;
		
		while(start<=end) {
			if(start%2==0) {
				even_sum+=start;
			}else if(start%2!=0) {
				odd_sum+=start;
			}
			start++;
		}
		System.out.println("Summation of Even Numbers = "+even_sum);
		System.out.println("Summation of Even Numbers = "+odd_sum);
	}

}
