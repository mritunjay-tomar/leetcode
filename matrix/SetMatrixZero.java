package matrix;

// https://leetcode.com/problems/set-matrix-zeroes/

public class SetMatrixZero {
    private void setRowAndColumnToZeros(int row, int column, int[][] matrix) {
        int n=matrix.length, m=matrix[0].length;
        for(int i=0;i<n;i++) {
            System.out.print(matrix[i][n-1]);
        }

        for(int i=0;i<m;i++) {
            System.out.print(matrix[i][m]);
        }
    }

    public void setZeroes(int[][] matrix) {
        int n = matrix.length, m = matrix[0].length;
        for(int i=0;i<n;i++) {
            for(int j=i;j<m;j++) {
                if(matrix[i][j] == 0) {
                    setRowAndColumnToZeros(i, j, matrix);
                }
            }
        }
    }

    public void print(int[][] matrix) {
        for(int[] array : matrix) {
            for(int num: array) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        SetMatrixZero object = new SetMatrixZero();
        int[][] matrix = new int[][] {{0,1,2,0},{3,4,5,2},{1,3,1,5}};

        object.setZeroes(matrix);
        object.print(matrix);
    }
}
