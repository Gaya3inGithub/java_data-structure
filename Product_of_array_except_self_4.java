package Array;

import java.util.Scanner;

public class Product_of_array_except_self_4 {
	 public int[] ProductExceptself(int[] nums) {
	        int n = nums.length;
	        int pref[] = new int[n];
	        int suff[] = new int[n];
	        pref[0] = 1;

	        // Calculate prefix products
	        for (int i = 1; i < n; i++) {
	            pref[i] = pref[i - 1] * nums[i - 1];
	        }

	        suff[n - 1] = 1;

	        // Calculate suffix products
	        for (int i = n - 2; i >= 0; i--) {
	            suff[i] = suff[i + 1] * nums[i + 1];
	        }

	        int ans[] = new int[n];
	        
	        // Compute the result using prefix and suffix arrays
	        for (int i = 0; i < n; i++) {
	            ans[i] = pref[i] * suff[i];
	        }

	        return ans;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter size of an array: ");
	        int size = scanner.nextInt();
	        int[] a = new int[size];
	        System.out.println("Enter " + size + " elements: ");
	        
	        for (int i = 0; i < a.length; i++) {
	            a[i] = scanner.nextInt();
	        }

	        // Create an instance of the class to call the ProductExceptself method
	        Product_of_array_except_self_4 obj = new Product_of_array_except_self_4();
	        int[] b = obj.ProductExceptself(a);

	        System.out.println("Resulting array: ");
	        for (int val : b) {
	            System.out.print(val + " ");
	        }
	        scanner.close();
	    }
}
