package Array;
//Find triplets that add up to a zero
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

abstract class Three_sum_9 {
	 public static List<List<Integer>> triplet(int n, int[] arr) {
	        List<List<Integer>> ans = new ArrayList<>();
	        Arrays.sort(arr);

	        for (int i = 0; i < n; i++) {
	            //remove duplicates:
	            if (i != 0 && arr[i] == arr[i - 1]) continue;

	            //moving 2 pointers:
	            int j = i + 1;
	            int k = n - 1;
	            while (j < k) {
	                int sum = arr[i] + arr[j] + arr[k];
	                if (sum < 0) {
	                    j++;
	                } else if (sum > 0) {
	                    k--;
	                } else {
	                    List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k]);
	                    ans.add(temp);
	                    j++;
	                    k--;
	                    //skip the duplicates:
	                    while (j < k && arr[j] == arr[j - 1]) j++;
	                    while (j < k && arr[k] == arr[k + 1]) k--;
	                }
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
	        int n = a.length;
	        List<List<Integer>> ans = triplet(n, a);
	        for (List<Integer> it : ans) {
	            System.out.print("[");
	            for (Integer i : it) {
	                System.out.print(i + " ");
	            }
	            System.out.print("] ");
	        }
	        System.out.println();
	        scanner.close();
	    }
}
