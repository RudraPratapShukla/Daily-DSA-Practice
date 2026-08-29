package FunctionOrMethods;

public class functionOverloadingWithParam {
    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println("Sum is: " + sum(1, 2));
        System.out.println("Sum is: " + sum(1, 2, 3));
    }

}
