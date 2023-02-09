package org.example.inflearn.Q08;

public class Q0801 {
    int[] arr;
    int goal = 0;

    boolean state = false;

    public String solution(int[] input) {
        arr = input;
        for (int n : input) {
            goal += n;
        }

        dfs(-1, 0);

        return  state ? "YES" : "NO";

    }

    private void dfs(int numIdx, int sum) {
        if (sum > goal / 2) return;
        if (numIdx >= arr.length-1) return;
        if (sum*2 ==  goal) {
            state = true;
            return;
        }
        dfs(numIdx + 1, sum + arr[numIdx + 1]);
        dfs(numIdx + 1, sum);
    }
}
