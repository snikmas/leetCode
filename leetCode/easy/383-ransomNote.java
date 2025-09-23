class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        // 1. magazine to the set
        // 2. if ransomNotepletter contains in the magazine
        Map<Character, Integer> map = new HashMap<>();
        for(char c : magazine.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for(char c : ransomNote.toCharArray()){
            if(!map.containsKey(c) || map.get(c) == 0) return false;
            map.put(c, map.get(c) - 1);
        }
        return true;
        
    }
}

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        // 1. map
        // 2. using array as abc

        if(ransomNote.length() > magazine.length()) return false;
        int[] abc = new int[26];

        for(char c : magazine.toCharArray()) abc[c - 'a']++;
        for(char c : ransomNote.toCharArray()){
            if(abc[c - 'a'] == 0) return false;
            abc[c - 'a']--;
        }
        
        return true;
    }
}