class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int count = 0;
        int sum = 0;
        int n = arr.length;
        for(int x : arr){
            sum+= x;
        }
        if(sum % 3 != 0) return false;
        int currentsum = 0;
        for(int i = 0 ; i < n ; i++){
            currentsum += arr[i];
            if(currentsum == sum / 3){
                currentsum = 0;
                count++;
            }
        }
        return count >= 3;
    }
}