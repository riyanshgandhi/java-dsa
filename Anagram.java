import java.util.Arrays;

class Solution {
    public static boolean areAnagrams(String s1, String s2) {
 
             char[] x=s1.toCharArray();
             char[] y=s2.toCharArray();
             
             if(x.length!=y.length){
                 return false;
             }
                 Arrays.sort(x);
                 Arrays.sort(y);
                 return Arrays.equals(x, y);
    }
}