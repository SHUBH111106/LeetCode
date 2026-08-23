class Solution {
    public String reversePrefix(String s, int k) {
        char[] ans = s.toCharArray();
        int lo = 0 ;
        int hi = k-1 ;
        while(hi >= lo){
            char temp = ans[lo];
            ans[lo] = ans[hi];
            ans[hi] = temp;
            hi--;
            lo++;
        }
        return new String(ans);
    }
}