package org.example.inflearn.Q09;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Q0904Test {

    @Test
    void solution() {

        Q0904 sut = new Q0904();
        int expected;
        int actual;

        expected = 150;
        actual = sut.solution(6, new Q0904.Schedule[]{
            new Q0904.Schedule(50, 2),
            new Q0904.Schedule(20, 1),
            new Q0904.Schedule(40, 2),
            new Q0904.Schedule(60, 3),
            new Q0904.Schedule(30, 3),
            new Q0904.Schedule(30, 1)
        });

        assertThat(actual).isEqualTo(expected);


    }
}