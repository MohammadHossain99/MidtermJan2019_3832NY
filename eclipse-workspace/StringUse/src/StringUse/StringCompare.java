package StringUse;

import java.util.Scanner;

public class StringCompare {

	public static void main(String[] args) {
		String m, n;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string : ");
		m = in.nextLine();	
		System.out.println(m);
		System.out.println("Enter another string: ");
		n = in.nextLine();
		if (m.equals(n) == true) {
			System.out.println("Match found");
		} else {
			System.out.println("Match not found");
		}
		
	}
}

