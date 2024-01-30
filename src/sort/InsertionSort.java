package sort;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = {  2, 3,  9, 10, 99, 12,111, 14 };
		insertionSort(arr);
	}

	private static void insertionSort(int[] arr) {

		for (int i = 1; i < arr.length; i++) {
			int check = i - 1;
			int currentValue = arr[i];
			while(check >= 0 && arr[check] > currentValue){
				arr[check + 1] = arr[check];
				check --;
			}
			arr[check + 1] = currentValue;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}
	}

}
