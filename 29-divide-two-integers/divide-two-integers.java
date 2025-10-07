class Solution {
    public int divide(int dividend, int divisor) {
        // Handle overflow for a specific edge case
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        // Determine the sign of the result
        int sign = 1;
        if ((dividend > 0 && divisor < 0) || (dividend < 0 && divisor > 0)) {
            sign = -1;
        }

        // Use long for calculations to avoid overflow with Integer.MIN_VALUE
        long longDividend = Math.abs((long) dividend);
        long longDivisor = Math.abs((long) divisor);

        // Perform repeated subtraction using bit shifting
        int quotient = 0;
        while (longDividend >= longDivisor) {
            long tempDivisor = longDivisor;
            int multiple = 1;
            
            // Find the largest multiple of the divisor
            while (longDividend >= (tempDivisor << 1)) {
                tempDivisor <<= 1;
                multiple <<= 1;
            }
            
            // Subtract the found multiple from the dividend
            longDividend -= tempDivisor;
            // Add the corresponding multiple to the quotient
            quotient += multiple;
        }

        // Apply the correct sign to the result
        return sign * quotient;
    }
}
