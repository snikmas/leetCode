class Solution {
    public int[] twoSum(int[] nums, int target) {
        // hashmap: 1. create a hashmap
        // 2. do loop: check if in the map: target - arr[i]
        // 3. if yes: return target - arr[i] and current arr[i]; otherwise add to the hasmap
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int num = target - nums[i];
            if(map.containsKey(num)) return new int[] {map.get(num), i};
        // otherwise:
        map.put(nums[i], i);
        }
    return new int[]{}; // no results
    }
}