package org.example.inflearn.Q02;

import org.example.inflearn.Q02.Q0205;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Q0205Test {

    @Test
    void solution() {
        Q0205 sut = new Q0205();

        int expected = 8;
        int actual = sut.solution(20);
        assertThat(actual).isEqualTo(expected);

        expected = 17984;
        actual = sut.solution(200000);
        assertThat(actual).isEqualTo(expected);


        expected = 9592;
        actual = sut.solution(100000);
        assertThat(actual).isEqualTo(expected);
    }
}