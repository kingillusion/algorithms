package com.king.illusion.algorithms;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
/*
 leetcode #20. Valid Parentheses
 charAt();Stack;Character;
 */
public class ValidParentheses {
    public Boolean isValid(String s){

        Map<Character,Character> map  = new HashMap<>();
        map.put('(',')');
        map.put('[',']');
        map.put('{','}');
        Stack<Character> stack = new Stack<>();
        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            if(map.containsKey(c)){
                stack.push(map.get(c));
            }else if(map.containsValue(c)){
                if(stack.isEmpty() || stack.pop()!=c){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    public boolean isValidNew(String s) {
        boolean flag = false;
        while(s.contains("()")||s.contains("[]")||s.contains("{}")){
            s = s.replace("()","");
            s = s.replace("[]","");
            s = s.replace("{}","");

        }
        if(s.equals("")){
            flag = true;
        }
        return flag;
    }
    public static void main(String[] args){
        ValidParentheses v = new ValidParentheses();
        boolean s = v.isValidNew("()");
        System.out.println(s);
    }
}
