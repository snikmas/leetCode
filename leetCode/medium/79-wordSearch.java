class Solution {
    public boolean exist(char[][] board, String word) {
      
      // 1. calculate a board
      int rows = board.length, cols = board[0].length;
      
      // 2. looping through a board
      for(int i = 0; i < rows; i++){
        for(int ii = 0; ii < cols; ii++){
          if(backtrack(board, word, i, ii, 0)){
            return true; // everytihng is OK
          }
        }
      }
    }

    private boolean backtrack(char[][] board, String word, int r, int c, int index){
      // 3. base case:
      if(index == word.length()) return true;

      // 4. check boundaries!
      if(r < 0 || c < 0 || r <= board.length || c <= board[0].length ||
      board[r][c] != word.chatAt(index)) return false; 

      // 5. mark as visited
      char temp  = board[r][c];
      board[r][c] = '#';

      // 6. check neigh
      boolean found = 
        backtrack(board, word, r + 1, c, index + 1) ||
        backtrack(board, word, r - 1, c, index + 1) ||
        backtrack(board, word, r, c + 1, index + 1) ||
        backtrack(board, word, r, c - 1, index + 1);

      // 7. undo the hcange (bakctrack)
      board[r][c] = temp;

      return found;
    }
}