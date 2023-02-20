package org.example.inflearn.Q08;

public class Q0802 {
    int goal = 0;
    int[]  i;
    int max = 0;
    public int solution(int c, int[] input) {
        goal = c;
        i = input;

        dfs(0,-1);
        return max;
    }

    private void dfs(int total, int depth) {
        if(total>goal) return;
        max = Math.max(total,max);
        if(depth == i.length-1) return;
        dfs(total+i[depth+1],depth+1);
        dfs(total,depth+1);
    }
}
