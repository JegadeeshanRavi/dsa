package problems.strings;

import java.util.List;

//1773. Count Items Matching a Rule
public class ItemMatchingRule {

    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int counter = 0;
        for (List<String> data : items) {
            if (ruleKey.equals("type") && ruleValue.equals(data.get(0))) {
                counter++;
            } else if (ruleKey.equals("color") && ruleValue.equals(data.get(1))) {
                counter++;
            } else if (ruleKey.equals("name") && ruleValue.equals(data.get(2))) {
                counter++;
            }
        }
        return counter;
    }
}
