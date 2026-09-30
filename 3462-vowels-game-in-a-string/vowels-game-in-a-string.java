class Solution {
    public boolean doesAliceWin(String s) {
        if(s.contains("e") || s.contains("a") || s.contains("i") || s.contains("o") || s.contains("u")) return true;
        return false;
    }
}