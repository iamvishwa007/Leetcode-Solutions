class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int st=0,ed=numbers.length-1;
        while(numbers[st] + numbers[ed] != target){
            if(numbers[st] + numbers[ed]<target)
              st++;
            else ed--;
        }
        return new int[] {st+1,ed+1};
    }
}