package org.example.inflearn.Q10;


public class Q1003 {
    public int solution(int N, int arr[]) {
        int[] dy = new int[N];
        int max = Integer.MIN_VALUE;
        //기본 값 세팅
        dy[0] = 1;

        for (int i = 1; i < arr.length; i++) {
            int num = arr[i];
            int tmax = 0;
            //이전 값들 중에서 가장 큰 부분 증가 수열이 될 대상 찾기
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] < num) tmax = Math.max(dy[j], tmax);
                dy[i] = tmax + 1;
                max = Math.max(dy[i], max);
            }
        }

        return max;
    }
}
