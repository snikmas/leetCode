class Solution {
    public int findMin(int[] nums) {
        int left = 0, right = nums.length - 1;

        while(left < right){
            int mid = left + (right - left) / 2;
            if(nums[mid] > nums[right]){
                // chck right half
                left = mid + 1;
            } else {
                // left half
                right = mid;
            }
        }
    return nums[left]; // left = right = min
    }
}