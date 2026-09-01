class Solution {
    public int minimumSum(int n) {
        int[] ans = new int[4];
        int i = 0;
        while(n > 0){
            ans[i++] = n%10;
            n/=10;
        }
        Arrays.sort(ans);
        return ((((ans[0] * 10) + ans[2])) + (ans[1] * 10 )+ ans[3]);
    }
}