class Solution {
    public int integerBreak(int n) {
        if(n<=3) return n-1;
        int mul = 1;
        while(n > 4){
            mul *= 3;
            n -= 3;
        }
        return mul * n;
    }
}