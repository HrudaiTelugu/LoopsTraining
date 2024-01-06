package basics.java;

import java.util.Scanner;

public class IfExample {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out .println("Enter the values of Integers to Check which is the Greatest value = ");
		
		int h =sc.nextInt();
		int i = sc.nextInt();
		int j = sc.nextInt();
		
		if(h>i && h>j) {
			System.out.println("H is the Greatest of Three");
		}
		else if(i>h && i>j) {
			System.out.println("I is the Greatest of Three");
		}
		else {
			System.out.println("J is the Greatest of Three");
		}
		System.out.println("Again Pulling this Code from GitHub");
		System.out.println("Thankyou");
}

}
