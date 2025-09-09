import java.util.Stack;

class Solution {
    public String removeStars(String s) {
        // 1. s is immutable -> create a stringbuilder
        StringBuilder copy = new StringBuilder);
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '*'){
                stack.pop();

            } else {
                stack.push(s.charAt(i));
            }
        }

        while(!stack.isEmpty()){
            copy.append(stack.pop());
        }

        return copy.reverse().toString();
    }
}