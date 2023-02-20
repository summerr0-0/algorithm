package org.example.inflearn.Q08;

public class Q0804 {
    int[] arr;
    int max;
    int size;
    StringBuilder sb = new StringBuilder();

    public String solution(int N, int M) {
        arr = new int[M];
        max = N;
        size = M;
        dfs(0,-1);
        return sb.toString();
    }

    private void dfs(int num, int idx) {
        if(idx >= size) return;
        if (idx == size-1) {
            for (int n : arr) {
                sb.append(n).append(" ");
            }
            sb.deleteCharAt(sb.length()-1);
            sb.append("\n");
            return;
        }

        for(int i = 1; i<= max; i++){
            idx = idx+1;
            arr[idx] = i;
            dfs(i,idx);
            idx = idx-1;
        }

    }
}
