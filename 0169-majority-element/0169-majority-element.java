class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> a=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            a.put(nums[i],a.getOrDefault(nums[i],0)+1);
        }
        int ans=0;
        for(Integer i: a.values())
        if(i>ans)
          ans=i;
        int r=0;
         for (Integer key : a.keySet()) {
            if (a.get(key) == ans) {
                r = key;
                break;
            }
        }
        System.out.println(r);
        return r;
    }
}