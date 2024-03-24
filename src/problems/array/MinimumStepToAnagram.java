package problems.array;

import java.util.HashMap;

public class MinimumStepToAnagram {

    public static int minSteps(String s, String t) {
        int minSteps = 0;
        HashMap<Character, Integer> data = new HashMap<>();
        for(char c: s.toCharArray()){
            if(data.containsKey(c)){
                data.put(c, data.get(c) + 1);
            }else{
                data.put(c , 1);
            }
        }
        for(char c: t.toCharArray()){
            if(data.containsKey(c) &&  data.get(c) != 0){
                int counter = data.get(c) - 1;
                data.put(c , counter);
            }else{
                minSteps++;
            }
        }
        return minSteps;
    }

    //Alternative efficient approach
    public static int minSteps2(String s, String t) {
        if (s.length() != t.length())
            return -1; // Strings are of different lengths

        int[] count = new int[26]; // Frequency array for lowercase alphabets

        // Calculate frequency of characters in t
        for (char ch : t.toCharArray()) {
            count[ch - 'a']++;
        }

        // Subtract frequency of characters in s
        for (char ch : s.toCharArray()) {
            count[ch - 'a']--;
        }

        // Count remaining characters in count array
        int steps = 0;
        for (int i = 0; i < 26; i++) {
            if (count[i] > 0) {
                steps += count[i];
            }
        }

        return steps;
    }


    public static void main(String[] args) {
        System.out.println(minSteps("leetcode", "practice"));
    }

}
