package org.example.inflearn.Q10;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Q1006Test {

    @Test
    void solution() {
        Q1006 sut = new Q1006();
        int expected = 41;
        int actual = sut.solution(5,20,new int[][]{
            {10,5},
            {25,12},
            {15,8},
            {6,3},
            {7,4},
        });

        assertThat(actual).isEqualTo(expected);

    }
}