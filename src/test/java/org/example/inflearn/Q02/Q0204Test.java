package org.example.inflearn.Q02;

import org.example.inflearn.Q02.Q0204;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Q0204Test {

    @Test
    void solution() {
        Q0204 sut = new Q0204();
        String expected = "1 1 2 3 5 8 13 21 34 55";

        String actual = sut.solution(10);

        assertThat(actual).isEqualTo(expected);

    }
}