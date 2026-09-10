package BasicSorting;

public class insertionSort {
    public static void insertSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;
            while (prev >= 0 && arr[prev] > curr) {// change condn for reverse order
                arr[prev + 1] = arr[prev];
                prev--;
            }
            // insert
            arr[prev + 1] = curr;
        }
    }
    // tc is O(n2).

    public static void printNums(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 3, 2 };
        insertSort(arr);
        printNums(arr);
    }

}
