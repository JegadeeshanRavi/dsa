package hashing;

import java.util.HashSet;
import java.util.Set;

//2744. Find Maximum Number of String Pairs
public class MaxStringPair {

    public int maximumNumberOfStringPairs(String[] words) {
        Set<String> data = new HashSet<>();
        int counter = 0;
        for(String iter: words){
            StringBuilder sb = new StringBuilder(iter).reverse();
            if(data.contains(sb.toString())){
                counter++;
            }else{
                data.add(iter);
            }
        }
        return counter;
    }
}
