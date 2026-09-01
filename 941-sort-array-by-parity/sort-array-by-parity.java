class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int hi = nums.length - 1 ;
        int lo = 0;
        while(hi >= lo){
            if(nums[hi] % 2 == 0 && nums[lo] % 2 == 1){
                int temp = nums[lo];
                nums[lo] = nums[hi];
                nums[hi] = temp;
            }
            else if(nums[lo] % 2 == 0) lo++;
            else hi--;
        }
        return nums;
    }
}