package Binary;

import java.util.Scanner;

public class Sum_of_Two_Integers {
	public int getSum(int a, int b) {
		if (a == 0) return b;
		if (b == 0) return a;

		while (b != 0) {
			int carry = a & b;
			a = a ^ b;
			b = carry << 1;
		}
		
		return a;
	}
	public int getSubtract(int a, int b) {
		while (b != 0) {
			int borrow = (~a) & b;
			a = a ^ b;
			b = borrow << 1;
		}
		
		return a;
	}
public static void main(String[]args)
{
	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter a: ");
	int a = scanner.nextInt();
	System.out.print("Enter b: ");
	int b = scanner.nextInt();
	
	Sum_of_Two_Integers s = new Sum_of_Two_Integers();
	System.out.println(s.getSum(a,b));
	
	scanner.close();
}
}


