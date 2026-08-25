class Solution {
    public String reverseVowels(String s) {
        char[] ch = s.toCharArray();
        int lo = 0;
        int hi = ch.length-1;
        while(hi >= lo){
            while (lo < hi && !p(ch[lo])) {
                lo++;
            }

            while (lo < hi && !p(ch[hi])) {
                hi--;
            }
            char temp = ch[lo];
            ch[lo] = ch[hi];
            ch[hi] = temp;
            lo++;
            hi--;
        }
        return new String(ch);
    }

    private boolean p(char c){
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
        || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
     }    
}
