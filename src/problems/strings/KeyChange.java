package problems.strings;

public class KeyChange {
    //You are given a 0-indexed string s typed by a user. Changing a key is defined as using a key different from the last used key. For example, s = "ab" has a change of a key while s = "bBBb" does not have any.
//
//Return the number of times the user had to change the key.
//
//Note: Modifiers like shift or caps lock won't be counted in changing the key that is if a user typed the letter 'a' and then the letter 'A' then it will not be considered as a changing of key.
//
//
//
//Example 1:
//
//Input: s = "aAbBcC"
//Output: 2
    public int countKeyChanges(String s) {
        char start = s.charAt(0);
        int change = 0;
        for(int i = 1; i < s.length(); i++){
            if(Character.toLowerCase(start) != Character.toLowerCase(s.charAt(i))){
                change++;
                start = s.charAt(i);
            }
        }
        return change;
    }
}
