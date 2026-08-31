class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int x = 0;
        if(nums2.length % 2 != 0){
            for(int i = 0 ; i < nums1.length ; i++){
                x ^= nums1[i];
            }
        }
        if(nums1.length % 2 != 0){
            for(int j = 0 ; j < nums2.length ; j++){
                x ^= nums2[j];
            }
        }
        return x;
    }
}