package org.example.inflearn.Q03;

import org.example.inflearn.Q03.Q0305;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Q0305Test {

    @Test
    void solution() {
        Q0305 sut = new Q0305();
        int expected;
        int actual;

        expected = 3;
        actual = sut.solution(15);
        assertThat(actual).isEqualTo(expected);

    }
}