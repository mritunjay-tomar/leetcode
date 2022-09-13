package array;

// https://leetcode.com/problems/rotate-array/

public class RotateArray {
    public void rotate(int[] nums, int k) {
        int n = nums.length, counter=0;
        int[] newNums = new int[n];
        if(k >= n) k = k % n;
        if(k == 0) return;

        for(int i=n-k;i<n;i++) {
            newNums[counter++] = nums[i];
        }

        for(int i=0;i<n-k;i++) {
            newNums[counter++] = nums[i];
        }

        counter = 0;
        for(int num: newNums) {
            nums[counter++] = num;
        }
    }
    public void print(int[] arr) {
        for(int num: arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        RotateArray object = new RotateArray();
        int[] array = {1,2,3,4,5,6,7};
        object.print(array);
        object.rotate(array, 8);
        object.print(array);

        int[] array1 = {-1,-100,3,99};
        object.print(array1);
        object.rotate(array1, 2);
        object.print(array1);

    }
}
