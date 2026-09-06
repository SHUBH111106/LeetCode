class Solution {
    public int romanToInt(String s) {
        int ans = 0;
        int n = s.length();
        for(int i = 0 ; i < n ; i++){
            int count = 0;
            int next = 0;
            if(s.charAt(i) == 'I') count = 1;
            if(s.charAt(i) == 'V') count = 5;
            if(s.charAt(i) == 'X') count = 10;
            if(s.charAt(i) == 'L') count = 50;
            if(s.charAt(i) == 'C') count = 100;
            if(s.charAt(i) == 'D') count = 500;
            if(s.charAt(i) == 'M') count = 1000;
            if(i+1 < n){
                if(s.charAt(i+1) == 'I') next = 1;
                if(s.charAt(i+1) == 'V') next = 5;
                if(s.charAt(i+1) == 'X') next = 10;
                if(s.charAt(i+1) == 'L') next = 50;
                if(s.charAt(i+1) == 'C') next = 100;
                if(s.charAt(i+1) == 'D') next = 500;
                if(s.charAt(i+1) == 'M') next = 1000;
            }
            if(count < next){
                ans -= count;
            }
            else{
                ans += count;
            }
        }
        return ans;
    }
}