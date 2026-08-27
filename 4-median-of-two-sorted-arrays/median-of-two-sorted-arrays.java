class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int o = m+n;
        int k = 0;
        double ans = 0;
        int[] res = new int[m+n];
        for(int ele : nums1){
            res[k++] = ele ;
        }
        for(int ele : nums2){
            res[k++] = ele ;
        }
        Arrays.sort(res);
        if((m+n)%2==0) ans = (res[o/2]+res[(o/2)-1])/2.0;
        else ans = res[o/2];
        return ans;
    }
}