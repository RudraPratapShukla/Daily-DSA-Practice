package FunctionOrMethods;

public class callByValue {
    public static int changeA(int a) {
        a = 20;
        return a;
    }

    public static void main(String[] args) {
        int a = 5;
        changeA(a); // even after calling changeA a didnt get changed from a=5 to a=20 bcoz in java
                    // its call by value where the the variables copy is passed to the function not
                    // the original value {refer notebook for more...}
        System.out.println(a);
    }
}
