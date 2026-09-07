package Array;

public class smallestLargest {
    public static int getLargest(int nums[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > largest) {
                largest = nums[i];
            }
            if (nums[i] < smallest) {
                smallest = nums[i];
            }
        }
        System.out.println("Smallest is : " + smallest);
        return largest;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 5, 4, 7, 6, 8, 0, 9 };
        System.out.println("Largest no in the Array is : " + getLargest(nums));
    }
}
