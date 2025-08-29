import java.util.*;
import java.util.Stack;

public class BraceChecker {

  public static boolean isValid(String braces) {
    // Add code here
    Stack<Character> stack = new Stack<>();
    for(int i = 0; i < braces.length(); i++){
      if(braces.charAt(i) == '[' || braces.charAt(i) == '{' || braces.charAt(i) == '('){
        stack.push(braces.charAt(i));
      } else {
      
        
        if(stack.empty()) return false; // we see ]}) and stack is emprty
        switch(braces.charAt(i)){
          case '}':
            if(stack.pop() == '{') continue; // continue to the next for loop, no need for break? 
            break;
          case ')':
            if(stack.pop() == '(') continue;
            break;
          case ']':
            if(stack.pop() == '[') continue;
            break;
        }
        // if we got this line.. means that switch continue to the next loop doesnt work. means that error
        return false;
      }
    }
    
    return (stack.empty()); // if stack is empty -> ok
  }

}