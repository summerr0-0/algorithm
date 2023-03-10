package org.example.inflearn.Q04;

import org.example.inflearn.Q04.Q0403;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Q0403Test {

    @Test
    void solution() {

        Q0403 sut = new Q0403();
        String expected = "3 4 4 3";
        String actual = sut.solution(7, 4, new int[]{20, 12, 20, 10, 23, 17, 10});

        assertThat(actual).isEqualTo(expected);

    }
}