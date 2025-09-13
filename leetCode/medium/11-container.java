class Solution {
    public int maxArea(int[] height) {
        // 2 pointers: tot he
        int left = 0;
        int right = height.length - 1;
        int res = 0;
        int max = 0;
        while(left < right){
            // area:
            res = (right - left) * Math.min(height[right], height[left]); 
            max = max > res ? max : res;
            if(height[left] < height[right]) left++; else right--;
            
        }
        
        return max;
    }
}