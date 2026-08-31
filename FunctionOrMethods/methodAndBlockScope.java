package FunctionOrMethods;

public class methodAndBlockScope {
    public static void Scope() {
        int a = 10;
        System.out.println(a);

    }

    public static void newScope() {
        // System.out.println(a);//not print (error) due to class scope , a kisi or
        // class me defined h and cannot be directly used here , can only be used in
        // arguments .
    }

    public static void main(String[] args) {
        {
            // System.out.println(a); // nhi print kuki is line bad hi a define hua h
            int a = 10;
            System.out.println(a);
        }
        // System.out.println(a);//not print kuki a var defined inside block cannot be
        // directly used outside the block
    }

}
