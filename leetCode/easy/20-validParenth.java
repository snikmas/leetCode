import java.io.*;
import java.util.*;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        // if length % 2 != 0 -> false
        if(s.length() % 2 != 0) return false;

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '(' || ch == '[' || ch == '{'){
                stack.push(ch);
            } else{
                if(stack.empty()) return false;
                switch(ch){
                    case ']' -> {
                        if(stack.pop() != '[') return false;
                        }
                    case '}' -> {
                        if(stack.pop() != '{') return false;
                        }
                    case ')' -> {
                        if(stack.pop() != '(') return false;
                        }
                }
            }
        }


        // shoudn't run but if..
        if(stack.empty()) return true;
        return false;
        
    }
}