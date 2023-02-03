package org.example.inflearn.Q07;

import org.example.inflearn.Q07.Q0708;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Q0708Test {

    @Test
    void solution() {
        Q0708 sut = new Q0708();
        int expected;
        int actual;

        expected = 3;
        actual = sut.solution(5,14);
        assertThat(actual).isEqualTo(expected);

        expected = 6;
        actual = sut.solution(13,35);
        assertThat(actual).isEqualTo(expected);

        expected = 4;
        actual = sut.solution(1,21);
        assertThat(actual).isEqualTo(expected);

    }
}