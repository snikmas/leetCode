import java.util.*;

class Solution {
    public int maxOperations(int[] nums, int k) {
        // two pointers? or set
        // 1. create a set
        // 2, crate a loop through nums
        // 3. do target = k - nums[current]
        // 4. if set.contains? do
        // 5.otherwise.. add to the set?

        // // HashSet<Integer> set = new HashSet<>(); - doesnt work, if there're 2+ repeated

        // int target = 0;
        // int counts = 0;
        // for(int i = 0; i < nums.length; i++){
        //     target = k - nums[i];
        //     if (set.contains(target)) {
        //         counts++;
        //         set.remove(target);
        //     } else {
        //         set.add(nums[i]);
        //     }
        // }

        HashMap<Integer, Integer> map = new HashMap<>();
        int target, counts = 0;
        for(int i = 0; i < nums.length; i++){
            target = k - nums[i];
            if(map.getOrDefault(target, 0) > 0){
                counts++;
                map.put(target, map.get(target) - 1);
            } else {
                map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            }
        }


        return counts;
        
    }
}

// too slow