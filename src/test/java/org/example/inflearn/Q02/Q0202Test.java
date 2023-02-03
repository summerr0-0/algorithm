package org.example.inflearn.Q02;

import org.example.inflearn.Q02.Q0202;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Q0202Test {

    @Test
    void solution() {
        Q0202 sut = new Q0202();
        int expected = 5;

        int actual = sut.solution(new int[] {130, 135, 148, 140, 145, 150, 150, 153});

        assertThat(actual).isEqualTo(expected);

    }
}