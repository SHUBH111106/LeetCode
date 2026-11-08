class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        //int min = Integer.MAX_VALUE;
        for(int b = 1 ; b <= k ; b++){
            int min = Integer.MAX_VALUE;
            for(int i = 0 ; i < nums.length ; i++){
                min = Math.min(min , nums[i]);
            }
            for(int i = 0 ; i < nums.length ; i++){
                if(nums[i] == min){
                    nums[i] *= multiplier;
                    break;
                }
            }
        }
        return nums;
    }
}