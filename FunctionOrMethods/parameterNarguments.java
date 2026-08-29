package FunctionOrMethods;

import java.util.*;

public class parameterNarguments {
    // returnType name(type param1, type param2){
    //
    // body
    // return statement }
    public static int calcSum(int num1, int num2) {
        int sum = num1 + num2;// num1,2 are formal parameters
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = calcSum(a, b);// a,b are arguments or actual paramets that we write under the function call.
        sc.close();
        System.out.println(sum);
    }

}
