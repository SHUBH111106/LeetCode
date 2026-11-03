class Solution {
    public int minMoves2(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int mid = nums[(n-1)/2];
        int res = 0;
        for(int x : nums){
            res += Math.abs(mid-x);
        }
        return res;
    }
}