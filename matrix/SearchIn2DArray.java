package matrix;

// https://leetcode.com/problems/search-a-2d-matrix/

public class SearchIn2DArray {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length, m=matrix[0].length;
        int index = -1;
        for(int i=0;i<n;i++) {
            if(target == matrix[i][0]) return true;
            if(target < matrix[i][0]) {
                index = i;
                break;
            }
        }
        if(matrix[n-1][0] < target) index = n;
        System.out.println(index);
        if(index == -1) return false;
        if(index <= 0) {
            index = 0;
        } else {
            index -= 1;
        }

        for(int j=0;j<m;j++) {
            if(matrix[index][j] == target) return true;
        }

        return false;
    }

    public static void main(String[] args) {
        SearchIn2DArray object = new SearchIn2DArray();
        int[][] matrix = new int[][] {{1,3,5,7}, {10,11,16,20}, {23,30,34,60}};
        int[][] matrix2 = new int[][] {{1}, {2}, {3}, {4}, {5}};
        int[][] matrix3 = new int[][]{{1, 2, 3, 4, 5}};
        int[][] matrix4 = new int[][]{{1}};

        System.out.println(object.searchMatrix(matrix, 61));
        System.out.println(object.searchMatrix(matrix2, 6));
        System.out.println(object.searchMatrix(matrix3, 5));
        System.out.println(object.searchMatrix(matrix4, 0));
    }
}
