package inflearn;

import org.example.inflearn.Q0802;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Q0802Test {

    @Test
    void solution() {
        Q0802 sut = new Q0802();
        int expected;
        int actual;

        expected = 242;
        actual = sut.solution(259,new int[]{81, 58, 42, 33, 61});
        assertThat(actual).isEqualTo(expected);

    }
}