class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int[] mergedArray = new int[len1 + len2];
        int i = 0, j = 0, k = 0;
        while (i < len1 && j < len2) {
            if (nums1[i] <= nums2[j]) {
                mergedArray[k++] = nums1[i++];
            } else {
                mergedArray[k++] = nums2[j++];
            }
        }
        while (i < len1) {
            mergedArray[k++] = nums1[i++];
        }
        while (j < len2) {
            mergedArray[k++] = nums2[j++];
        }
        int n = len1 + len2;
           
        int middleIndex = n / 2;
        if (n % 2 != 0) {
          
            return mergedArray[middleIndex];
        } else {
           
            double firstMiddle = mergedArray[middleIndex - 1];
            double secondMiddle = mergedArray[middleIndex];
            return (firstMiddle + secondMiddle) / 2.0;
        }
    }
}