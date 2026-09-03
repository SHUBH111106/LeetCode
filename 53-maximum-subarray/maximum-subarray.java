class Solution {
    public int maxSubArray(int[] nums) {
        int x = nums[0];
        int sum = 0;
        for(int num : nums){
            sum+= num;
            x = Math.max(x,sum);
            if(sum < 0){
                sum = 0;
            }
        }
        return x;
    }
}