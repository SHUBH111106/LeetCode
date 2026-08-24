class Solution {
    public String reverseWords(String s) {
        String[] str = s.split(" ");
        for(int i = 0 ; i < str.length ; i++){
            char[] ch = str[i].toCharArray();
            int hi = str[i].length()-1;
            int lo = 0;
            while(hi >= lo){
            char temp = ch[lo];
            ch[lo] = ch[hi];
            ch[hi] = temp;
            lo++;
            hi--;
            }
            str[i] = new String(ch);
        }
        return String.join(" ",str);
    }
}