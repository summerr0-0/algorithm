package org.example.backjoon;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.InstanceOfAssertFactories.atomicIntegerFieldUpdater;
import static org.junit.jupiter.api.Assertions.*;

class Q2118Test {

    @Test
    void solution() {
        Q2118 sut = new Q2118();
        int[] expected;
        int[] actual;


        expected = new int[]{0, 0, 1, 0, 0, 0, 0, 0};
        actual = sut.solution(new int[]{0, 0, 0, 0, 0, 0, 0, 0},
            Arrays.asList(
                new int[]{1, 2, 1},
                new int[]{1, 4, 1},
                new int[]{2, 2, 4}
            ));

        assertThat(actual).isEqualTo(expected);

        expected = new int[]{1, 1, 0, 1, 1, 1, 0, 0};
        actual = sut.solution(new int[]{0, 0, 0, 0, 0, 0, 0, 0},
            Arrays.asList(
                new int[]{1, 2, 1},
                new int[]{1, 4, 1},
                new int[]{2, 2, 4},
                new int[]{2, 1, 7},
                new int[]{3, 5, 8},
                new int[]{4, 4, 6}
            ));

        assertThat(actual).isEqualTo(expected);

    }
}