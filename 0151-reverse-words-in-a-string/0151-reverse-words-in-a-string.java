class Solution {
    public String reverseWords(String s) {
        s=s.trim();
       String ss[]=s.split("\\s+");
       String ans="";
       int n=ss.length;
       for(int i=n-1;i>=0;i--){
        ans+=ss[i];
         if (i > 0) { 
                ans+=" ";
            }
       }
return ans;

    }
}