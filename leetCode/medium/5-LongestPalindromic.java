class Solution{
  public String longestPalindrome(String s){
    if(s == null || s.length() < 1) return "";
    
    int start = 0, end = 0;

    for(int i = 0; i < s.length(); i++){
      // odd
      // babad -> 0
      int lenOdd = expandCenter(s, i, i);

      // even
      int lenEven = expandCenter(s, i, i + 1);

      int len = Math.max(len1, len2);
      if(len > end - start){
        strt = i - (len - 1) / 2;
        end = i + len / 2;
      }
    }

    return s.substring(start, end + 1);
  }

  private int expandCenter(String s, int left, int right){
    // i = 0; babad left = 0; right = 0 babad = 5
    while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
      left--;
      right++;
    }

    return right - left - 1; // length of the palindorme
  }
}