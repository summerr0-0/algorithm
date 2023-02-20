package org.example.inflearn.Q08;

public class Q0803 {
    int maxScore = 0;
    int timeLimit=0;
    int[][] questions;

    public int solution(int M, int[][] input){
        questions = input;
        timeLimit = M;
        dfs(-1,0,0);
        return maxScore;
    }

    private void dfs(int depth, int time, int score){
        if(time>timeLimit) return;
        maxScore = Math.max(score,maxScore);
        if(depth == questions.length-1) return;

        dfs(depth+1,time+questions[depth+1][1],score+questions[depth+1][0]);
        dfs(depth+1,time,score);
    }
}
