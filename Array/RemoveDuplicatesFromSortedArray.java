package Array;// https://leetcode.com/problems/remove-duplicates-from-sorted-array/

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int i=0;
        for(int j=1;j<nums.length;j++) {
            if(nums[i] != nums[j]) {
                return 0;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        RemoveDuplicatesFromSortedArray object = new RemoveDuplicatesFromSortedArray();

        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int[] nums2 = {1,1,2};
        System.out.println(object.removeDuplicates(nums));
        System.out.println(object.removeDuplicates(nums2));
    }
}
