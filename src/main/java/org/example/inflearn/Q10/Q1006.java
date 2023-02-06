package org.example.inflearn.Q10;

import java.util.Arrays;

public class Q1006 {
    public int solution(int N, int M, int[][] arr) {

        int answer = 0;
        int[] dy = new int[M+1];

        for (int i = 0; i < N; i++) {
            int score = arr[i][0];
            int time = arr[i][1];

            for (int j = M; j >= time; j--) {
                dy[j] = Math.max(dy[j - time] + score, dy[j]);
                answer = Integer.max(dy[j], answer);

            }
        }


        return answer;

    }
}
