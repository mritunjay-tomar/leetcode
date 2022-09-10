package Array;

// https://leetcode.com/problems/sliding-window-maximum/

public class SlidingWindowMaximum {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] output = new int[nums.length-k+1];
        int counter = 0;

        for(int i=1;i< nums.length-k;i++) {
            int max = Integer.MIN_VALUE;
            System.out.println(i+k-1 + " ");
            for(int j=i;j<i+k-1;j++) {

                max = Math.max(nums[i-1], nums[i]);
            }
            output[counter++] = max;
        }

        print(output);
        return output;
    }

    public void print(int[] nums) {
        for(int num: nums) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        SlidingWindowMaximum object = new SlidingWindowMaximum();

        int[] nums = object.maxSlidingWindow(new int[] {1,3,-1,-3,5,3,6,7}, 3);
    }
}
