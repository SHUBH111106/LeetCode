class Solution {
    public boolean threeFibonacciSum(int n) {
        if (n % 2 != 0) return false;

        int x = n / 2;

        int a = 0, b = 1;

        while (b < x) {
            int c = a + b;
            a = b;
            b = c;
        }

        return b == x || a == x;
    }
}