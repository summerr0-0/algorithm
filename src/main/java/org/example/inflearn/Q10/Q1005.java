package org.example.inflearn.Q10;

import java.util.Arrays;

public class Q1005 {
    //냅색 알고리즘
    public int solution(int N, int[] coins, int M) {

        int[] dy = new int[M + 1];
        Arrays.fill(dy, Integer.MAX_VALUE);
        dy[0] = 0;

        //동전 꺼내기
        for (int i = 0; i < N; i++) {
            int coin = coins[i];

            //거스름돈 계산하기
            for (int j = coin; j <= M; j++) {
                dy[j] = Math.min(dy[j-coin] +1,dy[j]);
            }

        }


        return dy[M];

    }
}
