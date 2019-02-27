package test;

import java.util.Scanner; //importing this for input//

public class test1 {
		public static void main(String[] args)
		{
			Scanner in = new Scanner(System.in);
			System.out.println("What is your hobby?");
			String name = in.nextLine();	
			System.out.println("What is your age?");
			int age = in.nextInt();
			System.out.println("My hobby is" + " "+ name);
			System.out.println("My Age is" + " "+ age);
			System.out.println("");
			System.out.println("Let us do multiplication");
			System.out.println("Enter 1st number:");
			int input1 = in.nextInt();
			System.out.println("Enter 2nd number:");
			int input2 = in.nextInt();
			int result1 = input1 * input2;
			in.close();
			System.out.println("Result of multiplication is: " + result1);
			}
}
