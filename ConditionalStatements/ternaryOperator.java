package ConditionalStatements;

import java.util.*;

public class ternaryOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        // ternary operator...
        String result = ((num % 2 == 0) ? "Even" : "Odd");
        System.out.println(result);
        sc.close();

    }

}
