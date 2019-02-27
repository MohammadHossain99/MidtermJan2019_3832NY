package Operator;

import java.util.Scanner;

public class UseOperator {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter 1st number:");
		int input1 = in.nextInt();
		System.out.println("Enter 2nd number:");
		int input2 = in.nextInt();
		
		if ((input1 > input2) && (input1 % 2 == 0)){
			System.out.println(input1 + " is bigger than "+input2+" and "+ input1 +" is even");
		} else if (input1 < input2){
			System.out.println(input2 + " is bigger than "+input1 );
		} else {
			System.out.println(input1 + " is equal to "+input2 );
		}
	}

}
