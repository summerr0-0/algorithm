package org.example.inflearn.Q10;

public class Q1002 {
    public int solution(int N) {
        //개울을 건너러면 돌을 다 지나야 한다 (한번 더 건너야 한다)
        int[] dy = new int[N + 2];

        dy[1] = 1;
        dy[2] = 2;

        for(int i = 3; i<=N+1; i++){
            dy[i] = dy[i-1] + dy[i-2];
        }
        return dy[N+1];
    }
}
