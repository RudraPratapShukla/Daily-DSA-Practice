package Pattern2;

public class diamondPattern {
    public static void dp(int n) {
        // first half
        for (int i = 1; i <= n; i++) {
            // for spaces = n-i
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // for stars = (2*i)-1
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // 2nd half mirror image of first half
        // agr last line uppr half ki repeat nhi krni to just make i=n-1 in 2nd half for
        // loop
        for (int i = n; i >= 1; i--) {
            // for spaces = n-i
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // for stars = (2*i)-1
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        dp(5);
    }

}
