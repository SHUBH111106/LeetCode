class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;
        int count = 0;
        for(int i = 2 ; i < n ; i++){
            if(nums[i-2] == 0){
                nums[i-2] = 1;
                nums[i - 1] = 1 - nums[i - 1];
                nums[i] = 1 - nums[i];
                count++;
            }
        }
        boolean flag = true;
        for(int i = 0 ; i < n ; i++){
            if(nums[i] == 0) flag = false;
        }
        if(flag == false) return -1;
        else return count;
    }
}