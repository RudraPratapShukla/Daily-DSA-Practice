package ConditionalStatements;

import java.util.*;

public class incomeTaxCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Income : ");
        int income = sc.nextInt();
        int tax;
        if (income < 500000) {
            tax = 0;
        } else if (income > 500000 && income < 1000000) {
            tax = (int) (income * 0.2);
        } else {
            tax = (int) (income * 0.3);
        }
        System.out.println("Tax is: " + tax);
        sc.close();

    }

}
