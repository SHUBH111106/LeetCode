class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        int count = 0 ;
        String[] s = text.split(" ") ;
        for (int i = 0 ; i < s.length ; i++) {
            boolean notbroke = true ;
            for (int j = 0 ; j < brokenLetters.length() ; j++) {
                char ch = brokenLetters.charAt(j) ;
                if (s[i].indexOf(ch) != -1) {
                    notbroke = false ;
                    break ;
                }
            }
            if (notbroke){
                count++ ;
            }
        }
        return count ;
    }
}