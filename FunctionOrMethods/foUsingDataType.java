package FunctionOrMethods;

public class foUsingDataType {
    public static int sum(int a, int b) {
        return a + b;
    }

    public static float sum(float a, float b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(sum(3, 5));
        System.out.println(sum(2.3f, 4.7f));
        System.out.println(sum(2.3f, 4));// ek bhi parameter float type ka hua to float wala function call hoga
                                         // hume define nhi krna pdega ki konsa chahiye
        System.out.println(sum(2, 4.7f));// same for this
    }

}
