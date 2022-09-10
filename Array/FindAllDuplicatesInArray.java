package Array;

// https://leetcode.com/problems/find-all-duplicates-in-an-array/

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class FindAllDuplicatesInArray {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        if(nums.length == 0) return list;

        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++) {
            if(nums[i] == nums[i+1]) {
                list.add(nums[i]);
            }
        }

        return list;
    }

    public static void main(String[] args) {
        FindAllDuplicatesInArray object = new FindAllDuplicatesInArray();
        int[] nums = new int[] {4,3,2,7,8,2,3,1};
        int[] nums2 = new int[] {1,1,2};
        int[] nums3 = new int[] {1,1};

        System.out.println(object.findDuplicates(nums));
        System.out.println(object.findDuplicates(nums2));
        System.out.println(object.findDuplicates(nums3));
    }
}
