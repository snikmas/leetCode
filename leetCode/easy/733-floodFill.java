import java.util.*;

class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int originalColor = image[sr][sc];
        if(originalColor == color) return image;

        int rows = image.length, cols = image[0].length;
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{sr, sc});

        while(!queue.isEmpty()){
            int[] pos = queue.poll();
            int r = pos[0], c = pos[1];

            if(r < 0 || c < 0 || r >= rows || c >= cols) continue;
            if(image[r][c] != originalColor) continue;

            image[r][c] = color;

            queue.offer(new int[]{r + 1, c});
            queue.offer(new int[]{r - 1, c});
            queue.offer(new int[]{r, c + 1});
            queue.offer(new int[]{r, c - 1});
        }

        return image;
    }
}








class Solution{
    public int[][] floodFill(int[][] image, int sr, int sc, int color){
        // if color is the same = dont do it
        int originalColor = image[sr][sc];
        if (originalColor == color) return image; // dont do it


        // get length width of the it
        int r = image.length;
        int c = image[0].length;

        // create a queue
        Queue<int[]> queue = new LinkedList<>();

        queue.offer(new int[] {sr, sc}); // and we save its... coordinates?
        while(!queue.isEmpty){
            int[] cur = queue.poll();
            // get r and c
            rCurrent = cur[0];
            cCurrent = cur[1];

            if(rCurrent < 0 || cCurrent < 0 || rCurrent >= r || cCurrent >= c) continue;
            if(image[rCurrent][cCurrent] != originalColor) continue; // is not suitable
            image[rCurrent][cCurrent] = color;

            // add its neighbours
            queue.offer(new int[](r + 1, c));
            queue.offer(new int[](r - 1, c));
            queue.offer(new int[](r, c + 1));
            queue.offer(new int[](r, c - 1));
        }

        return image;
    }





}




