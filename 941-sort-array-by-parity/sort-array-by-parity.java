class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int lo = 0;
        int hi = nums.length - 1;
        while(hi >= lo){
            // if(nums[hi] % 2 == 1) hi--;
            if(nums[lo] % 2 != 0 && nums[hi] % 2 == 0){
                int temp = nums[lo];
                nums[lo] = nums[hi];
                nums[hi] = temp;
                lo++;
                hi--;
            }
            else if(nums[lo] % 2 == 0) lo++;
            //lo++;
            else hi--;
        }
        return nums;
    }
}