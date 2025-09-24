class Solution{
  public String SlidingWindow(String input){
    
    int leftPtr = 0, rightPtr = 0, windowLen = 0;
    
    while(rightPtr < input.length()){
      leftPtr = right - windowLen;

      // if we need to shrink:
      if(we_wanna_shrink){
        leftPtr++;
        windowLen--;
      }

      if(we_wanna_expand){
        rightPtr++;
        windowLen++;
      }

      return input.substring(leftPtr, rightPtr);
    }

  }
}