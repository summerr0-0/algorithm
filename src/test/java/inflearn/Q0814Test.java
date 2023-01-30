package inflearn;

import org.example.inflearn.Q0814;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Q0814Test {

    @Test
    void solution() {

        Q0814 sut = new Q0814();
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