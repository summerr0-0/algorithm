package inflearn;

import org.example.inflearn.Q0813;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Q0813Test {

    @Test
    void solution() {

        Q0813 sut = new Q0813();
        int expected;
        int actual;

        expected = 5;
        actual = sut.solution(7, new int[][]{

            {1, 1, 0, 0, 0, 1, 0},
            {0, 1, 1, 0, 1, 1, 0},
            {0, 1, 0, 0, 0, 0, 0},
            {0, 0, 0, 1, 0, 1, 1},
            {1, 1, 0, 1, 1, 0, 0},
            {1, 0, 0, 0, 1, 0, 0},
            {1, 0, 1, 0, 1, 0, 0}

        });

        assertThat(actual).isEqualTo(expected);


    }
}