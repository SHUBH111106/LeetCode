class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> ans = new ArrayList<>();
        int lo = 0;
        int hi = nums.length-1;
        int x = -1;
        while(hi >= lo){
            int mid = (hi+lo)/2;
            if(nums[mid] == target){
                x = mid;
                hi = mid-1;
            }
            else if(nums[mid]>target) hi=mid-1;
            else lo=mid+1;
        }
        if(x==-1) return ans;
        for(int i=x;i<nums.length;i++){
            if(nums[i]!=target) break;
            ans.add(i);
        }
        return ans;
    }
}