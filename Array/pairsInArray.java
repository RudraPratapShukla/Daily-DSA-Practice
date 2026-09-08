package Array;

public class pairsInArray {
    public static void pair(int nums[]) {
        int totalPairs = 0;
        for (int i = 0; i < nums.length; i++) {
            int curr = nums[i]; // 2,4,6,8,10.
            for (int j = i + 1; j < nums.length; j++) {
                System.out.print("(" + curr + "," + nums[j] + ")");
                totalPairs++;
            }
            System.out.println();
        }
        System.out.println("Total no of  pair =  " + totalPairs);
    }

    public static void main(String[] args) {
        int nums[] = { 2, 4, 6, 8, 10 };
        pair(nums);
    }

}
