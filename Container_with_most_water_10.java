
package Array;

import java.util.Scanner;

public class Container_with_most_water_10 {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            int currentArea = Math.min(height[left], height[right]) * (right - left);
            maxArea = Math.max(maxArea, currentArea);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
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
        
        // Close the scanner
        scanner.close();
        
        // Create an instance of Container_With_Most_Water and call maxArea
        Container_with_most_water_10 container = new Container_with_most_water_10();
        int result = container.maxArea(a);
        
        // Print the result
        System.out.println("The maximum area is: " + result);
    }
}
