class Solution {
    public List<Integer> addToArrayForm(int[] nums, int k) {

        List<Integer> ans = new ArrayList<>();

        int i = nums.length - 1;

        while(i >= 0 || k > 0) {

            if(i >= 0) {
                k += nums[i];
                nums[i] = k % 10;
                k /= 10;
                i--;
            } else {
                ans.add(0, k % 10);
                k /= 10;
            }
        }

        for(int j = 0; j < nums.length; j++) {
            ans.add(nums[j]);
        }

        return ans;
    }
}