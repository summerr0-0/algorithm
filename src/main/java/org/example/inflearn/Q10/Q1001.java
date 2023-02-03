package org.example.inflearn.Q10;

public class Q1001 {
    public int solution(int N) {
        int[] dy = new int[N+1];
        //첫번째 계단 오르는 방법
        dy[1] = 1;
        //두번째 계단 오르는 방법
        dy[2] = 2;
        //두번째 전 계단 + 이전 계단
        for(int i = 3; i<=N; i++){
            dy[i] = dy[i-1] + dy[i-2];
        }
        return dy[N];
    }
}
