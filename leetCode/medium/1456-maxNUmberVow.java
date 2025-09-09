class Solution {
    public int maxVowels(String s, int k) {
        HashSet<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');

        int max = 0;
        // 1. start window
        for(int i = 0; i < k; i++){
            if(set.contains(s.charAt(i))){
                max++;
            }
        }

        int count = max;
        int left = 0;
        for(int i = k; i < s.length(); i++){
            if(set.contains(s.charAt(left))) count--;
            if(set.contains(s.charAt(i))) count++;

            max = max > count ? max : count;
            left++;
        }

        return max;
    }
}
