class Solution {
    public String reverseStr(String s, int k) {
        char [] ch = s.toCharArray();
        for(int i = 0 ; i < s.length() ; i+= 2*k){
            int lo = i;
            int hi = Math.min(i+k-1 , ch.length-1);
            while(hi >= lo){
                char temp = ch[lo];
                ch[lo] = ch[hi];
                ch[hi] = temp;
                lo++;
                hi--;
            }
        }
        return new String(ch);
    }
}