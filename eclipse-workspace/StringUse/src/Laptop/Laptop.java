package Laptop;

import java.util.Scanner;

public class Laptop {

		public String LaptopName;
		public int LaptopNumber;
			//constructor 1
			public Laptop() {}
			
			//constructor 2
			public Laptop(String LaptopName) {
				System.out.println("Please enter Laptop Name: ");
				Scanner in = new Scanner(System.in);
				LaptopName= in.nextLine();
				this.LaptopName = LaptopName;
				System.out.println(LaptopName);
				return;
			}
			//constructor 3
			public Laptop(int LaptopNumber) {
				System.out.println("Please enter Laptop Number: ");
				Scanner in = new Scanner(System.in);
				LaptopNumber= in.nextInt();
				this.LaptopNumber = LaptopNumber;
				System.out.println(LaptopNumber);
				return;
			}
			public void setName() {
				this.LaptopName = LaptopName;
				this.LaptopNumber = LaptopNumber;
			}
			
			public void displayName() {
				System.out.println(this.LaptopName);
				System.out.println(this.LaptopNumber);
			}
			

	}
