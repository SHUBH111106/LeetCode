class Solution {
    public int maxScore(String s) {
        int  maxOne = 0;
        for (char c : s.toCharArray()) {
            if (c == '1') maxOne++;
        }
        int maxZero = 0;
        int total = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == '0') {
                maxZero++;
            } else {
                maxOne--;
            }
            total = Math.max(total, maxZero + maxOne);
        }
        return total;
    }
}