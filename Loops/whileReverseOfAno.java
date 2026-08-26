package Loops;

import java.util.*;

public class whileReverseOfAno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to be reversed: ");
        int n = sc.nextInt();
        while (n > 0) {
            int lastDigit = n % 10;
            System.out.print(lastDigit);
            n /= 10;
        }
        System.out.println();
        sc.close();
    }

}
