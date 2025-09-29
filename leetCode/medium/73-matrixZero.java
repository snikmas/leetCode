class Solution {
    public void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        boolean rowZero = false;
        boolean colZero = false;

        // check if first column needs to be zero
        for (int r = 0; r < rows; r++) {
            if (matrix[r][0] == 0) {
                colZero = true;
                break;
            }
        }

        // check if first row needs to be zero
        for (int c = 0; c < cols; c++) {
            if (matrix[0][c] == 0) {
                rowZero = true;
                break;
            }
        }

        // use first row/col as markers
        for (int r = 1; r < rows; r++) {
            for (int c = 1; c < cols; c++) {
                if (matrix[r][c] == 0) {
                    matrix[r][0] = 0;
                    matrix[0][c] = 0;
                }
            }
        }

        // set cells to zero based on markers
        for (int r = 1; r < rows; r++) {
            for (int c = 1; c < cols; c++) {
                if (matrix[r][0] == 0 || matrix[0][c] == 0) {
                    matrix[r][c] = 0;
                }
            }
        }

        // handle first column
        if (colZero) {
            for (int r = 0; r < rows; r++) {
                matrix[r][0] = 0;
            }
        }

        // handle first row
        if (rowZero) {
            for (int c = 0; c < cols; c++) {
                matrix[0][c] = 0;
            }
        }
    }
}
