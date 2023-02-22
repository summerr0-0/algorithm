package org.example.backjoon;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Q22858Test {

    @Test
    void solution() {
        Q22858 sut = new Q22858();
        int[] expected;
        int[] actual;

        expected = new int[]{1, 4, 5, 3, 2};
        actual = sut.solution(
            5,
            2,
            new int[]{4, 1, 3, 5, 2},
            new int[]{4, 3, 1, 2, 5}
        );

        assertThat(actual).isEqualTo(expected);

        expected = new int[]{1, 2, 3, 4};
        actual = sut.solution(
            4,
            1,
            new int[]{4, 3, 2, 1},
            new int[]{4, 3, 2, 1}
        );

        assertThat(actual).isEqualTo(expected);

    }
}