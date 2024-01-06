package basics.java;
import java.util.Scanner;

public class ForLoopEx1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Start value for the Condition = ");
		
		int start = sc.nextInt();
		
		int even_sum=0;
		
		int odd_sum=0;
		
		System.out.print("Enter the End Value For the Condition = ");

		for(int end = sc.nextInt();start<=end;start++) {
			if(start%2==0) {
				even_sum+=start;
			}else if(start%2!=0){
				odd_sum+=start;
			}
			else {
				System.out.println("Inavlid Characters");
			}
		}
		System.out.println("Summation of Even Numbers = "+even_sum);
		System.out.println("Summation of odd Numbers = "+odd_sum);
	}

}
