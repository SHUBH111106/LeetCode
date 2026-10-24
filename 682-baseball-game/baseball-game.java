class Solution {
    public int calPoints(String[] s) {
        int n = s.length;
        int[] ans = new int[n];
        int length = 0;
        for(int i = 0 ; i < n ; i++){
            String a = s[i];
            if(a.equals("C")) length--;
            else if(a.equals("D")){
                ans[length] = ans[length-1]*2;
                length++;
            }
            else if(a.equals("+")){
                ans[length] = ans[length-1] + ans[length-2];
                length++;
            }
            else{
                ans[length] = Integer.parseInt(a);
                length++;
            }
        }
        int sum = 0;
        for(int i = 0 ; i < length ; i++){
            sum += ans[i];
        }
        return sum;
    }
}