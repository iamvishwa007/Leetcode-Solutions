class Solution {
    public String convert(String s, int numRows) {
       if(numRows==1 || s.length()<numRows){
            return s;
        }
        StringBuilder solution = new StringBuilder();
        int distance = (numRows-1)*2;
        for(int x=0;x<numRows;x++){
            int incr = 2*x;
            for(int y=x;y<s.length();y+=incr){
                solution.append(s.charAt(y));
                incr = distance-incr;
                incr = (incr==0) ? distance : incr;
            }
        }
        return solution.toString();  
    }
}