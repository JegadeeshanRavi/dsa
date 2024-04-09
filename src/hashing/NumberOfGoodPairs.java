package hashing;

import java.util.HashMap;
import java.util.Map;

public class NumberOfGoodPairs {


    //1512. Number of Good Pairs
    public static int numIdenticalPairs(int[] nums) {
        int counter = 0;
        // brute force
        // for (int i = 0; i < nums.length; i++) {
        // for (int j = i + 1; j < nums.length; j++) {
        // if (nums[i] == nums[j]) {
        // counter++;
        // }
        // }
        // }

        Map<Integer, Integer> dataMap = new HashMap<>();
        for (int iter : nums) {
            if (dataMap.containsKey(iter)) {
                counter += dataMap.get(iter);
                dataMap.put(iter, dataMap.get(iter) + 1);
            } else {
                dataMap.put(iter, 1);
            }
        }

        return counter;
    }

    public static void main(String[] args) {
        System.out.println(numIdenticalPairs(new int[] { 1, 2, 3, 1, 1, 3 }));
    }
}
