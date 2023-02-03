package org.example.inflearn.Q10;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Q1004Test {

    @Test
    void solution() {
        Q1004 sut = new Q1004();
        int expected;
        int actual;

        expected = 10;
        actual = sut.solution(5,new Q1004.Stone[] {
            new Q1004.Stone(25,3,4),
            new Q1004.Stone(4,4,6),
            new Q1004.Stone(9,2,3),
            new Q1004.Stone(16,2,5),
            new Q1004.Stone(1,5,2),
        });

        assertThat(actual).isEqualTo(expected);

    }
}