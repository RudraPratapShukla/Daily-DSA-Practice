package ConditionalStatements;

public class largestOfTwo {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        if (a > b) {
            System.out.println("Greatest is a: " + a);
        }
        if (a == b) {
            System.out.println("Both are equal");
        } else {
            System.out.println("Greatest is b: " + b);
        }
    }

}
