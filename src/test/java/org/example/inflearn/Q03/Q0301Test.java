package org.example.inflearn.Q03;

import org.example.inflearn.Q03.Q0301;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Q0301Test {

    @Test
    void solution() {
        Q0301 sut = new Q0301();
        int[] expected;
        int[] actual;

        expected = new int[]{1, 2, 3, 3, 5, 6, 7, 9};
        actual = sut.solution(3,5,new int[]{1, 3, 5}, new int[]{2, 3, 6, 7, 9});
        assertThat(actual).isEqualTo(expected);

    }
}