class Solution {
    public String convert(String s, int numRows) {
        // case: no zigzag
        if (numRows == 1 || s.length() <= numRows) {
            return s;
        }

        // a list of StringBuilders for each row
        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        int currentRow = 0;
        boolean goingDown = false;

        // Traverse string
        for (char c : s.toCharArray()) {
            rows[currentRow].append(c);

            // Change direction
            if (currentRow == 0 || currentRow == numRows - 1) {
                goingDown = !goingDown;
            }

            
            currentRow += goingDown ? 1 : -1;
        }

        // merging
        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) {
            result.append(row);
        }

        return result.toString();
    }
}
