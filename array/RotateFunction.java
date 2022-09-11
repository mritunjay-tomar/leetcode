package array;

// https://leetcode.com/problems/rotate-function/

public class RotateFunction {

    private int[] rotate(int[] nums) {
        int first = nums[0];
        for(int i=1;i<nums.length;i++) {

        }
        return nums;
    }

    public int maxRotateFunction(int[] nums) {
        rotate(nums);
        return 0;
    }

    public void print(int[] nums) {
        for(int num: nums) System.out.print(num + " ");
    }

    public static void main(String[] args) {
        RotateFunction object = new RotateFunction();
        int[] nums = new int[] {4,3,2,6};

        System.out.println(object.maxRotateFunction(nums));

    }
}
