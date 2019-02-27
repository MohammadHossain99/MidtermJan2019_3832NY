package Life;

public class MyLife {
	public int metA (int a, int b) {
		int result = a + b;
		return result;
	}
	public int metB (int number1, int number2) {
		int total = number1 + number2;
		return total;
		}
	public void metC() {
		System.out.println("This is Addition");
	}
	public int metD ( int c, int d) {
		int result1 = c - d;
		return result1;
	}
	public int metE ( int h, int g) {
		if (h > g) {
			System.out.println("h is bigger than g");
		}
		else {
			System.out.println("g is bigger than h");
		}
	}
}


public class RunMyLife {
	
	public static void main(String[] args) {
		MyLife call = new MyLife();
		System.out.println(call.metA(1,2));
		call.metB(10,20);
		System.out.println(call.metC());
		System.out.println(call.metD(1,2));
		System.out.println(call.metE(10,12));
				
	}
}