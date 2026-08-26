package ConditionalStatements;

import java.util.*;

public class ifElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age :");
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("valid for Voting.");
        } else {
            System.out.println("Not valid for Voting.");
        }
        sc.close();
    }

}
