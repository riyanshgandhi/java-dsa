class Solution {
    static char nonRepeatingChar(String s) {
        // code here
        int[] charCount = new int[26];
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            charCount[c-'a']++;
        }       
        for(int i=0; i<s.length(); i++){
            char c= s.charAt(i);
           if(charCount[c-'a']==1)
           return c;
        }
        return '$';
    }
}