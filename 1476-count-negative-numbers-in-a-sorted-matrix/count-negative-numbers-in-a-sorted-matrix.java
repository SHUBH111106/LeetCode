class Solution {
    public int countNegatives(int[][] grid) {
        int count = 0 ;
        for(int i = 0 ; i < grid.length ; i++){
            int hi = grid[0].length-1;
            int lo = 0;
            while(hi >= lo){
                int mid = (hi+lo)/2;
                if(grid[i][mid] < 0){
                    hi = mid-1;
                }else{
                    lo = mid+1;
                }
            }
            count += grid[0].length - lo;
        }
        return count;
    }
}