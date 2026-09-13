class Solution {
    public String[] findWords(String[] words) {
        String r1 = "qwertyuiop";
        String r2 = "asdfghjkl";
        String r3 = "zxcvbnm";
        ArrayList<String> s = new ArrayList<>();
        for(String w : words){
            String lower = w.toLowerCase();
            String ans;
            if(r1.indexOf(lower.charAt(0)) != -1){
                ans = r1;
            }
            else if(r2.indexOf(lower.charAt(0)) != -1){
                ans = r2;
            }
            else{
                ans = r3;
            }
            boolean valid = true;
            for (char ch : lower.toCharArray()) {
                if (ans.indexOf(ch) == -1) {
                    valid = false;
                    break;
                }
            }

            if (valid) {
                s.add(w);
            }
        }
        return s.toArray(new String[0]);
    }
}