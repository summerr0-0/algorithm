package org.example.inflearn.Q10;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Q1002Test {
    @Test
    void Solution() {
        Q1002 sut = new Q1002();
        int expected;
        int actual;

        expected = 34;
        actual = sut.solution(7);
        assertThat(actual).isEqualTo(expected);

    }
}