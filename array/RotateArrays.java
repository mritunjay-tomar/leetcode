package array;

public class RotateArrays {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        if (k > n) {
            k = k % n;
        }

        for(int i=0;i<k;i++) {
            int last = nums[n-1];
            for(int j=n-1;j>0;j--) {
                nums[j] = nums[j-1];
            }
            nums[0] = last;
        }
    }

    private void print(int[] nums) {
        for(int num: nums) System.out.print(num + " ");
    }

    public static void main(String[] args) {
        RotateArrays object = new RotateArrays();
        int[] nums = new int[] {1,2,3,4,5,6,7};

        object.rotate(nums, 8);
        object.print(nums);
    }
}
