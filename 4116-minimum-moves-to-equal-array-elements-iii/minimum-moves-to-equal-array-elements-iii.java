class Solution {
    public int minMoves(int[] nums) {
        int x = 0;
        for(int i = 0 ; i < nums.length ; i++){
            x = Math.max(x,nums[i]);
        }
        int count = 0;
        for(int a : nums){
            count += (x-a);
        }
        return count;
    }
}