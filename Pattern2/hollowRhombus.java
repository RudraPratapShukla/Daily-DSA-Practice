package Pattern2;

public class hollowRhombus {
    public static void hR(int n) {
        for (int i = 1; i <= n; i++) {
            // for spaces=n-i
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // hollow rectangle case
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        hR(5);
    }

}
