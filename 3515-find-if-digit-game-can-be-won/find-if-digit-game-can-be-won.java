class Solution {
    public boolean canAliceWin(int[] nums) {
        int sum=0;
        int d=0;
        for(int i:nums){
            if(i<10){
                d+=i;
            }
            else{
                sum+=i;
            }
        }
        return sum!=d;
    }
}