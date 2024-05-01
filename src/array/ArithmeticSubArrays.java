package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArithmeticSubArrays {

    public static List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> res = new ArrayList<>();

        for (int i = 0; i < l.length; i++) {
            int diff = 0;
            boolean isFirst = false;
            boolean isArithmetic = false;
            int[] subArray = Arrays.copyOfRange(nums, l[i], r[i] + 1);
            Arrays.sort(subArray);
            int startVal = subArray[0];
            for (int j =  1; j < subArray.length; j++) {
                if (!isFirst) {
                    diff = subArray[j] - subArray[j - 1];
                    isFirst = true;
                } else {
                    if (diff != subArray[j] - subArray[j - 1]) {
                        isArithmetic = true;
                        break;
                    }
                }
            }
            res.add(isArithmetic ? false : true);
        }
        return res;
    }

    public static void main(String[] args) {
        List<Boolean> booleans = checkArithmeticSubarrays(new int[]{4, 6, 5, 9, 3, 7}, new int[]{0, 0, 2}, new int[]{2, 3, 5});
        System.out.println(booleans);
    }

}
