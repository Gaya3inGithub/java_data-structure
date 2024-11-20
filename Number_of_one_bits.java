package Binary;

import java.util.Scanner;

public class Number_of_one_bits {
	 public int hammingWeight(int n) {
	        int res = 0;
	        for (int i = 0; i < 32; i++) {
	            if (((n >> i) & 1) == 1) {
	                res += 1;
	            }
	        }
	        return res;        
	    }
	public static void main(String[]args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = scanner.nextInt();
		
		Number_of_one_bits num = new Number_of_one_bits();
		System.out.println(num.hammingWeight(n));
		
		scanner.close();
	}
}
