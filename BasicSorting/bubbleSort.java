package BasicSorting;

public class bubbleSort {
    public static void bS(int nums[]) {
        for (int turn = 0; turn < nums.length - 1; turn++) {
            // or for (int j = 0; j <= nums.length - 2 - turn; j++){
            for (int j = 0; j < nums.length - 1 - turn; j++) {
                if (nums[j] > nums[j + 1]) {
                    // swap
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }

        }
    }

    public static void printNums(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int nums[] = { 5, 4, 1, 3, 2 };
        bS(nums);
        printNums(nums);

    }

}
