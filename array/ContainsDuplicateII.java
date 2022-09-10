package array;

public class ContainsDuplicateII {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(nums.length == 1 && k == 0) return true;
        if(nums.length == 1 && k != 0) return false;

        for(int i=0;i<nums.length;i++) {
            for(int j=i;j<nums.length;j++) {
                if(i != j && nums[i] == nums[j]) {
                    if(Math.abs(i-j) <= k) return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        ContainsDuplicateII object = new ContainsDuplicateII();

        System.out.println(object.containsNearbyDuplicate(new int[] {1,2,3,1}, 3));
        System.out.println(object.containsNearbyDuplicate(new int[] {1,2,3,1,2,3}, 2));
        System.out.println(object.containsNearbyDuplicate(new int[] {1,0,1,1}, 1));
    }
}
