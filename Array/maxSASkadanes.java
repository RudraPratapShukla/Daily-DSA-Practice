package Array;

public class maxSASkadanes {
    public static void kadanes(int nums[]) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        for (int i = 0; i < nums.length; i++) {
            cs = cs + nums[i];
            if (cs < 0) {
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.println("Max SubArray Sum: " + ms);
    }

    public static void main(String[] args) {
        int nums[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        kadanes(nums);
    }
}

// for all values negative in array this code will give the largest -ve value
// that is - with smallest integer .

// public static int maxSubArraySum(int[] arr) {

// int currentSum = arr[0];
// int maxSum = arr[0];

// for (int i = 1; i < arr.length; i++) {

// // Either start a new subarray
// // or extend the previous subarray
// currentSum = Math.max(arr[i], currentSum + arr[i]);

// // Update maximum sum
// maxSum = Math.max(maxSum, currentSum);
// }

// return maxSum;
// }
