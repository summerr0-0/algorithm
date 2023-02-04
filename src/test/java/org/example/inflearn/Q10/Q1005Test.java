package org.example.inflearn.Q10;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Q1005Test {

    @Test
    void solution() {
        Q1005 sut = new Q1005();
        int expected;
        int actual;

        expected = 3;
        actual = sut.solution(3, new int[]{1, 2, 5}, 15);

        assertThat(actual).isEqualTo(expected);

    }
}