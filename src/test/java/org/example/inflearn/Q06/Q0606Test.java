package org.example.inflearn.Q06;

import org.example.inflearn.Q06.Q0606;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Q0606Test {

    @Test
    void solution() {
        Q0606 sut = new Q0606();
        String expected;
        String actual;

        expected = "3 8";
        actual = sut.solution(9,new int[]{120 ,125, 152, 130, 135, 135 ,143, 127, 160});

        assertThat(actual).isEqualTo(expected);

    }
}