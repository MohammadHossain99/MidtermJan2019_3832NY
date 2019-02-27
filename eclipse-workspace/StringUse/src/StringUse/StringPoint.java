package StringUse;

import java.util.Scanner;
import java.lang.String;

public class StringPoint {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a long string consits of atleast 20 contineous letter:");
		String m = in.next();	
		System.out.println(m);
		System.out.println("String from index 10: ");
		System.out.println(m.substring(10));
		System.out.println("String from index 15 to 20: ");
		System.out.println(m.substring(15, 20));
		
		
	}

}
