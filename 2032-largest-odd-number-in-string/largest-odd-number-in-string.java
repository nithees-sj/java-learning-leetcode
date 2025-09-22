class Solution {
    public String largestOddNumber(String num) {
        for (int i = num.length() - 1; i >= 0; i--) {
            int d = num.charAt(i) - '0';
            if ((d & 1) == 1) { // digit is odd
                return num.substring(0, i + 1);
            }
        }
        return "";
    }
}