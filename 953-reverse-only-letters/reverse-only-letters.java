class Solution {
    public String reverseOnlyLetters(String s) {
        char[] str = s.toCharArray();
        int hi = s.length() - 1;
        int lo = 0;
        while(hi >= lo){
            if(str[lo] < 65 || (str[lo] > 90 && str[lo] < 97)){
                lo++;
            }else if(str[hi] < 65 || (str[hi] > 90 && str[hi] < 97)){
                hi--;
            }else{
                char ch = str[lo];
                str[lo] = str[hi];
                str[hi] = ch;
                lo++;
                hi--;
            }
        }
        return new String(str);
    }
}