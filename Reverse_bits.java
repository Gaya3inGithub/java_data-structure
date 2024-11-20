package Binary;

import java.util.Scanner;

public class Reverse_bits {
    // Method to reverse bits of a 32-bit integer
    public int reverseBits(int n) {
        int ans = 0;
        for (int i = 0; i < 32; i++) {
            // Extract the last bit of `n`
            int a = n & 1;
            n = n >> 1;

            // Append the extracted bit to `ans`
            ans = (ans << 1) | a;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input prompt
        System.out.print("Enter a 32-bit binary string: ");
        String binaryInput = scanner.nextLine();

        // Parse the binary string to an integer
        int n = Integer.parseUnsignedInt(binaryInput, 2);

        Reverse_bits rb = new Reverse_bits();
        int reversed = rb.reverseBits(n);

        // Convert the reversed integer to an unsigned binary string
        String reversedBinary = String.format("%32s", Integer.toBinaryString(reversed)).replace(' ', '0');

        // Output results
        System.out.println("Output: " + reversed + " (" + reversedBinary + ")");

        scanner.close();
    }
}
