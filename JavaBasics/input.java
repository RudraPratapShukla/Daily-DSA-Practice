package JavaBasics;

import java.util.*;

public class input {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // this sc.next only takes input till space if space comes b/w the chars the
        // words after that is gone, check using Tony Stark as input one by one in each
        // code
        // String input = sc.next();
        // System.out.println(input);

        // for print the whole line after the space too
        // String name = sc.nextLine();
        // System.out.println(name);

        // for number
        int number = sc.nextInt();
        System.out.println(number);

        // for float
        float fl = sc.nextFloat();
        System.out.println(fl);

        // for double
        double db = sc.nextDouble();
        System.out.println(db);

        // for char
        char ch = sc.next().charAt(0);
        System.out.println(ch);

        // for long
        long lg = sc.nextLong();
        System.out.println(lg);

        // for short
        short st = sc.nextShort();
        System.out.println(st);

        // for byte
        byte bt = sc.nextByte();
        System.out.println(bt);
        sc.close();
    }
}
