package array;

// https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/

import java.util.Map;
import java.util.HashMap;

public class RemoveDuplicatesFromSortedArrays {
    public int removeDuplicates(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num: nums) {
            if(!map.containsKey(num)) {
                map.put(num, 1);
            } else {
                int count = map.get(num);
                if(count >= 2) continue;
                map.put(num, count+1);
            }
        }

        System.out.println(map);

        int counter=0, i=0;
        for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
            if(entry.getValue() == 1) {
                nums[i++] = entry.getKey();
                counter += 1;
            } else {
                nums[i++] = entry.getKey();
                nums[i++] = entry.getKey();
                counter += 2;
            }
        }

        print(nums);
        return counter;
    }

    private void print(int[] nums) {
        for(int num: nums) System.out.print(num + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        RemoveDuplicatesFromSortedArrays object = new RemoveDuplicatesFromSortedArrays();

        System.out.println(object.removeDuplicates(new int[] {1,1,1,2,2,3}));
        System.out.println(object.removeDuplicates(new int[] {0,0,1,1,1,1,2,3,3}));
        System.out.println(object.removeDuplicates(new int[] {1,1,1,1,2,2,3}));
    }
}
