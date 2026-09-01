package Pattern2;

public class solidRhombus {
    public static void sR(int n) {
        for (int i = 1; i <= n; i++) {
            // for spaces = n-i
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // for stars=n
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        sR(5);
    }
}
