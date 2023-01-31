package org.example.inflearn.Q09;

import java.util.Collections;
import java.util.List;

//그리디 :: 정쇼
public class Q0903 {
    public int solution(List<Time> list) {

        Collections.sort(list);

        int cnt = 0;
        int max = 0;
        for (Time t : list) {
            if (t.type == 'e') cnt--;
            else {
                cnt++;
                max = Math.max(cnt, max);
            }
        }
        return max;
    }

    static class Time implements Comparable<Time> {
        int n;
        char type;

        public Time(int n, char type) {
            this.n = n;
            this.type = type;
        }

        @Override
        public int compareTo(Time o) {
            if (this.n == o.n) return this.type - o.type;
            return this.n - o.n;
        }
    }


}
