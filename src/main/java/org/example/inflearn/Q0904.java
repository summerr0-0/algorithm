package org.example.inflearn;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

//그리디 :: Peiority Queue
public class Q0904 {
    public int solution(int n, Schedule[] time) {

        int answer = 0;
        Queue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());

        Arrays.sort(time);
        int max = time[0].day;

        int j = 0;
        //날짜를 감소시킨다
        for (int i = max; i >= 1; i--) {
            //날짜 범위에 맞는 배열을 넣는다
            for (; j < n; j++) {
                if (time[j].day < i) break;
                queue.add(time[j].money);
            }
            //큐가 비어잇지 않으면 저장
            if (!queue.isEmpty()) {
                int z = queue.poll();
                System.out.println(z);
                answer += z;
            }
        }
        return answer;
    }


    static class Schedule implements Comparable<Schedule> {
        int money, day;

        public Schedule(int money, int day) {
            this.money = money;
            this.day = day;
        }

        @Override
        public int compareTo(Schedule o) {
            return o.day - this.day;
        }
    }

}
