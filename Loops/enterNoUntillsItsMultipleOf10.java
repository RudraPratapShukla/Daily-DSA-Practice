package Loops;

import java.util.*;

public class enterNoUntillsItsMultipleOf10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter the No: ");
            int n = sc.nextInt();
            if (n % 10 == 0) {
                break;
            }
            System.out.println(n);
        } while (true);
        sc.close();
        System.out.println("Entered no is a multiple of 10.");
    }
}
