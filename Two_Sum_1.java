package Array;
//Two sum: check if a pair with given sum exists in Array
import java.util.HashMap;
import java.util.Scanner;
public class Two_Sum_1 {
	  public static int[] TwoSum(int[]a,int target){
	    HashMap<Integer,Integer> mpp = new HashMap<>();
	    for(int i=0;i<a.length;i++)
	    {
	        int num = a[i];
	        int moreNeeded = target - num;
	        if(mpp.containsKey(moreNeeded))
	        {
	            return new int[]{mpp.get(moreNeeded),i};
	        }
	        mpp.put(a[i],i); 
	    }
	return new int[]{};
	}
	 
	  public static void main (String[]args)
	{
	    Scanner scanner = new Scanner(System.in);
	    System.out.print("Enter size of an array: ");
	    int n = scanner.nextInt(); 
	    int []a = new int[n];
	    System.out.print("Enter the elements of an array: ");
	    for(int i=0;i<a.length;i++)
	    {
	    a[i]=scanner.nextInt();
	    } 
	    System.out.print("Enter target: ");
	    int target = scanner.nextInt();
	     int[] result = TwoSum(a, target);
	        if (result.length == 2) {
	            System.out.println("Pair found at indices: " + result[0] + " and " + result[1]);
	        } else {
	            System.out.println("No pair found with the given target sum.");
	        }
	        scanner.close();
	}
}