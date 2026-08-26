package ConditionalStatements;

import java.util.*;

public class switchOp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        switch (num) {
            case 1:
                System.out.println("Fan");
                break; // jisse aage ka sb kuch na print ho
            case 2:
                System.out.println("AC");
                break;
            case 3:
                System.out.println("Cooler");
                break;
            default:
                System.out.println("Light chali gyi :)");
                break;
        } // bina break ke agr 2 enter kiya to 2 se aage k sb print ho jaega ac cooler
          // light chali gyi
        sc.close();
    }

}
