package FunctionOrMethods;

public class productAB {
    public static int prod(int a, int b) {
        int product = a * b;
        return product;
    }

    public static void main(String[] args) {
        int x = 20;
        int y = 10;
        int z = prod(x, y);
        System.out.println("Product:" + z);
        int t = prod(100, 200);
        System.out.println("Product:" + t);
    }
}
