class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int lo = i + 1;
            int hi = n - i;

            int total = lo * hi;
            int odd = (total + 1) / 2;

            sum += arr[i] * odd;
        }

        return sum;
    }
}