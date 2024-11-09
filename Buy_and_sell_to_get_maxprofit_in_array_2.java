package Array;

import java.util.Scanner;

public class Buy_and_sell_to_get_maxprofit_in_array_2 {
	static int maximumProfit(int[] a)
    {
        int maxprofit = 0;
        int mini = a[0];
        for(int i=0;i<a.length;i++)
        {
            int curprofit = a[i]-mini;
             maxprofit = Math.max(maxprofit,curprofit);
             mini = Math.min(mini,a[i]);
        }
        return maxprofit;
    }
 public static void main (String[]args)
{
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter size of an array: ");
    int n = scanner.nextInt(); 
    int []a = new int[n];
    System.out.println("Enter the elements of an array: ");
    for(int i=0;i<a.length;i++)
    {
    a[i]=scanner.nextInt();
    }
     int result=maximumProfit(a);
     System.out.println("maximum profit: "+result);
     scanner.close();
}
}
