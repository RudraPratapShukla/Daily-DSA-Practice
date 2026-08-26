package Loops;

import java.util.*;

public class whileReversetheOGno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num to be Reversed: ");
        int n = sc.nextInt();
        int rev = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            rev = rev * 10 + lastDigit;
            n /= 10;
        }
        System.out.println("Reversed Num is: " + rev);
        sc.close();
    }

}
