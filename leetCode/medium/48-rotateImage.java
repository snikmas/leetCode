class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int left = 0, right = n - 1;

        while (left < right) {
            for (int i = 0; i < right - left; i++) {
                int top = left, bottom = right;

                // save top-left
                int topLeft = matrix[top][left + i];

                // move bottom-left → top-left
                matrix[top][left + i] = matrix[bottom - i][left];

                // move bottom-right → bottom-left
                matrix[bottom - i][left] = matrix[bottom][right - i];

                // move top-right → bottom-right
                matrix[bottom][right - i] = matrix[top + i][right];

                // move top-left (saved) → top-right
                matrix[top + i][right] = topLeft;
            }
            left++;
            right--;
        }
    }
}
