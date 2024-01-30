package Array;

import java.util.Iterator;

public class ReverseArray {

	public static void reverseArray(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			int temp = arr[i];
			int arrlast = arr[arr.length - (i + 1)];
			arr[arr.length - (i + 1)] = temp;
			arr[i] = arrlast;
			if (arr.length / 2 == i) {
				break;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		// reverseArray(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 , 10});
		// reverseArrayWithTwoPointerTechnique(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 ,
		// 10});
		reverseWithTry(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 });
	}

	private static void reverseArrayWithTwoPointerTechnique(int[] arr) {

		int start = 0;
		int end = arr.length - 1;
		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	private static void reverseWithTry(int[] arr) {
		int start = 0;
		int end = arr.length - 1;
		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
