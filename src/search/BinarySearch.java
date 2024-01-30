package search;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14 };
		// System.out.println(getIndex(arr, 12));
		System.out.println(getIndexOwn(arr, 12));
	}

	private static int getIndexOwn(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (arr[mid] == target) {
				return mid;
			} else if (arr[mid] > target) {
				end = mid + 1;
			} else if (arr[mid] < target) {
				start = mid - 1;
			}
		}
		return -1;
	}

	private static int getIndex(int[] arr, int val) {
		int start = 0;
		int end = arr.length - 1;
		int counter = 0;
		while (start <= end) {
			System.out.println("Counter" + counter++);
			int mid = (start + end) / 2;
			if (arr[mid] == val)
				return mid;
			else if (arr[mid] < val) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return -1;
	}
}
