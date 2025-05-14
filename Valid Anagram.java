class Solution {
    public boolean isAnagram(String s, String t) {
      char[] sr= s.toCharArray();
      char[] tr= t.toCharArray();

      if(sr.length!=tr.length){
      return false;}
              
              Arrays.sort(sr);
              Arrays.sort(tr);
             
                return Arrays.equals(sr, tr);
              }

    }