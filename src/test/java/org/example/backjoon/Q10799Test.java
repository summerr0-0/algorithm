package org.example.backjoon;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Q10799Test {
    @Test
    void solution() {
        Q10799 sut = new Q10799();
        int expected = 17;
        int actual = sut.solution("()(((()())(())()))(())");
        assertThat(actual).isEqualTo(expected);

        expected = 24;
        actual = sut.solution("(((()(()()))(())()))(()())");

        assertThat(actual).isEqualTo(expected);

    }
}