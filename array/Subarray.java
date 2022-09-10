package array;

// https://www.hackerrank.com/challenges/java-negative-subarray/problem?isFullScreen=true

public class Subarray {

    public static void main(String[] args) {
        int[] arr = {1, -2, 4, -5, 1};
        int total = 0;

        for(int i=0;i<arr.length;i++) {
            int sum = 0;
            for(int j=i;j<arr.length;j++) {
                sum += arr[j];
            }
            if (sum < 0) total += 1;
        }

        System.out.println(total);
    }
}
