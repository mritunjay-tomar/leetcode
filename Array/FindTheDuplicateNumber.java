package Array;

// https://leetcode.com/problems/find-the-duplicate-number/

public class FindTheDuplicateNumber {
    public int findDuplicate(int[] nums) {
        int[] count = new int[nums.length+1];

        for(int num: nums) {
            if(count[num] == 0) {
                count[num] = count[num]+1;
            } else {
                return num;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        FindTheDuplicateNumber object = new FindTheDuplicateNumber();

        System.out.println(object.findDuplicate(new int[] {1,3,4,2,2}));
        System.out.println(object.findDuplicate(new int[] {3,1,3,4,2}));
    }
}
