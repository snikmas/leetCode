class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // start from the ends: and check its sum: if too small -> leftPtr ++ otehrwise rightPtr--

        int leftPtr = 0;
        int rightPtr = numbers.length - 1;
        int sum;
        while(leftPtr < rightPtr){
            sum = numbers[leftPtr] + numbers[rightPtr];
            if(sum == target) return new int[] {leftPtr + 1, rightPtr + 1};
            else if(sum < target) leftPtr++;
            else rightPtr--;
        }

        return new int[] {};
    }
}