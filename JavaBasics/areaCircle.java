package JavaBasics;

import java.util.*;

public class areaCircle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius: ");
        float rad = sc.nextFloat();
        float Area = 3.14f * rad * rad;
        System.out.println("Area is: " + Area);
        sc.close();

    }
}