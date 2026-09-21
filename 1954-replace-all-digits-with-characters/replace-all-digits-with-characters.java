class Solution {
    public String replaceDigits(String s) {
        char[] str = s.toCharArray();
        for(int i = 1; i < s.length() ; i+=2){
            int digit = str[i] - '0';
            str[i] = (char)(str[i-1] + digit);
        }
        return new String(str);
    }
}