package org.example.inflearn.Q10;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Q1003Test {

    @Test
    void solution() {
        Q1003 sut = new Q1003();
        int expected;
        int actual;

        actual = sut.solution(19, new int[] {5, 2, 18, 3, 4, 7, 10, 9, 11, 8, 15 });
        expected = 7;
        assertThat(actual).isEqualTo(expected);

        actual = sut.solution(9, new int[] {2,7,5,8,6,4,7,12,3});
        expected = 5;
        assertThat(actual).isEqualTo(expected);

//        actual = sut.solution(8, new int[] {5,3,7,8,6,2,9,4});
//        expected = 4;
//        assertThat(actual).isEqualTo(expected);

    }
}