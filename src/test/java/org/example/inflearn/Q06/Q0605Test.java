package org.example.inflearn.Q06;

import org.example.inflearn.Q06.Q0605;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Q0605Test {

    @Test
    void solution() {

        Q0605 sut = new Q0605();
        String expected;
        String actual;

        expected = "D";
        actual = sut.solution(new int[]{20, 25, 52, 30, 39, 33, 43, 33});
        assertThat(actual).isEqualTo(expected);

    }
}