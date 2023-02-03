package org.example.inflearn.Q09;

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Q0905 {
    public String solution(List<List<Edge>> graph) {
        int[] distance = new int[graph.size()];
        Arrays.fill(distance, Integer.MAX_VALUE);

        Queue<Edge> queue = new PriorityQueue<>();
        queue.add(new Edge(1, 0));
        distance[0] = 0;
        distance[1] = 0;

        while (queue.size() > 0) {
            Edge now = queue.poll();
            int nowV = now.vex;
            int nowC = now.cost;

            if (nowC > distance[nowV]) continue;

            for (Edge e : graph.get(nowV)) {
                int needC = now.cost + e.cost;
                if (distance[e.vex] > needC) {
                    distance[e.vex] = needC;
                    queue.add(new Edge(e.vex, needC));
                }
            }

        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<distance.length;i++){
            if (distance[i] == 0) continue;
            sb.append(i);
            sb.append(" : ");
            String word = distance[i] == Integer.MAX_VALUE ? "impossible" : String.valueOf(distance[i]);
            sb.append(word);
            sb.append("\n");
        }

        sb.deleteCharAt(sb.length()-1);

        return sb.toString();
    }

    static class Edge implements Comparable<Edge> {
        int vex, cost;

        public Edge(int vex, int cost) {
            this.vex = vex;
            this.cost = cost;
        }

        @Override
        public int compareTo(Edge o) {
            return this.cost - o.cost;
        }
    }
}
