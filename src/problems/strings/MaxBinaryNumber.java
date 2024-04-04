package problems.strings;

public class MaxBinaryNumber {
    //2864. Maximum Odd Binary Number
    public String maximumOddBinaryNumber(String s) {
        int oneCounter = 0, zeroCounter = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                oneCounter++;
            }
        }
        zeroCounter = s.length() - oneCounter;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < oneCounter - 1; i++) {
            sb.append("1");
        }
        for (int i = 0; i < zeroCounter; i++) {
            sb.append("0");
        }
        sb.append("1");
        return sb.toString();
    }
}
