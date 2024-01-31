package problems;

import java.util.Arrays;

public class ZeroOneTwoSorting {

    public static void main(String[] args) {
        int[] arr = {2,1,0,2};
        // This problem is also called as Dutch National Flag algorithm
        System.out.println("Original array: " + Arrays.toString(arr));
        sortArr(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));

    }

    private static void sortArr(int[] arr) {
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;
        int iter = 0;
        while (mid <= high) {
            iter++;
            switch (arr[mid]) {
                case 0:
                    int temp = arr[mid];
                    arr[mid] = arr[low];
                    arr[low] = temp;
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2 :
                    int midTemp = arr[mid];
                    arr[mid] = arr[high];
                    arr[high] = midTemp;
                    high--;
                    break;
            }
        }
        System.out.println(iter);
    }
}
