package org.example.inflearn;

import com.sun.source.tree.Tree;

import java.sql.Time;
import java.util.Arrays;

//그리디 :: 정렬
public class Q0902 {

    public int solution(int N, Reservation[] arr) {
        int count = 0;
        Arrays.sort(arr);
        int endTime = 0;
        for(Reservation r : arr){
            if(r.start >= endTime){
                count++;
                endTime = r.end;
            }
        }
        return count;
    }

    static class Reservation implements Comparable<Reservation> {
        private final int start, end;

        public Reservation(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public int compareTo(Reservation o) {
            if (this.end == o.end) return this.start - o.start;
            return o.end - this.end;
        }
    }
}
