
class Solution {
    public boolean isValidSudoku(char[][] board) {

        // logic:
        // 1) check rows using 9 hashsets
        // 2) check column using 9 hashsets
        // 3) check boxes using 9 hashsets
    
        
        int N = 9;
        HashSet<Character>[] rows = new HashSet[N];
        HashSet<Character>[] cols = new HashSet[N];
        HashSet<Character>[] boxes = new HashSet[N];

        for(int r= 0; r < N; r++){
            rows[r] = new HashSet<Character>();
            cols[r] = new HashSet<Character>();
            boxes[r] = new HashSet<Character>();
        }

        for(int r = 0; r < N; r++){
            for(int c = 0; c < N; c++){
            char val = board[r][c];
            
            // check if the postiion is filled with number
            if(val == '.') continue;

            if(rows[r].contains(val)) return false;
            rows[r].add(val);

            // check the col
            if(cols[c].contains(val)) return false;
            
            cols[c].add(val);

            // check the box
            int idx = (r / 3) * 3 + c / 3;
            if(boxes[idx].contains(val)) return false;
            boxes[idx].add(val);
            }
        }
    return true;
    }
}