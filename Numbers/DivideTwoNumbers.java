package Numbers;// https://leetcode.com/problems/divide-two-integers/

public class DivideTwoNumbers {
    public static int divide(int dividend, int divisor) {
        int sign = 1;
        if (dividend < 0 && divisor < 0) sign = 1;
        else if (dividend < 0) sign = -1;
        else if (divisor < 0) sign = -1;

        if(dividend == Integer.MIN_VALUE) dividend = Integer.MAX_VALUE;

        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);

        long quotient = 0;
        while(dividend >= divisor) {
            dividend -= divisor;
            quotient += 1;
        }

        if (quotient < Integer.MIN_VALUE) return Integer.MIN_VALUE;
        if (quotient > Integer.MAX_VALUE) return Integer.MAX_VALUE;

        return (int) quotient * sign;
    }

    public static void main(String[] args) {
        System.out.println(divide(10, 3));
        System.out.println(divide(7, -3));
        System.out.println(divide(-1, -1));
        System.out.println(divide(Integer.MIN_VALUE, -1));
    }
}
