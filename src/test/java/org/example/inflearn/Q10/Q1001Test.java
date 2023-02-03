package org.example.inflearn.Q10;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Q1001Test {

    @Test
    void solution() {
        Q1001 sut = new Q1001();
        int expected;
        int actual;

        expected = 5;
        actual = sut.solution(4);
        assertThat(actual).isEqualTo(expected);

        expected = 21;
        actual = sut.solution(7);
        assertThat(actual).isEqualTo(expected);

    }
}