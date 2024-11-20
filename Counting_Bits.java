package Binary;

import java.util.Arrays;
import java.util.Scanner;

public class Counting_Bits {
    public int[] countBits(int n) {
        int[] ans = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            ans[i] = ans[i >> 1] + (i & 1);
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input: n = ");
        int n = scanner.nextInt();

        Counting_Bits c = new Counting_Bits();
        int[] a = c.countBits(n);

        System.out.println("Output: " + Arrays.toString(a));

        scanner.close();
    }
}
