class Solution {
    public boolean isSubsequence(String s, String t) {
        int st=0,ed=0;
        while(st<s.length() && ed<t.length()){
            if(s.charAt(st) == t.charAt(ed))
            {
                st++;
            }
            ed++;
        }
        if(st==s.length()) 
          return true;
        else
         return false;
    }
}