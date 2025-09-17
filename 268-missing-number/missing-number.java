import java.util.Arrays;
class Solution {
    public int missingNumber(int[] nums) {
        int a=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i!=nums[i]){
                return i;
            }
        }
        return nums.length;
    }
}