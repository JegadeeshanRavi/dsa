package Array;

public class MoveZeroToEnd {

	public static int[] moveZeroToEnd(int[] arr) {
		int zeroFindingIndex = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0 && arr[zeroFindingIndex] == 0) {
				int temp = arr[i];
				arr[i] = arr[zeroFindingIndex];
				arr[zeroFindingIndex] = temp;
			}
			if (arr[zeroFindingIndex] != 0) {
				zeroFindingIndex++;
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 0, 3, 0, 5, 0, 7, 0, 9, 0 };
		 int[] moveZeroToEnd = moveZeroToEnd(arr);
		for (int i = 0; i < moveZeroToEnd.length; i++) {
			System.out.print(arr[i] + " ");
		}

//		int[] moveZeroToEnd = moveToEndSecond(arr);
//		for (int i = 0; i < moveZeroToEnd.length; i++) {
//			System.out.print(arr[i] + " ");
//		}
	}

	private static int[] moveToEndSecond(int[] arr) {
		int zeroPointer = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] != 0 && arr[zeroPointer] == 0) {
				int temp = arr[zeroPointer];
				arr[zeroPointer] = arr[i];
				arr[i] = temp;
			}
			if(arr[zeroPointer] != 0) {
				zeroPointer++;
			}
		}
		return arr;
	}

}
