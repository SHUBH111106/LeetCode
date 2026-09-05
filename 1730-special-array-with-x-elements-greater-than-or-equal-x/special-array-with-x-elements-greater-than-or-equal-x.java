class Solution {
    public int specialArray(int[] nums) {

        int n = nums.length;

        Arrays.sort(nums);

        for (int i = 1; i <= n; i++) {

            int lo = 0;
            int hi = n - 1;

            while (lo <= hi) {

                int mid = lo + (hi - lo) / 2;

                if (nums[mid] >= i) {
                    hi = mid - 1;
                } else {
                    lo = mid + 1;
                }
            }

            int count = n - lo;

            if (count == i) {
                return count;
            }
        }

        return -1;
    }
}