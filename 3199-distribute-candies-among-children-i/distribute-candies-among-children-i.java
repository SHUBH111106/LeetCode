class Solution {
    public int distributeCandies(int n, int l) {
        int count = 0;
        for(int i = 0 ; i <= l ; i++){
            for(int j = 0 ; j <= l ; j++){
                int k = n - i - j;
                if(k >= 0 && k <= l){
                    count++;
                }
            }
        }
        return count;
    }
}