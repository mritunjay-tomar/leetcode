package array;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;


public class IntersectionOfTwoArraysII {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums1);

        int i=0, j=0;
        while(i<nums1.length && j < nums2.length) {
            if(nums1[i] == nums2[j]) {
                list.add(nums1[i]);
                i++;
                j++;
            }
            else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                i++;
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
