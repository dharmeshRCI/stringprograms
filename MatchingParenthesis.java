package com.dr.stringprogram;

import java.util.Stack;

public class MatchingParenthesis {

    public static void main(String[] args) {
        String checkBalancedExpr1=checkBalancedParentesis("[()]{}{[()()]()}");
        System.out.println("[()]{}{[()()]()} : "+checkBalancedExpr1);
        String checkBalancedExpr2=checkBalancedParentesis("[(])");
        System.out.println("[(]): "+checkBalancedExpr2);
    }
    public static String checkBalancedParentesis(String expr)
    {
        if (expr.isEmpty())
            return "Matching";

        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < expr.length(); i++)
        {
            char current = expr.charAt(i);
            if (current == '{' || current == '(' || current == '[')
            {
                stack.push(current);
            }
            if (current == '}' || current == ')' || current == ']')
            {
                if (stack.isEmpty())
                    return "Not Matching";
                char last = stack.peek();
                if (current == '}' && last == '{' || current == ')' && last == '(' || current == ']' && last == '[')
                    stack.pop();
                else
                    return "Not Matching";
            }
        }
        return stack.isEmpty()?"Matching":"Not Matching";
    }

}