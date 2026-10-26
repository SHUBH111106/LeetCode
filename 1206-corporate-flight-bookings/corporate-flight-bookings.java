class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] ans = new int[n];
        for(int i = 0 ; i < bookings.length ; i++){
            int a = bookings[i][0];
            int b = bookings[i][1];
            for(int j = a-1 ; j < b ; j++){
                ans[j] += bookings[i][2];
            }
        }
        return ans;
    }
}