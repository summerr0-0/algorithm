package org.example.inflearn.Q10;

import java.util.Arrays;

public class Q1004 {
    public int solution(int N, Stone[] arr) {
        int[] dy = new int[N];
        Arrays.sort(arr);

        //기본 값 세팅
        dy[0] = arr[0].h;
        int max = dy[0];


        for(int i = 1; i<arr.length; i++){
            int h = arr[i].h;
            int wg = arr[i].wg;
            int tmax = 0;
            for(int j = i-1; j>=0; j--){
                //현재 wg가 더 가벼워야 함
                if(arr[j].wg > wg && dy[j] > tmax) tmax = dy[j];
            }
            dy[i] = tmax + h;
            max = Math.max(dy[i], max);
        }

        return max;
    }

    static class Stone implements Comparable<Stone>{
        int wd,h,wg;

        public Stone(int wd, int h, int wg) {
            this.wd = wd;
            this.h = h;
            this.wg = wg;
        }

        @Override
        public int compareTo(Stone o) {
            return o.wd - this.wd;
        }
    }
}
