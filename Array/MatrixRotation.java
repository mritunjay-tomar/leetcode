package Array;

public class MatrixRotation {

    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for(int i=0;i<n;i++) {
            for(int j=0;j<n/2;j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[i][i] = temp;
            }
        }
    }

    public void print(int[][] array) {
        for(int[] arr: array) {
            for(int num: arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        MatrixRotation object = new MatrixRotation();

        int[][] array = new int[][] {{1,2,3}, {4,5,6}, {7,8,9}};
        object.print(array);
        object.rotate(array);
        object.print(array);

    }
}
