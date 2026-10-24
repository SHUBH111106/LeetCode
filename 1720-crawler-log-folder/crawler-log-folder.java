class Solution {
    public int minOperations(String[] logs) {
        int count = 0;
        for(int i = 0 ; i < logs.length ; i++){
            String s = logs[i];
            if(s.equals("./")) continue;
            else if(s.equals("../")){
                if(count > 0) count--;
            }
            else count++;
        }
        return count;
    }
}