package ConditionalStatements;

import java.util.*;

public class passFailTernaryOp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();

        // ternary op...
        String status = ((marks > 33) ? "Pass" : "Fail");
        System.out.println("You are " + status);
        sc.close();
    }

}
