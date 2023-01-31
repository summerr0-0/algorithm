package org.example.inflearn.Q08;

public class Q0813 {
    public int solution(int N, int[][] arr) {
        int[][] move = {
            {1, 0},
            {1, -1},
            {1, 1},
            {0, -1},
            {0, 1},
            {-1, -1},
            {-1, 0},
            {-1, 1}};

        int count = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (arr[i][j] == 1) {
                    dfs(arr, i, j, move);
                    count++;

                }
            }
        }
        return count;
    }

    private void dfs(int[][] arr, int x, int y, int[][] move) {
        arr[y][x] = 0;
        for (int i = 0; i < move.length; i++) {
            int nx = x + move[i][0];
            int ny = y + move[i][1];

            if (nx < 0 || ny < 0 || nx >= arr.length || ny >= arr.length || arr[ny][nx] == 0) continue;
            dfs(arr, nx, ny, move);
        }
    }
}
