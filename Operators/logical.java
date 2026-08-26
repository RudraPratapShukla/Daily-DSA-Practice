package Operators;

public class logical {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        System.out.println((a == b) && (a > b)); // AND
        System.out.println((a != b) && (a > b));

        System.out.println((a == b) || (a > b)); // OR
        System.out.println((a != b) || (a > b));
        System.out.println((a == b) || (a < b));

        System.out.println(!(a == b)); // NOT
        System.out.println(!(a > b));
    }

}
