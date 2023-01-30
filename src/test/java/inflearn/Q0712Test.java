package inflearn;

import org.example.inflearn.Q0712;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Q0712Test {

    @Test
    void solution() {
        Q0712 sut = new Q0712();
        int expected;
        int actual;

        expected = 6;
        actual = sut.solution(5, new int[][]{
                {0, 0, 0, 0, 0, 0},
                {0, 0, 1, 1, 1, 0},
                {0, 1, 0, 1, 0, 1},
                {0, 0, 0, 0, 1, 0},
                {0, 0, 1, 0, 0, 1},
                {0, 0, 0, 0, 0, 0}
            });

            assertThat(actual).isEqualTo(expected);

    }
}