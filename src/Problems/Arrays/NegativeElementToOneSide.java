package Problems.Arrays;

import java.util.Arrays;

public class NegativeElementToOneSide {
    public static void main(String[] args) {
        int[] arr = {-2,1,-10,-2};
        // This problem is also called as Dutch National Flag algorithm
        System.out.println("Original array: " + Arrays.toString(arr));
        moveNegativeElementsToOneSide(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));

    }

    private static void moveNegativeElementsToOneSide(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        int iter = 0;
        while(low <= high){
            iter++;
            if(arr[low] < 0 && arr[high] < 0){
                high--;
            }else if(arr[low] < 0){
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
                low ++;
                high --;
            }
            else{
                low++;
            }
        }
        System.out.println(iter);
    }
}
