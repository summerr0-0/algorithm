package org.example.backjoon;

import java.util.Arrays;

public class Q22858 {
    public int[] solution(int n, int k, int[] s, int[] d) {
        int[] answer = new int[n];

        for (int i = 0; i < k; i++) {
            for (int j = 0; j < n; j++) {
                answer[d[j]-1] = s[j];
            }
            s = Arrays.copyOf(answer,n);
        }
        return answer;
    }
}
