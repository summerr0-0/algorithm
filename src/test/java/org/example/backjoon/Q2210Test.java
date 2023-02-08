package org.example.backjoon;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Q2210Test {

    @Test
    void solution() {
        Q2210 sut = new Q2210();
        int expected = 15;
        int actual = sut.solution(new int[][]{
            {1, 1, 1, 1, 1},
            {1, 1, 1, 1, 1},
            {1, 1, 1, 1, 1},
            {1, 1, 1, 2, 1},
            {1, 1, 1, 1, 1},
        });

        assertThat(actual).isEqualTo(expected);

    }
}