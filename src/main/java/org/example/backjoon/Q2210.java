package org.example.backjoon;

import java.util.HashSet;
import java.util.Set;

public class Q2210 {
    Set<String> set = new HashSet<>();
    int[][] map;
    int[][] move = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    int[] arr = new int[6];

    public int solution(int[][] input) {
        map = input;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                arr[0] = map[i][j];
                dfs(j, i, 1);
            }
        }
        for (String s : set){
            System.out.println(s);
        }
        return set.size();
    }

    public void dfs( int x, int y, int depth) {
        if (depth ==  6) {
            StringBuilder sb = new StringBuilder();
            for (int s : arr) {
                sb.append(s);
            }
            set.add(sb.toString());
            return;
        }

        for (int i = 0; i < 4; i++) {
            int ny = y + move[i][0];
            int nx = x + move[i][1];

            if (ny < 0 || nx < 0 || nx >= 5 || ny >= 5) continue;

            arr[depth] = map[ny][nx];
            dfs( nx, ny, depth+1);

        }
    }
}
