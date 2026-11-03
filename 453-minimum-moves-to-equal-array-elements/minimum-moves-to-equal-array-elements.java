class Solution {
    public int minMoves(int[] nums) {
        int n = nums.length;
        int min = Integer.MAX_VALUE;
        for(int x : nums){
            min = Math.min(min,x);
        }
        int res = 0;
        for(int i : nums){
            res += Math.abs(i-min);
        }
        return res;
    }
}