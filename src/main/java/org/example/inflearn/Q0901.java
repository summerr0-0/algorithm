package org.example.inflearn;

import java.util.Arrays;
//그리디 :: 정렬
public class Q0901 {

    public int solution(int N, Body[] array) {

        Body[] athletes = Arrays.stream(array).sorted((o1, o2) -> {
            if (o1.height < o2.height) return 1;
            return -1;
        }).toArray(Body[]::new);

        int max = athletes[0].weight;
        int count = 1;
        for(int i = 1; i< N; i++){
            if(max<athletes[i].weight) {
                count++;
                max = athletes[i].weight;
            }
        }
        return count;
    }

    static class Body {
        private final int height, weight;

        public Body(int height, int weight) {
            this.height = height;
            this.weight = weight;
        }

    }
}
