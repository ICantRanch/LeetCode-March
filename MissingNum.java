package LeetCode.March;

public class MissingNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.out.println(missingNumber(new int[] {1,2}));
		
	}

	public static int missingNumber(int[] nums) {
        boolean negZero =false;
        for(int i = 0;i < nums.length;i++){
            if(Math.abs(nums[i]) >= nums.length){continue;}
            System.out.println(nums[i]);
            System.out.println(Math.abs(nums[i]));
            nums[Math.abs(nums[i])] *= -1;
            if(nums[Math.abs(nums[i])] == 0){
                negZero = true;
            }
        }
        if(!negZero){return 0;}
        for(int i = 0;i < nums.length;i++){
            if(nums[i]>0 && nums[i] != 0){
                return i;
            }
            if(nums[i] == 0 && !negZero){
                return i;
            }
        }
        return nums.length;
    }
}
