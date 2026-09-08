package Array;

public class maxSubArraySum {
    public static void maxSArraySum(int nums[]) {
        int maxsum = Integer.MIN_VALUE;
        int currsum = 0;

        for (int i = 0; i < nums.length; i++) {
            int start = i;
            for (int j = i; j < nums.length; j++) {
                int end = j;
                currsum = 0;
                for (int k = start; k <= end; k++) {
                    // subarray sum...
                    currsum += nums[k];
                }
                System.out.println(currsum);
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
