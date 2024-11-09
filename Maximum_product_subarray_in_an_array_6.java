package Array;

import java.util.Scanner;

public class Maximum_product_subarray_in_an_array_6 {
	 public static int maxProductSubArray(int[] arr) {
	        int n = arr.length; //size of array.

	        int pre = 1, suff = 1;
	        int ans = Integer.MIN_VALUE;
	        for (int i = 0; i < n; i++) {
	            if (pre == 0) pre = 1;
	            if (suff == 0) suff = 1;
	            pre *= arr[i];
	            suff *= arr[n - i - 1];
	            ans = Math.max(ans, Math.max(pre, suff));
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
	        int answer = maxProductSubArray(a);
	        System.out.println("The maximum product subarray is: " + answer);
	        scanner.close();
	    }
}
