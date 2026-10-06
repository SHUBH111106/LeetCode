class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for(int j = 0 ; j < k ; j++){
            sum+=nums[j];
        }
        int i = 1 , j = k;
        int maxSum = sum;
        while(j < nums.length){
            sum = sum + nums[j++] - nums[i-1];
            i++;
            maxSum = Math.max(maxSum , sum);
        }
        return (double) maxSum/k;
    }
}