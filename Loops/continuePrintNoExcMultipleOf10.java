package Loops;

import java.util.*;

public class continuePrintNoExcMultipleOf10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter your no: ");
            int n = sc.nextInt();
            if (n % 10 == 0) {
                continue;
            }
            System.out.println("your num was: " + n);
        } while (true);
    }

}
