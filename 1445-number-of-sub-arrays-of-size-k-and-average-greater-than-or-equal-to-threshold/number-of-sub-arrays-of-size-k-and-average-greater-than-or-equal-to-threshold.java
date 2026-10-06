class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int count = 0;
        int n = arr.length;
        int i = 0 , j = k-1 , sum = 0;
        for(int a = i ; a <= j ; a++){
            sum += arr[a];
        }
        if(sum / k >= threshold) count++;
        i++;
        j++;
        while(j < n){
            sum = sum - arr[i-1] + arr[j];
            if(sum / k >= threshold) count++;
            i++; j++;
        }
        return count;
    }
}