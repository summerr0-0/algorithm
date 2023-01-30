package inflearn;

import org.example.inflearn.Q0811;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Q0811Test {

    @Test
    void solution() {
        Q0811 sut = new Q0811();
        int expected = 12;
        int actual = sut.solution(new int[][]{
            {0, 0, 0, 0, 0, 0, 0},
            {0, 1, 1, 1, 1, 1, 0},
            {0, 0, 0, 1, 0, 0, 0},
            {1, 1, 0, 1, 0, 1, 1},
            {1, 1, 0, 1, 0, 0, 0},
            {1, 0, 0, 0, 1, 0, 0},
            {1, 0, 1, 0, 0, 0, 0},
        });

        assertThat(actual).isEqualTo(expected);

    }
}