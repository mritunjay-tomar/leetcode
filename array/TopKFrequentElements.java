package array;

import java.util.Map;
import java.util.TreeMap;

// https://leetcode.com/problems/top-k-frequent-elements/

public class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new TreeMap<>();

        for(int num: nums) {
            if(map.containsKey(num)) {
                int count = map.get(num);
                map.put(num, count+1);
            } else {
                map.put(num, 1);
            }
        }

        System.out.println(map);
        return nums;
    }

    private void print(int[] nums) {
        for(int num: nums) System.out.print(num + " ");
    }

    public static void main(String[] args) {
        TopKFrequentElements object = new TopKFrequentElements();

        object.topKFrequent(new int[] {1,1,1,2,2,3,4,4,4,4}, 2);
    }
}
