// sliding window
public class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int max_sum = 0;
        int largest = 0;
        for(int i = 0; i < k; i++){
            max_sum += nums[i];
        }
        largest = max_sum;

        int left;
        for(int right = k; right < nums.length; right++){
            left = right - k;
            max_sum -= nums[left];
            max_sum += nums[right];
            largest = Math.max(largest, max_sum);
        }

        return (double)largest / k;
    }
} 643-maxAvg {
  
}
