class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0 , len = 0 , j = 0;
        int minLen = Integer.MAX_VALUE;
        for(int i = 0 ; i < nums.length ; i++){
            sum += nums[i];
            while(sum >= target){
                len = i - j + 1;
                minLen = Math.min(minLen , len);
                sum -= nums[j++];
            }
        }
        if(minLen == Integer.MAX_VALUE) return 0;
        return minLen;
    }
}