class Solution {
    public boolean isIsomorphic(String s, String t) {
        // 1. if length != -> false
        // 2. create a map
        // 3. interate through s and t: if s is not in a map -> add to map s[i]: t[i]; otherwase check if s.key == t
        if(s.length() != t.length()) return false;
        Map<Character, Character>  map = new HashMap();
        for(int i = 0; i < s.length(); i++){
            if(!map.containsKey(s.charAt(i))){
                if(map.containsValue(t.charAt(i))) return false;
                map.put(s.charAt(i), t.charAt(i));
            } 
            
            if(map.get(s.charAt(i)) != t.charAt(i)) return false;
            
        }

        return true;
    }
}

// 2 solution
if(s.length() != t.length()) return false;
        int len = s.length();

        int[] arr1 = new int[200];
        int[] arr2 = new int[200];
        for(int i = 0; i < len; i++){
            if(arr1[s.charAt(i)] != arr2[t.charAt(i)])
                return false;
            arr1[s.charAt(i)] = i + 1;
            arr2[t.charAt(i)] = i + 1;
        }
        return true;