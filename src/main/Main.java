package main;

public class Main {
	    public static int[] shuffle(int[] nums, int n) {
	        int[] res = new int[nums.length];
	        int startIndex = 1;
	        int indexIncr = 0;
	        for(int i = 0; i < nums.length; i++){
	            if(i >= n){
	                res[startIndex] = nums[i];
	                startIndex = startIndex + 2;
	            }
	            else{
	                res[i + indexIncr] = nums[i];
	                indexIncr++;
	            }
	        }
	        return res;
	    }
	    
	 public static void main(String[] args) {
		int[] shuffle = shuffle(new int[] {1,2,3,4,4,3,2,1 }, 4);
		for (int i = 0; i < shuffle.length; i++) {
			System.out.println(shuffle[i]);
		}
	}
}
