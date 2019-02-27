package StringUse;

import java.util.Scanner;

public class StringUpper {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string:");
		String m = in.next();		
		System.out.println(m.toUpperCase()); //output all uppper case
		System.out.println(m.toLowerCase()); //output all lower case		
		System.out.println(m);				 //output same as input

	}

}
