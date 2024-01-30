package sort;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] array = {12, 4, 5, 6, 7, 3, 1, 15};
        
        System.out.println("Original array: " + Arrays.toString(array));
        
        quickSort(array, 0, array.length - 1);
        
        System.out.println("Sorted array: " + Arrays.toString(array));
    }
    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            // Partition the array into two halves
            int partitionIndex = partition(array, low, high);

            // Recursively sort each half
            quickSort(array, low, partitionIndex - 1);
            quickSort(array, partitionIndex + 1, high);
        }
    }
    public static int partition(int[] array, int low, int high) {
        // Choose the pivot element (usually the last element in the array)
        int pivot = array[high];

        // Index of the smaller element
        int i = low - 1;

        // Traverse the array and rearrange elements such that elements less than the pivot are on the left
        // and elements greater than the pivot are on the right
        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;

                // Swap array[i] and array[j]
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        // Swap array[i+1] and pivot
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        // Return the index of the pivot element after partitioning
        return i + 1;
    }
}
