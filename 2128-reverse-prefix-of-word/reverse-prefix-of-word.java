class Solution {
    public String reversePrefix(String word, char ch) {
        int count = 0;
        for(int i = 0 ; i < word.length() ; i++){
            if(word.charAt(i) == ch){
                count = i;
                break;
            }
        }
        char[] ans = word.toCharArray();
        int lo = 0 ;
        int hi = count;
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