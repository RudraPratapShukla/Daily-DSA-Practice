package Loops;

import java.util.*;

public class whileSumOfFirstNNaturalNos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n:");
        int n = sc.nextInt();
        int i = 1;
        int sum = 0;
        while (i <= n) {
            sum += i;
            i++;
        }
        System.out.println("sum of first n natural nos is:" + sum);
        sc.close();

    }

}
