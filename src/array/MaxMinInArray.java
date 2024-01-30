package array;

public class MaxMinInArray {

	public static void main(String[] args) {
		int[] arr = new int[] { 11, 2, 3, 4, 5, 6, 7, 8, 9 , 10};
		int max = arr[0];
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("max " + max);
		System.out.println("min " + min);
	}

}
