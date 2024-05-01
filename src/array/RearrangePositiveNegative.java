package array;

public class RearrangePositiveNegative {
//2149. Rearrange Array Elements by Sign
    public int[] rearrangeArray(int[] nums) {
        int[] res = new int[nums.length];
        int currentPostiveIndex = 0;
        int currentNegativeIndex = 1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0){
                res[currentPostiveIndex] = nums[i];
                currentPostiveIndex = currentPostiveIndex + 2;;
            }else{
                res[currentNegativeIndex] = nums[i];
                currentNegativeIndex = currentNegativeIndex + 2;
            }
        }
        return res;
    }
}
