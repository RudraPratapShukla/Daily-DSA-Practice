package Array;

public class prefixSumSubArray {
    public static void maxSArraySum(int nums[]) {
        int maxsum = Integer.MIN_VALUE;
        int currsum = 0;
        int prefix[] = new int[nums.length];

        prefix[0] = nums[0];
        // calc prefix Array
        for (int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i - 1] + nums[i];

        }

        // time complexity here is O(n^2) which is less than brute force which has
        // O(n^3)

        for (int i = 0; i < nums.length; i++) {
            int start = i;
            for (int j = i; j < nums.length; j++) {
                int end = j;
                currsum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];

                if (maxsum < currsum) {
                    maxsum = currsum;
                }
            }
        }
        System.out.println("Max sub array sum : " + maxsum);
    }

    public static void main(String[] args) {
        int nums[] = { 2, 4, 6, 8, 10 };
        maxSArraySum(nums);
    }

}
