class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int x : nums){
            set.add(x);
        }
        int seq = 0;
        for(int x : set){
            if(!set.contains(x-1)){
                int a = x;
                int count = 1;
                while(set.contains(a+1)){
                    a++;
                    count++;
                }
                seq = Math.max(seq , count);
            }
        }
        return seq;
    }
}