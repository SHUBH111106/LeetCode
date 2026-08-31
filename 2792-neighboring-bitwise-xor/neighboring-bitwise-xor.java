class Solution {
    public boolean doesValidArrayExist(int[] d) {
        int x = d[0];
        for(int i = 1 ; i < d.length ; i++){
            x ^= d[i];
        }
        return (x == 0);
    }
}