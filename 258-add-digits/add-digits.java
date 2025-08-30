class Solution {
    public int addDigits(int num) {
        int count=String.valueOf(num).length();
        int temp = num;
        if(temp%9==0){
            if(temp==0){
                return 0;
            }
            return 9;
        }      
        else{
            return temp%9;
        }
    }
}