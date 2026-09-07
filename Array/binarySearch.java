package Array;

public class binarySearch {
    public static int bS(int nums[], int key) {
        int start = 0, end = nums.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] == key) {
                return mid;
            }
            if (nums[mid] < key) { // right shift
                start = mid + 1;
            } else {// left shift
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int nums[] = { 2, 4, 5, 6, 7, 8, 9 };
        int key = 6;
        System.out.println("required value " + key + " is at index " + bS(nums, key));
    }

}
