package Array;
import java.util.HashSet;
import java.util.Scanner;
public class Duplicate_elements_in_array_3 {
	public boolean containsDuplicate(int[] nums) {
        
        HashSet<Integer> set = new HashSet<>();
        
        for(int i = 0; i<nums.length;i++){
            set.add(nums[i]);
        }
        
        // if it contains duplicate then the size of 
        // set will not equal to the length
        // of the array
        if(set.size() < nums.length)
            return true;
        
        return false;
    }
    
	public static void main (String[] args) {
	    
		Duplicate_elements_in_array_3 d = new Duplicate_elements_in_array_3();
	    
		Scanner scanner = new Scanner(System.in);
	    System.out.print("Enter size of an array: ");
	    int n = scanner.nextInt(); 
	    int []a = new int[n];
	    System.out.print("Enter the elements of an array: ");
	    for(int i=0;i<a.length;i++)
	    {
	    a[i]=scanner.nextInt();
	    } 
	    
	    boolean res = d.containsDuplicate(a);
	    
	    System.out.println(res);
	    scanner.close();
	}
}
