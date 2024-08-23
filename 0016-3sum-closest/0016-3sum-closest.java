import java.util.Arrays;

class Solution {
    public int threeSumClosest(int[] nums, int target) {
         Arrays.sort(nums);
         int closest = 0;
         int  n = nums.length, minDiff = Integer.MAX_VALUE;

for (int i = 0; i < n - 2; i++)
	for (int j = i + 1, k = n - 1; j < k; ) {
		int sum = nums[i] + nums[j] + nums[k];
		if (sum == target)
			return target;
		if (sum < target)
			j++;
		else
			k--;

		int diff = Math.abs(target - sum);
		if (diff < minDiff) {
			minDiff = diff;
			closest = sum;
		}
	}
return closest; 
    }
}