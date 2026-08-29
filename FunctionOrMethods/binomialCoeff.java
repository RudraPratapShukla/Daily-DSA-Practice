package FunctionOrMethods;

public class binomialCoeff {

    public static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    public static int binoCoeff(int n, int r) {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int factnmr = factorial(n - r);
        int binoCoeff = fact_n / (fact_r * factnmr);
        return binoCoeff;
    }

    public static void main(String[] args) {
        int n = 5;
        int r = 2;
        System.out.println("Binomial Coefficient is: " + binoCoeff(n, r));
    }
}
