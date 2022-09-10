package Numbers;

// https://leetcode.com/problems/factorial-trailing-zeroes/

import java.math.BigInteger;

public class TrailingZeros {

    public int getFactorial(int n) {
        if(n == 0) return 1;
        int total = 1;
        while(n != 0) {
            total *= n--;
        }
        return total;
    }

    public int trailingZeroes(int n) {
        System.out.println(getFactorial(n));
        return 0;
    }

    public static void main(String[] args) {
        TrailingZeros object = new TrailingZeros();

        System.out.println(object.trailingZeroes(0));
    }
}
