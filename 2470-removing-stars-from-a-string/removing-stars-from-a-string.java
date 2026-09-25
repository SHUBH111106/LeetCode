class Solution {
    public String removeStars(String s) {
        char[] ans = new char[s.length()];
        int top = 0;
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) != '*'){
                ans[top] = s.charAt(i);
                top++;
            }
            else{
                top--;
            }
        }
        return new String(ans,0,top);
    }
}