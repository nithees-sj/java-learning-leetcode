class Solution {
    public int accountBalanceAfterPurchase(int purchaseAmount) {
        int roundAmount = ((purchaseAmount + 5)/10)*10;
        return 100-roundAmount;
    }
}