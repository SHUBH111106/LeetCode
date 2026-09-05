class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int e) {
        int max = 0;
        for(int x : candies){
            max = Math.max(x,max);
        }
        List<Boolean> list = new ArrayList<>();
        for(int x : candies){
            list.add(x+e >= max);
        }
        return list; 
    }
}