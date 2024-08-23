class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans=new ArrayList<>();
        for(int i=0;i<candies.length;i++){
            int sum=candies[i]+extraCandies;
            if(checkGreater(sum,candies)){
                ans.add(true);
            }else{
                ans.add(false);
            }
        }
        return ans;
    }
    public static boolean checkGreater(int sum,int []candies){
        for(int i=0;i<candies.length;i++){
            if(sum<candies[i]) 
              return false;
        }
        return true;
    }
}