class Solution {
    public String reverseWords(String s) {
        String[] str = s.trim().split("\\s+");
        int lo = 0;
        int hi = str.length-1;
        while(hi >= lo){
            String str2 = str[lo];
            str[lo] = str[hi];
            str[hi] = str2;
            lo++;
            hi--;
        }
        return String.join(" ",str);
    }
}