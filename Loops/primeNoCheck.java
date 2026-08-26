package Loops;

import java.util.*;

public class primeNoCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number to Check: ");
        int n = sc.nextInt();

        if (n == 2) {
            System.out.println("Prime No.");
        } else { // for much optimised solution run loop from 2 to Math.sqrt(n) which means
                 // square root of n kuki yahi aisa point hota h jise as pass factors unique hote
                 // hain warna iske baad to repeat hote h jaise 4*2 = 8 or 2*4 = 8 etc...
            boolean isPrime = true;
            for (int i = 2; i <= n - 1; i++) { // i is a factor of n except 1 , n...
                if (n % i == 0) {
                    isPrime = false;
                }
            }

            // in case of i = 2 to n-1 loop runs n-2 times approx but for loop till sqrt(n)
            // loop runs sqrt(n)-1 times approx thus making it much more optimised...

            if (isPrime == true) {
                System.out.println("Prime No.");
            } else {
                System.out.println("Not a Prime.");
            }
            sc.close();
        }
    }

}
