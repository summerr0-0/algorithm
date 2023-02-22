package org.example.backjoon;

import java.util.Stack;

public class Q10799 {
    public int solution(String s) {

        Stack<Character> stack = new Stack<>();
        int count = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i< chars.length; i++) {
            //닫힌 괄호라면
            if (chars[i] == ')') {
                //앞이 열린 괄호라면 ( 수만큼 더하기 (사이즈만큼 더하기)
                if (chars[i-1] == '(') {
                    count += stack.size()-1;
                } else {
                    //아니면 그냥 +1
                    count += 1;
                }
                //괄호 세트 빼기
                stack.pop();
                continue;
            }
            //열린 괄호는 그냥 넣기
            stack.push(chars[i]);
        }
        return count;
    }


}
