package sort;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		int[] arr =  { 20, 12, 10, 15, 2 };
		selectionSort(arr);
	}
	private static void selectionSort(int[] arr) {
		for (int i = 0; i < arr.length -1; i++) {
			int min = i;
			for (int j = i + 1; j < arr.length; j++) {
				if(arr[j] < arr[min]) {
					min = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
		System.out.print(Arrays.toString(arr));
	}
}
