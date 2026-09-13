class Solution {
    public boolean judgeCircle(String m) {
        int x = 0;
        int y = 0;
        for(int i = 0 ; i < m.length() ; i++){
            char ch = m.charAt(i);
            if(ch == 'U') x++;
            if(ch == 'L') y--;
            if(ch == 'D') x--;
            if(ch == 'R') y++;
        }
        return (x == 0 && y == 0);
    }
}