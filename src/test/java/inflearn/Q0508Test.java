package inflearn;

import org.example.inflearn.Q0508;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Q0508Test {

    @Test
    void solution() {
        Q0508 sut = new Q0508();
        int expected;
        int actual;

        expected = 4;
        actual = sut.solution(6, 3, new int[]{70, 60, 90, 60, 60, 60});

        assertThat(actual).isEqualTo(expected);

    }
}