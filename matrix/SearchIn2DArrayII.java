package matrix;

public class SearchIn2DArrayII {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length, m=matrix[0].length, index1 = -1, index2 = -1;

        // search in first rows
        for(int i=0;i<m;i++) {
            if(matrix[0][i] == target) return true;

            System.out.println(matrix[0][i]);
            if(matrix[0][i] > target) {
                index1 = i-1;
                break;
            }
        }

        // search in columns
        if(index1 == -1) {
            for (int i = 0; i < n; i++) {
                if (matrix[i][0] == target) return true;

                if (matrix[i][0] > target) {
                    index1 = i - 1;
                    break;
                }
            }
        }

        if(index1 == -1) {
            for(int i = 0; i < m; i++) {
                System.out.println(matrix[m-1][i]);
                if(matrix[m-1][i] == target) {
                    return true;
                }
            }

            for (int i = 0; i < n; i++) {
                System.out.println(matrix[i][n-1]);
                if (matrix[i][n-1] == target) {
                    return true;
                }
            }
        }

        if(index1 > -1) {
            for (int i = 0; i < m; i++) {
                if (matrix[i][index1] == target) {
                    return true;
                }
            }
        }

        return false;

    }

    public static void main(String[] args) {
        SearchIn2DArrayII object = new SearchIn2DArrayII();
        int[][] matrix = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24}};

//        System.out.println(object.searchMatrix(matrix, 5));
//        System.out.println(object.searchMatrix(matrix, 1));
        System.out.println(object.searchMatrix(matrix, 24));
//        System.out.println(object.searchMatrix(matrix, 16));
    }
}
