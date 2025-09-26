class Solution {
    public static int lengthOfLongestSubstring(String s) {
    HashMap<Character, Integer> map = new HashMap<>();
    int max = 0;
    int left = 0; // start index of current substring
    
    for (int right = 0; right < s.length(); right++) {
        char c = s.charAt(right);
        
        if (map.containsKey(c) && map.get(c) >= left) {
            // move left pointer to skip the duplicate
            left = map.get(c) + 1;
        }
        
        map.put(c, right);
        
        max = Math.max(max, right - left + 1);
    }
    
    return max;
}


}