package Container;

import java.util.Scanner;

public class Container {
	public static void main(String args[]) {
	      Scanner s = new Scanner(System.in);
	      System.out.println("Enter the length of the array:");
	      int length = s.nextInt();
	      int [] myArray = new int[length];
	      System.out.println("Enter the elements of the array:" + length + "Numbers");

	      for(int i=0; i<length; i++ ) {
	          System.out.print("Enter item Number " + i + ":   ");
	    	  myArray[i] = s.nextInt();
	      }
	      System.out.println("Displaying the Array");
	      for(int i=0; i<length; i++ ) {
		         System.out.println("Item Number " + i + " :  " + myArray[i]);
		      }

		   }
}
