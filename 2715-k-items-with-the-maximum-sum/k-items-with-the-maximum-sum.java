class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        int sum = 0;
        int ones = Math.min(k, numOnes);
        sum += ones;
        k -= ones;

        int zeros = Math.min(k, numZeros);
        // zeros add 0 to sum
        k -= zeros;

        int negs = Math.min(k, numNegOnes);
        sum -= negs;

        return sum;
    }
}