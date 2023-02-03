package org.example.inflearn.Q05;

import java.util.LinkedList;
import java.util.Queue;

public class Q0506 {
    public int solution(int n, int k) {
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }
        int count = 1;
        while (queue.size() > 1) {
            int poll = queue.poll();
            if (count == k) {
                count = 1;
                continue;
            }
            queue.add(poll);
            count++;
        }

        return queue.poll();
    }
}
