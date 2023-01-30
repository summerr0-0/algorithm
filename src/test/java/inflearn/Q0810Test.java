package inflearn;

import org.example.inflearn.Q0810;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Q0810Test {

    @Test
    void solution() {
        Q0810 sut = new Q0810();
        int expected;
        int actual;

        expected = 8;
        actual = sut.solution(new int[][]{
            {0, 0, 0, 0, 0, 0, 0},
            {0, 1, 1, 1, 1, 1, 0},
            {0, 0, 0, 1, 0, 0, 0},
            {1, 1, 0, 1, 0, 1, 1},
            {1, 1, 0, 0, 0, 0, 1},
            {1, 1, 0, 1, 1, 0, 0},
            {1, 0, 0, 0, 0, 0, 0},
        });

        assertThat(actual).isEqualTo(expected);

    }
}