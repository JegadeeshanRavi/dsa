package array;

public class RemoveEvenNumbers {
	public static void main(String[] args) {
		 
		int[] height = new int[] {1,8,6,2,5,4,8,3,7};
		
		int maxContainer = 0;
        for(int i = 0; i < height.length; i++){
             for(int j = 0;j< height.length; j++){
                 if( i !=j ){
                     int newHeight = height[i] * height[j];
                     if(newHeight > maxContainer){
                    	 if(newHeight == 64) {
                    		 
                    		 System.out.println(" Setting " + newHeight);
                    	 }
                         maxContainer = newHeight;
                     }
                 }
             }
        }
		System.out.println("Max " + maxContainer);
		
	}

}
