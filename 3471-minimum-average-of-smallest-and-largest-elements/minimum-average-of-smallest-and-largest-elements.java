class Solution {
    public double minimumAverage(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        double ans = Double.MAX_VALUE;
        for(int i = 0 ; i < n/2 ; i++){
            double avg = (nums[i] + nums[n-i-1]) / 2.0;
            ans = Math.min(ans,avg);
        }
        return ans;
    }
}