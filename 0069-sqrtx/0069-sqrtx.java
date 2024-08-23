class Solution {
    public int mySqrt(int x) {
        int t;
        long sq=  x;
        while( sq*sq>x){
            sq = (sq+ x/sq)/2;
        }
        return (int)sq;
    }
}