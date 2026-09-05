package Array;

import java.util.*;

public class inputOutputArray {
    public static void main(String args[]) {
        int marks[] = new int[20];
        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt(); // phy
        marks[1] = sc.nextInt(); // chem
        marks[2] = sc.nextInt(); // maths

        System.out.println("Physics: " + marks[0]);
        System.out.println("Chemistry: " + marks[1]);
        System.out.println("Maths: " + marks[2]);

        marks[2] = marks[2] + 1;
        System.out.println("New Maths: " + marks[2]);

        int percentage = (marks[0] + marks[1] + marks[2]) / 3;
        System.out.println("Percentage: " + percentage + "%");
        sc.close();

        // to get the array length just write .length after array name...
        System.out.println("Length of this Array: " + marks.length);

    }

}
