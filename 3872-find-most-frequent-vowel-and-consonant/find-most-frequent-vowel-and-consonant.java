class Solution {
    public int maxFreqSum(String s) {
        int n = s.length();
        int[] freq = new int[26];
        for(char ch : s.toCharArray()){
            freq[ch - 'a']++;
        }
        int v = 0 , c = 0;
        for(int i = 0 ; i < 26 ; i++){
            char ch = (char) ('a' + i);
            if ("aeiou".indexOf(ch) != -1) v = Math.max(v, freq[i]);
            else c = Math.max(c, freq[i]);
        }
        return v + c;
    }
}