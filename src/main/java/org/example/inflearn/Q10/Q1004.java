package org.example.inflearn.Q10;

public class Q1004 {
    public int solution(int N, Stone arr[]) {
        int[] dy = new int[N];
        int max = Integer.MIN_VALUE;
        //기본 값 세팅
        dy[0] = arr[0].h;

        for(int i = 1; i<N; i++){
            int h = arr[i].h;
            int wd = arr[i].wd;
            int wg = arr[i].wg;
            int tmax = 0;
            for(int j = i-1; j>=0; j--){
                //현재 wg가 더 가벼워야 하고 현재 wd가 더 작아야함
                if(arr[j].wg<= wg || arr[j].wd<wd) continue;
                tmax = Math.max(tmax,dy[j]);
            }
            if(tmax == 0) dy[i] = h;
            else dy[i] = tmax + h;
            max = Math.max(dy[i], max);
        }


        return max;
    }

    static class Stone{
        int wd,h,wg;

        public Stone(int wd, int h, int wg) {
            this.wd = wd;
            this.h = h;
            this.wg = wg;
        }
    }
}
