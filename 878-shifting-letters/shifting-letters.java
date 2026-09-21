class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        char[] str = s.toCharArray();
        int sum = 0;
        for (int i = shifts.length - 1; i >= 0; i--) {
            sum = (sum + shifts[i]) % 26;
            str[i] = (char) ('a' + (str[i] - 'a' + sum) % 26);
        }
        return new String(str);
    }
}