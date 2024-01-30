package sort;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = { 12, 3, 4, 5, 6, 10, 11, 12, 11, 14 };
		int[] bubbleSort = bubbleSort(arr);
		for (int i = 0; i < bubbleSort.length; i++) {
			System.out.print(" " + bubbleSort[i]);
		}
	}

	private static int[] bubbleSort(int[] arr) {
		int iteration = 0;
		int n = arr.length;

		for (int i = 0; i < n - 1; i++) {
			boolean isSwapped = false;
			for (int j = 0; j < n - i - 1; j++) {
				iteration++;
				if (arr[j] > arr[j + 1]) {
					// Swap arr[j] and arr[j+1]
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					isSwapped = true;
				}
			}
			if(!isSwapped){
				break;
			}
		}
		System.out.println(iteration);
		return arr;
	}

}
