package StringUse;

import java.util.Scanner;

public class UseString {

	public static void main(String[] args) {
		String m, n, o;
		Boolean retVal;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string: at least 20 char and groung of words:");
		m = in.nextLine();	
		System.out.println("String you entered is: " + m);
		System.out.println("Showing the length of the String");
		//1. Length of a string
		System.out.println("Length of String including space is: " + m.length());
		
		//2. Print String from a specific position
		System.out.println("String from index 3: " + m.substring(3));
		System.out.println("String from index 10 to 15: " + m.substring(10, 15));
		
		//3. Print String all upper case
		System.out.println("Print String in all upper Case: " + m.toUpperCase());
	
		//4. Print String all lower case
		System.out.println("Print String in all lower Case: " + m.toLowerCase());
	
		//5. Letter Replacement
		System.out.println("All letter of A will be replaced by B if present:");
		System.out.println("New String after the change: " + m.replace('a','b'));
		System.out.println("All letter of A will be replaced by * if present:");
		System.out.println("New String after the change: " + m.replace('a','*'));
		
		//6. Return Character from a specific position
		char ch1 = m.charAt(0);
		char ch2 = m.charAt(5);
		System.out.println("Character at 0 index is: "+ch1);
		System.out.println("Character at 5th index is: "+ch2);
		
		//7. Return output by single character
		System.out.println("Output by single character:");
		for(int i=0; i<=m.length()-1; i++) {
			System.out.println(m.charAt(i));
		}
	
		//8. Word search
		System.out.println("Enter the word you want to search: ");
		n = in.nextLine();
		if (m.contains("n")) {
			System.out.println(n + " word found in the given string");
		} else {
			System.out.println(n + " word is not found in the given string");
		}
	
		//9. String Match
		System.out.println("Enter two strings freshly for comparison : ");
		System.out.println("Enter a string : ");
		n = in.nextLine();	
		System.out.println(m);
		System.out.println("Enter another string: ");
		o = in.nextLine();
		if (n.equals(o) == true) {
			System.out.println("Match found");
		} else {
			System.out.println("Match not found");
		}
		
		//10. String Trimming
		System.out.println("Enter a string for Trimming: ");
		n = in.nextLine();	
		System.out.println("String before trim: "+ n);
	    System.out.println("String after trim: "+ n.trim());
	    
	    //11. Concatenate two String
	    System.out.println("Enter two strings freshly for Cocatenation : ");
		System.out.println("Enter a string : ");
		n = in.nextLine();	
		System.out.println(m);
		System.out.println("Enter another string: ");
		o = in.nextLine();
		n = n.concat(o);
		System.out.println("Result after adding two string: " + n);
		
		//12. Matching end word in a string
		System.out.println("Enter two strings freshly for matching end word : ");
		System.out.println("Enter a string : ");
		n = in.nextLine();	
		System.out.println(m);
		System.out.println("Enter a end word for matching: ");
		o = in.nextLine();
		retVal = n.endsWith(o);
		System.out.println("Returned Value = " +retVal);
		
		//13. Printing Hash Code
		System.out.println("Enter a string for getting Hash Code: ");
		System.out.println("Enter a string : ");
		n = in.nextLine();	
		System.out.println("HashCode for String is: " + n.hashCode());
		
		//14. Spliting the String
		System.out.println("Enter a string for spliting with - sign between word: ");
		System.out.println("Enter a string : ");
		n = in.nextLine();	
		for (String retval: n.split("-")) {
	         System.out.println(retval);
		}
		
		//15. Matching start word
		System.out.println("Enter two strings freshly for matching Start word : ");
		System.out.println("Enter a string : ");
		n = in.nextLine();	
		System.out.println("Enter a start word for matching: ");
		o = in.nextLine();
		retVal = n.startsWith(o);
		System.out.println("Returned Value = " +retVal);
	
		//16. Return value is same string
		System.out.println("Enter a string for return: ");
		n = in.nextLine();	
		System.out.println(n.toString());
		
		//17. Return Byte Code
		System.out.println("Enter a string for return Byte Code: ");
		n = in.nextLine();	 
		byte[] array1 = n.getBytes();
		System.out.print("Default Charset encoding:");
		for(byte b: array1){
		           System.out.println(b);
		       }
		
		//18. String Value of number
		System.out.println("Enter a Number for string equavalent: ");
		int number = in.nextInt();
		String str = String.valueOf(number);
		System.out.println("Equivalent String value of number is: " +str);
		
		//19. string contain a word
		System.out.println("Enter a string and a word for matching: ");
		System.out.println("Enter a string : ");
		n = in.nextLine();	
		System.out.println("Enter a start word for matching: ");
		o = in.nextLine();
		retVal = n.contains(o);
		System.out.println("String contain is: " + retVal);	
		
		//20. Comparing a string with memory
		System.out.println("Enter a string to match with memory: ");
		n = in.nextLine();	
		o = n.intern();
		System.out.println("Found Status: " + (n ==o));
		
		//21. Last occurance of a letter/word
		System.out.println("Enter a string which will tell last occurance of A: ");
		n = in.nextLine();
		System.out.println("Last a in String: " + n.lastIndexOf('a'));
		
		//22. Where a string is empty or not
		System.out.println("Enter a string or press enter: ");
		n = in.nextLine();
		System.out.println("Checking for string empty or not: " + n.isEmpty());
		
		//23. String joining with supplies element
		System.out.println("A string which will join with ^: ");
		String a =String.join("^","You","are","Awesome");  
		System.out.println(a);  
		
		//24. String Region Matching
		String str1 = new String("Hello, How are you");
	    String str2 = new String("How");
	    System.out.print("Result of Test: " );
	    System.out.println(str1.regionMatches(7, str2, 0, 3));
	    
	    //25. String Region Matching ignoring the upper/lower case
	    String str3 = new String("Hello, How are you");
	    String str4 = new String("How");
	    System.out.print("Result of Test: " );
	    System.out.println(str3.regionMatches(true, 7, str4, 0, 3));
	    
	    //26. Replace First
	    String str5 = new String("Site is BeginnersBook.com");
        System.out.print("String after replacing com with net :" );
	    System.out.println(str5.replaceFirst("com", "net"));
		
	    //27. Replace All
	    String str6 = new String("My .com site is BeginnersBook.com");
	    System.out.print("String after replacing all com with net :" );
	    System.out.println(str6.replaceAll("com", "net"));
	    
	    //28. Formating string
	    String str7 = "just a string";  
		String formattedString = String.format("My String is %s", str7); 
		System.out.println(formattedString); 
	
		//29. string to CharArray() Method
		String str8 = new String("Welcome to Astoria");
	    char[] array= str8.toCharArray();
	    System.out.println("Content of Array:");
	    for(char c: array){
	    System.out.print(c);
	     
	    //30. String copyValueOf() Method
	    char[] data = {'a','b','c','d','e','f','g','h','i','j','k'};
	    String str9 = "Text";
	    String str10 = "String";
	    str9 = str9.copyValueOf(data);
	    System.out.println("string1 after copy: " + str9);
        str10 = str10.copyValueOf(data, 5, 3 );
	    System.out.println("String2 after copy: " + str10);
	           
	}
	}	

}