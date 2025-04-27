class Solution {
    public String addBinary(String s1, String s2) {
        // code here
        StringBuilder result= new StringBuilder();
        int carry=0;
        
        int i=s1.length()-1;
        int j=s2.length()-1;
        
        while(i>=0 || j>=0 || carry>0){
               int digit1=(i>=0)? s1.charAt(i--)-'0':0;
               int digit2=(j>=0)? s2.charAt(j--)-'0':0;
                int sum = digit1 + digit2 +carry;
                
                result.append(sum%2);
                carry=sum/2;
                
        }
        String finalResult= result.reverse().toString();
        
        int startindex=0;
        while(startindex <finalResult.length()-1 && finalResult.charAt(startindex)=='0'){
            startindex++;
        }
        finalResult= finalResult.substring(startindex);
        return finalResult;
    }
}