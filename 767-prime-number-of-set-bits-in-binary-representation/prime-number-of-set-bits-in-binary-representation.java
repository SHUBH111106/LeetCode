class Solution {
    public int countPrimeSetBits(int left, int right) {
        int count = 0;
        for(int i = left ; i<= right ; i++){
            int bit = Integer.bitCount(i);
            // boolean flag = true;
            // if(bits < 2) flag = false;
            // for(int j = 2 ; j < bits ; j++){
            //     if(bits % j == 0) flag = false;
            //     break;
            // }
            // if(flag) count++;
            if(bit == 2 || bit == 3 || bit == 5 || bit == 7 || bit == 11 || bit == 13 || bit == 17 || bit == 19) count++;
        }
        return count;
    }
}