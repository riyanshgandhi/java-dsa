
class Solution {
    public int myAtoi(String s) {
        // Your code here
        if(s==null || s.length()==0){
        return 0;}
        
        int index=0;
        int sign =1;
        int result=0;
        
        
        while(index<s.length() && s.charAt(index)==' '){
            index ++;
            
        }
        if(index<s.length() && s.charAt(index)=='+' || s.charAt(index)=='-'){
            sign= (s.charAt(index)=='-')? -1:1;
            index++;
            
            
        }
        while(index<s.length()){
            char curr=s.charAt(index);
            if(curr<'0' || curr>'9'){
                break;
            }
            int digit= curr -'0';
            if(result>Integer.MAX_VALUE/10 || (result==Integer.MAX_VALUE && digit> Integer.MAX_VALUE%10)){
                return sign==1 ? Integer.MAX_VALUE:Integer.MIN_VALUE;
            }
            result=result*10 + digit;
            index++;
        }
        return result*sign;
    }
}