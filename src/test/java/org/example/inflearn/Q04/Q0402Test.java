package org.example.inflearn.Q04;

import org.example.inflearn.Q04.Q0402;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Q0402Test {

    @Test
    void solution() {
        Q0402 sut = new Q0402();
        String expected;
        String actual;

        expected = "YES";
        actual =  sut.solution("AbaAeCe","baeeACA");
        assertThat(actual).isEqualTo(expected);

        expected = "NO";
        actual =  sut.solution("abaCC","Caaab");
        assertThat(actual).isEqualTo(expected);

    }
}