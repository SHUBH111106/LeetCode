class Solution {
    public boolean checkRecord(String s) {
        int late = 0;
        int absent = 0;
        for(char ch : s.toCharArray()){
            if(ch == 'A'){
                absent++;
                late = 0;
            }
            if(ch == 'L') late++;
            if(ch == 'P') late = 0;
            if(absent >= 2 || late >= 3){
                return false;
            }
        }
        return true;
    }
}