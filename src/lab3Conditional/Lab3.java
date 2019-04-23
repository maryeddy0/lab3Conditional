package lab3Conditional;

import java.util.Scanner;

public class Lab3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String name;
		System.out.println("Hello, \nwhat is your name?");
		name = scan.nextLine();
		
		int input1;
		System.out.println(name + ", Please enter an integer between 1 and 100");
		input1 = scan.nextInt();

		if (input1 % 2 == 0 && input1 > 1 && input1 < 25) {
			System.out.println(name + ", your number " + input1 + " is even and less than 25");
		
		} else if (input1 % 2 == 0 && input1 > 26 && input1 < 60) {
			System.out.println(name + ", your number " + input1 + " is even");
		
		} else if (input1 % 2 == 0 && input1 > 1 && input1 < 101) {
			System.out.println(name + ", your number " + input1 + " is even");
		
		} else if (input1 % 2 != 0 && input1 > 1 && input1 < 60) {
			System.out.println(name + ", your number " + input1 + " is odd");
		
		} else if (input1 % 2 != 0 && input1 > 60 && input1 < 101) {
			System.out.println(name + ", your number  " + input1 + " is odd and over 60");
		
		} else 
			System.out.println("I'm sorry, that is an invalid entry");
		
		System.out.println();
		System.out.println("Goodbye");
scan.close();
	}
}
