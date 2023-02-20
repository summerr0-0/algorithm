package org.example.inflearn.Q08;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Q0803Test {

    @Test
    void solution() {
        Q0803 sut = new Q0803();
        int expected;
        int actual;

        expected = 41;
        actual = sut.solution(20, new int[][]{
            {10, 5},
            {25, 12},
            {15, 8},
            {6, 3},
            {7, 4}
        });
        assertThat(actual).isEqualTo(expected);


        expected = 141;
        actual = sut.solution(70, new int[][]{
            {12, 70},
            {5, 2},
            {11, 5},
            {12, 7},
            {16, 8},
            {20, 10},
            {30, 15},
            {10, 5},
            {25, 12},
            {15, 8},
            {6, 3},
            {7, 4},
            {3, 2}
        });

        assertThat(actual).isEqualTo(expected);

        expected = 252;
        actual = sut.solution(150, new int[][]{
            {19, 150},
            {16, 11},
            {20, 16},
            {11, 6},
            {5, 2},
            {11, 5},
            {12, 7},
            {16, 8},
            {20, 10},
            {30, 15},
            {10, 5},
            {25, 12},
            {15, 8},
            {6, 3},
            {7, 4},
            {3, 2},
            {8, 5},
            {9, 12},
            {19, 11},
            {9, 6}
        });

        assertThat(actual).isEqualTo(expected);

    }
}