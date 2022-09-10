package numbers;// https://leetcode.com/problems/reverse-integer/

public class ReverseInteger {
    public static void main(String[] args) {
        int x = -321654;
        long newNumber = 0;

        while(x != 0) {
            newNumber = (newNumber * 10) + (x % 10);
            if(newNumber < Integer.MIN_VALUE || newNumber > Integer.MAX_VALUE) {
                System.out.println(0);
                break;
            }
            x /= 10;
        }

        System.out.println(newNumber);
    }
}
