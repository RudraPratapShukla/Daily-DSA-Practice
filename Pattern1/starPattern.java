package Pattern1;

public class starPattern {
    public static void main(String[] args) {
        for (int line = 1; line <= 4; line++) {
            for (int star = 1; star <= line; star++) {
                System.out.print("*");// for one line only
            }
            System.out.println();// jisse har baar loop o/p de alag alag lines me
        }
    }

}
