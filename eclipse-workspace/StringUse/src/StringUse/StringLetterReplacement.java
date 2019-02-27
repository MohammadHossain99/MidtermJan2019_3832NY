package StringUse;

import java.util.Scanner;

public class StringLetterReplacement {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String m = in.next();	
		System.out.println("All letter of K will be placed by B if present:");
		System.out.println("New String after the change: " + m.replace('k','b'));
		System.out.println("All letter of a will be placed by * if present:");
		System.out.println("New String after the change: " + m.replace('a','*'));
		


	}

}
