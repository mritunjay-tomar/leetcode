package matrix;

// https://leetcode.com/problems/rotate-image/

public class MatrixRotation {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        // first transpose the matrix
        for(int i=0;i<n;i++) {
            for(int j=i;j<n;j++) {
                if(i!=j) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
        }

        // then swap matrix elements
        for(int i=0;i<n;i++) {
            for(int j=0;j<n/2;j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length - 1 - j];
                matrix[i][matrix.length - 1 - j] = temp;
            }
        }

        print(matrix);
    }

    public void print(int[][] matrix) {
        for(int[] arr: matrix) {
            for(int num: arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MatrixRotation object = new MatrixRotation();
        int[][] matrix = {{1,2,3}, {4,5,6}, {7,8,9}};

        object.print(matrix);
        object.rotate(matrix);
    }
}
