class Solution {
    public int countPartitions(int[] nums) {
        int count = 0;
        int b = 0;
        for(int i = 1 ; i < nums.length ; i++){
            b += nums[i];
        }
        int a = nums[0];
        for(int i = 1 ; i < nums.length ; i++){
            if((a-b) % 2 == 0){
                count++;
            }
            a += nums[i];
            b -= nums[i];
        }
        return count;
    }
}