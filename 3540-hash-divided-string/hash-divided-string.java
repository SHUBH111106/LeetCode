class Solution {
    public String stringHash(String s, int k) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < s.length() ; i+=k){
            int x = k;
            int a = i;
            int sum = 0;
            while(x > 0){
                sum += s.charAt(a) - 'a';
                a++;
                x--; 
            }
            sb.append((char)('a' + sum % 26));
        }
        return sb.toString();
    }
}