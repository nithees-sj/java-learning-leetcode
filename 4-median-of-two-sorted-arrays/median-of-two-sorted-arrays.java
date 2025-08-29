import java.util.Arrays;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l1 = nums1.length;
        int l2 = nums2.length;
        int[] arr = new int[l1 + l2];
        
        for(int i = 0; i < l1; i++) {
            arr[i] = nums1[i];
        }
        for(int i = 0; i < l2; i++) {
            arr[l1 + i] = nums2[i];
        }
        
        Arrays.sort(arr); 
        
        int n = arr.length;
        int mid = n / 2;
        
        if (n % 2 == 0) {
            return (arr[mid - 1] + arr[mid]) / 2.0;
        } else {
            return arr[mid];
        }
    }
}
