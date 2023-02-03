package org.example.inflearn.Q03;

import org.example.inflearn.Q03.Q0303;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Q0303Test {

    @Test
    void solution() {
        Q0303 sut = new Q0303();
        int expected;
        int actual;

        expected = 56;
        actual = sut.solution(10, 3,
            new int[]{12, 15, 11, 20, 25, 10, 20, 19, 13, 15});

        assertThat(actual).isEqualTo(expected);

    }
}