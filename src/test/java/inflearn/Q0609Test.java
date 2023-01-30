package inflearn;

import org.example.inflearn.Q0609;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Q0609Test {

    @Test
    void solution() {
        Q0609 sut = new Q0609();
        int expected;
        int actual;

        expected = 17;
        actual = sut.solution(9, 3, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});

        assertThat(actual).isEqualTo(expected);

    }
}