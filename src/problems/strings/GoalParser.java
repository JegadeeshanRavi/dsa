package problems.strings;

public class GoalParser {
    public static String interpret(String command) {
        String res = "";
        char[] input = command.toCharArray();
        int left = 0;
        while(left < input.length){
            if(input[left] == 'G'){
                left++;
                res = res.concat("G");
            }else if(input[left] == '('){
                left++;
                if(left < input.length){
                    if( input[left] == ')'){
                        left = left + 1;
                        res = res.concat("o");
                    }else{
                        left = left + 3;
                        res = res.concat("al");
                    }
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println(interpret("G()()()()(al)"));
    }

}
