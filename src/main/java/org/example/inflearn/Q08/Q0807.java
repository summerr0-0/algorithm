package org.example.inflearn.Q08;

public class Q0807 {

    public int solution(int n, int r) {
        return DFS(n, r);

    }

    private int DFS(int n, int r) {
        if (r == 0 || n == r) return 1;
        return DFS(n - 1, r - 1) + DFS(n - 1, r);
    }

}
