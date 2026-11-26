class Solution {
    public boolean canAliceWin(int n) {
        boolean aliceTurn = true;
        int startRemoval = 10;
        while (n >= startRemoval) {
            n -= (startRemoval--);
            if (aliceTurn) aliceTurn = false;
            else aliceTurn = true;
        }
        return !aliceTurn;
    }
}