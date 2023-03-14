package org.example.backjoon;

import java.util.ArrayList;
import java.util.List;

public class Q10866 {
    public String solution(String[] s) {
        StringBuilder sb = new StringBuilder();
        List<String> number = new ArrayList<>();

        for (String order : s) {

            //push_front X: 정수 X를 덱의 앞에 넣는다.
            if (order.contains("push_front")) {
                String input = order.split(" ")[1];
                number.add(0, input);
                continue;
            }

            //push_back X: 정수 X를 덱의 뒤에 넣는다.
            if (order.contains("push_back")) {
                String input = order.split(" ")[1];
                number.add(input);
                continue;
            }

            //size: 덱에 들어있는 정수의 개수를 출력한다.
            if (order.equals("size")) {
                sb.append(number.size()).append("\n");
                continue;
            }

            //empty: 덱이 비어있으면 1을, 아니면 0을 출력한다.
            if (order.equals("empty")) {
                sb.append(number.size()==0 ? 1 : 0).append("\n");
                continue;
            }

            //이후의 로직은 정수가 없다면 -1을 출력한다
            if (number.isEmpty()) {
                sb.append(-1).append("\n");
                continue;
            }

            //pop_front: 덱의 가장 앞에 있는 수를 빼고, 그 수를 출력한다. 만약, 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
            if (order.equals("pop_front")) {
                sb.append(number.get(0)).append("\n");
                number.remove(0);
                continue;
            }

            //pop_back: 덱의 가장 뒤에 있는 수를 빼고, 그 수를 출력한다. 만약, 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
            if (order.equals("pop_back")) {
                sb.append(number.get(number.size()-1)).append("\n");
                number.remove(number.size()-1);
                continue;
            }

            //front: 덱의 가장 앞에 있는 정수를 출력한다. 만약 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
            if (order.equals("front")) {
                sb.append(number.get(0)).append("\n");
                continue;
            }
            //back: 덱의 가장 뒤에 있는 정수를 출력한다. 만약 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
            if (order.equals("back")) {
                sb.append(number.get(number.size()-1)).append("\n");
                continue;
            }

        }
        return sb.deleteCharAt(sb.length()-1).toString();
    }

}
