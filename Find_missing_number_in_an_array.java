package Binary;

import java.util.Scanner;

public class Find_missing_number_in_an_array {
	 public static int missingNumber(int []a, int N) {

	        int xor1 = 0, xor2 = 0;

	        for (int i = 0; i < N - 1; i++) {
	            xor2 = xor2 ^ a[i]; // XOR of array elements
	            xor1 = xor1 ^ (i + 1); //XOR up to [1...N-1]
	        }
	        xor1 = xor1 ^ N; //XOR up to [1...N]

	        return (xor1 ^ xor2); // the missing number
	    }
	 public static void main (String[]args)
	 {
	     Scanner scanner = new Scanner(System.in);
	     System.out.println("Enter N: ");
	     int N = scanner.nextInt();
	     System.out.println("Enter size of an array: ");
	     int n = scanner.nextInt(); 
	     int []a = new int[n];
	     System.out.println("Enter the elements of an array: ");
	     for(int i=0;i<a.length;i++)
	     {
	     a[i]=scanner.nextInt();
	     }
	     int ans = missingNumber(a, N);
	     System.out.println("The missing number is: " + ans);
	     scanner.close();
	 }
}
