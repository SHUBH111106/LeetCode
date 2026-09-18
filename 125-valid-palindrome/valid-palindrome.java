class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < s.length() ; i++){
            if ((s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') || (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') ||
    (s.charAt(i) >= '0' && s.charAt(i) <= '9')){
                sb.append(s.charAt(i));
            }
        }
        String result = sb.toString().toLowerCase();
        int lo = 0;
        int hi = result.length() - 1;
        while(hi >= lo){
            if(result.charAt(hi) != result.charAt(lo)) return false;
            else{
                hi--;
                lo++;
            }
        }
        return true;

    }
}