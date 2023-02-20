package org.example.inflearn.Q08;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Q0805Test {

    @Test
    void solution() {
        Q0805 sut = new Q0805();
        int expected;
        int actual;

        expected = 3;
        actual = sut.solution(new int[]{1, 2, 5}, 15);

        assertThat(actual).isEqualTo(expected);

    }
}