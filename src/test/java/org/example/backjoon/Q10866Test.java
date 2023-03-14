package org.example.backjoon;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Q10866Test {

    @Test
    void solution() {
        Q10866 sut = new Q10866();
        String expected;
        String actual;

        actual = sut.solution(new String[]{
            "push_back 1",
            "push_front 2",
            "front",
            "back",
            "size",
            "empty",
            "pop_front",
            "pop_back",
            "pop_front",
            "size",
            "empty",
            "pop_back",
            "push_front 3",
            "empty",
            "front",

        });

        expected = "2\n" +
            "1\n" +
            "2\n" +
            "0\n" +
            "2\n" +
            "1\n" +
            "-1\n" +
            "0\n" +
            "1\n" +
            "-1\n" +
            "0\n" +
            "3\n";

        assertThat(actual).isEqualTo(expected);

    }
}