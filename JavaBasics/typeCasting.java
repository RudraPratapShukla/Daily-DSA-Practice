package JavaBasics;

public class typeCasting {
    public static void main(String[] args) {
        // type conversion error {cannot store a float into int}.
        // float a = 20;
        // int b = a;

        // type casting ( where we know data will be lost but we still want to convert
        // from higher to lower like from float to int)
        // float a = 20.34f;
        // int b = (int) a;
        // System.out.println(b);

        char ch = 'a';
        int ch1 = (int) ch;
        System.out.println(ch1);

    }

}
