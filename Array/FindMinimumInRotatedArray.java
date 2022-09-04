package Array;

// https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/

public class FindMinimumInRotatedArray {
    public int findMin(int[] nums) {

        if(nums.length == 0) return 0;
        if(nums.length == 1) return nums[0];

        for(int i=1;i<nums.length;i++) {
            if(nums[i-1] > nums[i]) {
                return nums[i];
            }
        }
        if(nums.length >= 2 && nums[0] < nums[1]) return nums[0];

        return -1;
    }

    public static void main(String[] args) {
        FindMinimumInRotatedArray object = new FindMinimumInRotatedArray();

        System.out.println(object.findMin(new int[] {3,4,5,1,2}));
        System.out.println(object.findMin(new int[] {4,5,6,7,0,1,2}));
        System.out.println(object.findMin(new int[] {11,13,15,17}));
    }
}
