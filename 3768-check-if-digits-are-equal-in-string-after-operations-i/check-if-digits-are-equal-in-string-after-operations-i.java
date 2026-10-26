class Solution {
    public boolean hasSameDigits(String s) {
        char[] arr = s.toCharArray();
        for (int x = arr.length; x > 2; x--) {
            for (int i = 0; i < x - 1; i++) {
                int a = arr[i] - '0';
                int b = arr[i + 1] - '0';
                arr[i] = (char)((a + b) % 10 + '0');
            }
        }
        return arr[0] == arr[1];
    }
}