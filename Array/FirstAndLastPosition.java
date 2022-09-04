package Array;

// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

public class FirstAndLastPosition {
    public void searchRange2(int[] nums, int target) {
        int i = 0, j = nums.length-1;
        int first = -1, last = -1;

        while(i < nums.length-1 && j >= 0) {
            if(nums[i] == target && first == -1) first = i;
            if(nums[j] == target && last == -1) last = j;
            i++;
            j--;
        }
        System.out.println(first + " " + last);
    }

    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        FirstAndLastPosition object = new FirstAndLastPosition();
        object.searchRange2(nums, 8);
    }
}
