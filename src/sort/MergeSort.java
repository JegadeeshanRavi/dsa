package sort;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] array = {12, 4, 5, 6, 7, 3, 1, 15};

        System.out.println("Original array: " + Arrays.toString(array));

        mergeSort(array, 0, array.length - 1);

        System.out.println("Sorted array: " + Arrays.toString(array));
    }

    public static void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            // Find the middle point
            int middle = (left + right) / 2;

            // Recursively sort the first and second halves
            mergeSort(array, left, middle);
            mergeSort(array, middle + 1, right);

            // Merge the sorted halves
            merge(array, left, middle, right);
        }
    }

    public static void merge(int[] array, int left, int middle, int right) {
        // Calculate the sizes of the two sub-arrays to be merged
        int sizeLeft = middle - left + 1;
        int sizeRight = right - middle;

        // Create temporary arrays to store the values of the two sub-arrays
        int[] leftArray = new int[sizeLeft];
        int[] rightArray = new int[sizeRight];

        // Copy data to temporary arrays
        for (int i = 0; i < sizeLeft; i++) {
            leftArray[i] = array[left + i];
        }
        for (int j = 0; j < sizeRight; j++) {
            rightArray[j] = array[middle + 1 + j];
        }

        // Merge the two temporary arrays back into the original array

        // Initial indices for the two sub-arrays
        int i = 0, j = 0;

        // Initial index of the merged sub-array
        int k = left;

        while (i < sizeLeft && j < sizeRight) {
            // Compare elements of the two sub-arrays and merge them in ascending order
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // Copy the remaining elements of leftArray[], if there are any
        while (i < sizeLeft) {
            array[k] = leftArray[i];
            i++;
            k++;
        }

        // Copy the remaining elements of rightArray[], if there are any
        while (j < sizeRight) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }
}
