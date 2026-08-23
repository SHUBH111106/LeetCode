class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();
        for(int ele : nums1){
            a.add(ele);
        }
        for(int ele : nums2){
            if(a.contains(ele)){
                b.add(ele);
            }
        }
        int[] ans = new int[b.size()];
        int x = 0; 
        for(int ele : b){
            ans[x++] = ele;
        }
        return ans;
    }
}