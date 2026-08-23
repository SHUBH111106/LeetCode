class Solution {
    public char repeatedCharacter(String s) {
      int [] freq = new int[26];
      for(int i=0 ; i < s.length() ; i++){
            if(freq[s.charAt(i) - 'a'] == 1){
                return s.charAt(i);
            }else{
                freq[s.charAt(i) - 'a']++;
            }
      } 
      return 'c'; 
    }
}