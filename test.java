public class Solution {
    public static void slidingWindow(int[] arr, int k) {
        int left = 0;  
        int windowSum = 0;       

        for(int right = 0; right < arr.length; right++) {

            // expand it
            if (if_conditionsGood) {
                windowSum += arr[right];
                right++;
            } 

            // shrink it
            if (if_fixedSize_window_OR_if_you_need_it) {
                windowSum -= arr[left];
                left++;
            }
        }

        // example: expand it && shrink it
        // start: [1, 2, 3, 4, 5]; right = 0; left = 0; windowSum = 0;
        // 0 -> windowSum = 1; right = 1 AND left = 0; <- expanded it
        // 1 -> windowsSum = 3; right = 2 AND left = 0; <- expanded it
        // 2 -> winddowsSum = 2; right = 2 AND NOW left = 1 <- shrinked it 
        // 3 -> windowsSum = 5; right = 3 AND left = 1 <- expanded it
        // now: [1, 2, 3, 4, 5]; 

    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 3;
        slidingWindow(arr, k);
    }
}
