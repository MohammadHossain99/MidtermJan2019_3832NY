package StringUse;

import java.util.Scanner;

public class StringWordSearch {

	public static void main(String[] args) {
		String m, n;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string : ");
		m = in.nextLine();	
		System.out.println(m);
		System.out.println("Enter the word you want to search: ");
		n = in.nextLine();
		if (m.contains("n")) {
			System.out.println(n + " word found in the given string");
		} else {
			System.out.println(n + " word is not found in the given string");
		}
	}

}
