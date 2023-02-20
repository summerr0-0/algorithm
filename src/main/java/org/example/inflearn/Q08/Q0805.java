package org.example.inflearn.Q08;

public class Q0805 {

    int[] type;
    int goal;
    int min = 999;

    public int solution(int[] N, int M) {

        type = N;
        goal = M;

        dfs(0, 0);
        return min;
    }

    private void dfs(int total, int count) {
        if (goal < total) return;
        if (goal == total) {
            min = Math.min(min, count);
            return;
        }

        for (int j : type) {
            dfs(total + j, count + 1);
        }
    }
}

