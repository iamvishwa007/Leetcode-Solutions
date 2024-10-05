class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n=arr.length;
        Set <Integer> set = new LinkedHashSet<>();
         for (int num : arr) {
            set.add(num);
        }
        List<Integer> list=new ArrayList<>(set);
        Collections.sort(list);
        Map<Integer,Integer> map=new LinkedHashMap<>();
        int rank=1;
        for(Integer a:list){
            map.put(a,rank++);
        }
        int ans[]=new int[n];
        for(int i=0;i<n;i++){
            ans[i]=map.get(arr[i]);
        }
    
        return ans;
    }
}