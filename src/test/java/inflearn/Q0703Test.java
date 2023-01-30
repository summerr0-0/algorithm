package inflearn;

import org.example.inflearn.Q0703;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Q0703Test {

    @Test
    void solution() {
        Q0703 sut = new Q0703();
        int expected;
        int actual;

        expected = 120;
        actual = sut.solution(5);

        assertThat(actual).isEqualTo(expected);

    }
}