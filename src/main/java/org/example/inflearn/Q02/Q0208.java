package org.example.inflearn.Q02;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Q0208 {
    public String solution(int[] arr) {
        StringBuilder sb = new StringBuilder();
        List<Integer> sortedList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            sortedList.add(arr[i]);
        }
        sortedList.sort(Comparator.reverseOrder());

        for (int i = 0; i < arr.length; i++) {
            int index = sortedList.indexOf(arr[i]);
            sb.append(index+1).append(" ");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
}
