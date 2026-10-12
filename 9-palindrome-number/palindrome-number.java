class Solution {
    public boolean isPalindrome(int x) {
        if(x<0||(x%10==0 && x!=0)) return false;
        int Half = 0;
        while(x>Half){
            Half= Half*10 + x%10;
            x/=10;
        }
        return x == Half || x == Half/10;
    }
}