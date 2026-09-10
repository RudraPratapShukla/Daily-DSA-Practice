package BasicSorting;

import java.util.*;

public class inbuiltSort {
    public static void printNums(Integer nums[]) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer arr[] = { 5, 4, 1, 3, 2 };
        // Arrays.sort(arr);
        // for limited index sort use Array.sort(arr,si,ei);
        // Arrays.sort(arr, 0, 3); // 3 se phle tk se indexes sorted
        Arrays.sort(arr, Collections.reverseOrder());// Integer likhna pdega int k jgh kuki ye function primitive pr
                                                     // kaam nhi krta, only works on object type vars not primitive ,
                                                     // now arr
                                                     // is an object of Integer class
        // Arrays.sort(arr, 0, 3, Collections.reverseOrder()); // for si and ei
        printNums(arr);
    }

}
