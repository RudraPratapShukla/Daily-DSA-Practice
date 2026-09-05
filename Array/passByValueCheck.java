package Array;

public class passByValueCheck {
    public static void update(int marks[], int unchangeable) {
        unchangeable = 20;
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }

    public static void main(String[] args) {
        int marks[] = { 92, 93, 94 };
        int unchangeable = 5;
        update(marks, unchangeable);
        // lets see if marks gets update after altering outside the main function where
        // it is created
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i] + " ");
        }
        // see unchangeable will not change as its pass by value
        // but array changes as its pass by reference
        System.out.println(unchangeable);
    }
}
