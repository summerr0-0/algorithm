package org.example.inflearn.Q10;

public class Q1006 {
    public int solution(int N, int M, int[][] arr) {

        int answer = 0;
        int[] dy = new int[M+1];

        for (int i = 0; i < N; i++) {
            int score = arr[i][0];
            int time = arr[i][1];

            //문제는 중복으로 풀 수 없으니 역순으로 넣어야 한다.
            for (int j = M; j >= time; j--) {
                dy[j] = Math.max(dy[j - time] + score, dy[j]);
                answer = Integer.max(dy[j], answer);

            }
        }


        return answer;

    }
}
