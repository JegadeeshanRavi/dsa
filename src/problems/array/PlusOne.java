package problems.array;

import java.util.Arrays;

public class PlusOne {
    public static int[] plusOne(int[] digits) {
        for (int i = digits.length -1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        int digits2[] = new int[digits.length + 1];
        digits2[0] = 1;
        return digits2;
    }
    public static void main(String[] args) {
        int[] res = plusOne(new int[]{1, 9, 9});
        System.out.println(Arrays.toString(res));
    }
}
