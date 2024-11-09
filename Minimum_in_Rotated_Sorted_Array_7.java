package Array;

import java.util.Scanner;

public class Minimum_in_Rotated_Sorted_Array_7 {
	 public static int findMin(int []arr) {
	        int low = 0, high = arr.length - 1;
	        int ans = Integer.MAX_VALUE;
	        while (low <= high) {
	            int mid = (low + high) / 2;

	            //search space is already sorted
	            //then arr[low] will always be
	            //the minimum in that search space:
	            if (arr[low] <= arr[high]) {
	                ans = Math.min(ans, arr[low]);
	                break;
	            }

	            //if left part is sorted:
	            if (arr[low] <= arr[mid]) {
	                // keep the minimum:
	                ans = Math.min(ans, arr[low]);

	                // Eliminate left half:
	                low = mid + 1;

	            } else { //if right part is sorted:

	                // keep the minimum:
	                ans = Math.min(ans, arr[mid]);

	                // Eliminate right half:
	                high = mid - 1;
	            }
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
	        int ans = findMin(a);
	        System.out.println("The minimum element is: " + ans );
	        scanner.close();
	    }
}
