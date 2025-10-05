class Solution {
    public int strStr(String haystack, String needle) {
        // If needle is empty, return 0
        if (needle.length() == 0) return 0;

        int hLen = haystack.length();
        int nLen = needle.length();

        // Loop through haystack to check for needle
        for (int i = 0; i <= hLen - nLen; i++) {
            if (haystack.substring(i, i + nLen).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}
