package org.example.inflearn.Q05;

import org.example.inflearn.Q05.Q0505;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Q0505Test {

    @Test
    void solution() {
        Q0505 sut = new Q0505();
        int expected;
        int actual;

        expected = 17;
        actual = sut.solution("()(((()())(())()))(())");
        assertThat(actual).isEqualTo(expected);

        expected = 24;
        actual = sut.solution("(((()(()()))(())()))(()())");
        assertThat(actual).isEqualTo(expected);

    }
}