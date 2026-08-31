package Pattern2;

public class invRotatHalfP {
    public static void inv_rotat_half_pyra(int n) {
        for (int i = 1; i <= n; i++) {
            // sinces spaces are rows-i then... for line=1 there are 3 spaces
            // i.e. 4-1=3 similarly stars are equal to i like in line 1 its 1 in 2 its 2
            // stars

            // for spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // for stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        inv_rotat_half_pyra(6);
    }

}
