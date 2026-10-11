class Solution {
    public int sumOfSquares(int[] nums) {
        int sum = 0 ;
        int x = 1;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums.length % x == 0){
                sum += nums[i] * nums[i];
            }
            x++;
        }
        return sum;
    }
}