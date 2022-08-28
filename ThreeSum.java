// https://leetcode.com/problems/3sum/

import java.util.ArrayList;
import java.util.List;

public class ThreeSum {
    public boolean shouldWeAdd(int a, int b, int c, List<List<Integer>> list) {
        for(List<Integer> individualList: list) {
            if (individualList.get(0) == a || individualList.get(0) == b || individualList.get(0) == c) {
                if (individualList.get(1) == a || individualList.get(1) == b || individualList.get(1) == c) {
                    if (individualList.get(2) == a || individualList.get(2) == b || individualList.get(2) == c) {
                        return false;
                    }
                }
            }
        }

        return true;
    }

    public List<Integer> createList(int a, int b, int c) {
        List<Integer> list = new ArrayList<>();
        list.add(a);
        list.add(b);
        list.add(c);
        return list;
    }

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        int length = nums.length;
        for (int i=0;i<length;i++) {
            for (int j=0;j<length;j++) {
                for (int k=0;k<length;k++) {
                    if ((i != j && j!= k && k != i) && (nums[i] + nums[j] + nums[k] == 0)) {
                        if (shouldWeAdd(nums[i], nums[j], nums[k], list)) {
                            list.add(createList(nums[i], nums[j], nums[k]));
                        }
                    }
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        // test cases
        int[] nums = {-1, 0, 1, 2, -1, -4};
        int[] nums1 = {0, 1, 1};
        int[] nums2 = {0, 0, 0};
        int[] nums3 = {0,3,0,1,1,-1,-5,-5,3,-3,-3,0};

        ThreeSum object = new ThreeSum();
        System.out.println(object.threeSum(nums));
        System.out.println(object.threeSum(nums1));
        System.out.println(object.threeSum(nums2));
        System.out.println(object.threeSum(nums3));
    }
}
