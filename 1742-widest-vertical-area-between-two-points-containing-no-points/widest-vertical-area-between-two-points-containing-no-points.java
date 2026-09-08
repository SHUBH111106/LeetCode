class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int n = points.length;
        int[] ans = new int[n];
        for(int i = 0 ; i < n ; i++){
            ans[i] = points[i][0];
        }
        Arrays.sort(ans);
        int x = 0;
        for(int i = 1 ; i < n ; i++){
            x = Math.max(x, ans[i] - ans[i-1]);
        }
        return x;
    }
}