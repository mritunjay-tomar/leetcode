package Array;

// https://leetcode.com/problems/merge-sorted-array/

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(nums1.length == 0 || nums2.length == 0) return;

        int[] nums = new int[nums1.length];
        int i=0, j=0, counter=0;

        while(counter < nums1.length) {
            if (i < m && j < n && nums1[i] < nums2[j]) {
                nums[counter] = nums1[i];
                i++;
            } else {
                nums[counter] = nums2[j];
                j++;
            }
            counter++;
        }

        nums1 = nums.clone();
        for(int num: nums1) System.out.print(num + " ");
    }

    public static void main(String[] args) {
        MergeSortedArray object = new MergeSortedArray();

        object.merge(new int[] {1,2,3,0,0,0}, 3, new int[] {2,5,6}, 3);
        object.merge(new int[] {2,0}, 1, new int[] {1}, 1);
    }
}
