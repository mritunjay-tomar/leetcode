// https://leetcode.com/problems/3sum/

import java.util.ArrayList;
import java.util.List;

public class ThreeSum {
    public boolean shouldWeAdd(int a, int b, int c, List<List<Integer>> list) {
        for (List<Integer> individualList : list) {
            if ((individualList.get(0) == a || individualList.get(0) == b || individualList.get(0) == c)
                    && (individualList.get(1) == a || individualList.get(1) == b || individualList.get(1) == c)
                    && (individualList.get(2) == a || individualList.get(2) == b || individualList.get(2) == c)) {
                return false;
            }
        }
        return true;
    }

    public boolean shouldWeAdd2(int a, int b, int c, List<List<Integer>> list) {
        for (List<Integer> individualList : list) {
            if(individualList.get(0) == a) {
                if(individualList.get(1) == b && individualList.get(2) == c) {
                    return false;
                } else if (individualList.get(1) == c && individualList.get(2) == b) {
                    return false;
                }
            }

            if(individualList.get(1) == a) {
                if(individualList.get(0) == b && individualList.get(2) == c) {
                    return false;
                } else if (individualList.get(0) == c && individualList.get(2) == b) {
                    return false;
                }
            }

            if(individualList.get(2) == a) {
                if(individualList.get(0) == b && individualList.get(1) == c) {
                    return false;
                } else if (individualList.get(0) == c && individualList.get(1) == b) {
                    return false;
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
                        if (shouldWeAdd2(nums[i], nums[j], nums[k], list)) {
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
        int[] nums4 = {-7,-11,12,-15,14,4,4,11,-11,2,-8,5,8,14,0,3,2,3,-3,-15,-2,3,6,1,2,8,-5,-7,3,1,8,11,-3,6,3,-4,-13,-15,14,-8,2,-8,4,-13,13,11,5,0,0,9,-8,5,-2,14,-9,-15,-1,-6,-15,9,10,9,-2,-8,-8,-14,-5,-14,-14,-6,-15,-5,-7,5,-11,14,-7,2,-9,0,-4,-1,-9,9,-10,-11,1,-4,-2,2,-9,-15,-12,-4,-8,-5,-11,-6,-4,-9,-4,-3,-7,4,9,-2,-5,-13,7,2,-5,-12,-14,1,13,-9,-3,-9,2,3,8,0,3};

        ThreeSum object = new ThreeSum();
        System.out.println(object.threeSum(nums));
        System.out.println(object.threeSum(nums1));
        System.out.println(object.threeSum(nums2));
        System.out.println(object.threeSum(nums3));
        System.out.println(object.threeSum(nums4));
    }
}
