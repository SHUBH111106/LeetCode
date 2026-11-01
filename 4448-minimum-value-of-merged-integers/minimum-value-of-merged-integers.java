class Solution {
    public int minMergedInteger(int[] nums) {
        int min = Integer.MAX_VALUE;
        for(int i = 0 ; i < nums.length - 1 ; i+=2){
            int a = Integer.parseInt(""+nums[i] + nums[i+1]);
            min = Math.min(a,min);
        }
        return min;
    }
}