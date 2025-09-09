class Solution {
    public void moveZeroes(int[] nums) {
        int left = 0;
        for(int right = 0; right < nums.length; right++){
            if(nums[left] == 0){
                while(nums[right] == 0 && right != nums.length - 1) {
                    right++;
                    }
                nums[left] = nums[right];
                nums[right] = 0;
            } 
            left++;
        }
    }
}
