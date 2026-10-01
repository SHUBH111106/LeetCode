class Solution {
    public int minLengthAfterRemovals(String s) {
        int c1 = 0;
        int c2 = 0;
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) == 'a') c1++;
            else c2++;
        }
        return Math.abs(c1-c2);
    }
}