package org.example.inflearn.Q01;

import org.example.inflearn.Q01.Q0109;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Q0109Test {

    @Test
    void solution() {
        Q0109 sut = new Q0109();
        int result = sut.solution("g0en2T0s8eSoft");
        assertThat(result).isEqualTo(208);
    }
}