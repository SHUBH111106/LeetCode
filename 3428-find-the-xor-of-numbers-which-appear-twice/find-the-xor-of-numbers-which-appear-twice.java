class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        int[] freq = new int[51];
        //int[] a = new int[51];
        for(int x : nums){
            freq[x]++;
        }
        int xor = 0;
        for(int i = 0 ; i < 51 ; i++){
            if(freq[i] > 1){
                xor ^= i;
            }
        }
        return xor;
    }
}