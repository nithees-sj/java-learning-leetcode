class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return false;

        int m = matrix.length;
        int n = matrix[0].length;
        int left = 0;
        int right = m * n - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Convert mid into 2D indices
            int row = mid / n;
            int col = mid % n;
            int midValue = matrix[row][col];

            if (midValue == target) {
                return true;
            } 
            else if (midValue < target) {
                left = mid + 1;  // search right half
            } 
            else { // midValue > target
                right = mid - 1; // search left half
            }
        }

        return false; // not found
        
    }
}