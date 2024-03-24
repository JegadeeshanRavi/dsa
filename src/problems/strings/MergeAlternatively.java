package problems.strings;

public class MergeAlternatively {

    public static String mergeAlternately(String word1, String word2) {
            int length1= word1.length();
            int length2= word2.length();
            int interLen = Math.min(length1, length2);
            boolean switcher = false;
            StringBuilder res = new StringBuilder();
            for(int i = 0; i < interLen ; i++){
                if(!switcher){
                    res.append(word1.charAt(i));
                    i = i - 1;
                }else{
                    res.append(word2.charAt(i));
                }
                switcher = !switcher;
            }
            if(length1 != length2){
                if(length1 > length2){
                    res.append(word1.substring(length2));
                }else{
                    res.append(word2.substring(length1));
                }
            }
            return res.toString();
    }

    public static void main(String[] args) {
        System.out.println( mergeAlternately("ab", "pqrs"));
    }
}
