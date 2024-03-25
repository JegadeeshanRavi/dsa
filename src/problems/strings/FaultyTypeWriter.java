package problems.strings;

public class FaultyTypeWriter {
    //There is a malfunctioning keyboard where some letter keys do not work. All other keys on the keyboard work properly.
    //
    //Given a string text of words separated by a single space (no leading or trailing spaces) and a string brokenLetters of all distinct letter keys that are broken, return the number of words in text you can fully type using this keyboard.
    public static int canBeTypedWords(String text, String brokenLetters) {
        int typedFullyCount = 0;
        String[] data = text.split("\\s+");
        for(String iter : data){
            boolean isFaulty = false;
            for(char s: brokenLetters.toCharArray()){
                if(iter.indexOf(s) != -1){
                    isFaulty = true;
                    break;
                }
            }
            if(!isFaulty){
                typedFullyCount++;
            }
        }
        return typedFullyCount;
    }

    public static void main(String[] args) {
        System.out.println( canBeTypedWords("leet code", "e"));
    }

}
