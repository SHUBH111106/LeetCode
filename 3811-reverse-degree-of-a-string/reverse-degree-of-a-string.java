class Solution {
    public int reverseDegree(String s) {
        int sum = 0;
        for(int i = 0 ; i < s.length() ; i++){
            int ind = Math.abs(s.charAt(i) - 'a' - 26);
            sum += ind * (i+1);
        }
        return sum;
    }
}