package ConditionalStatements;

import java.util.*;

public class largestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a >= b && a >= c) {
            System.out.println("a is largest.");
        } else if (b >= c) { // b>=a check is not needed because above statement of i also checked a>=bs
            System.out.println("b is largest.");
        } else {
            System.out.println("c is largest.");
        }
        sc.close();
    }
}
