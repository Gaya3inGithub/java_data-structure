package Array;

import java.util.Scanner;

public class Kadane_algorithm_maximum_subarray_sum_5 {

    public static long maxSubarraySum(int[] arr, int n) {
        long maxi = Long.MIN_VALUE; // maximum sum
        long sum = 0;

        for (int i = 0; i < n; i++) {

            sum += arr[i];

            if (sum > maxi) {
                maxi = sum;
            }

            // If sum < 0: discard the sum calculated
            if (sum < 0) {
                sum = 0;
            }
        }

        // To consider the sum of the empty subarray
        // uncomment the following check:

        //if (maxi < 0) maxi = 0;

        return maxi;
    }

    public static void main(String args[]) {
         Scanner scanner = new Scanner(System.in);
    System.out.println("Enter size of an array: ");
    int n = scanner.nextInt(); 
    int []arr = new int[n];
    System.out.println("Enter the elements of an array: ");
    for(int i=0;i<arr.length;i++)
    {
    arr[i]=scanner.nextInt();
    }
        long maxSum = maxSubarraySum(arr, n);
        System.out.println("The maximum subarray sum is: " + maxSum);
scanner.close();
    }
}
