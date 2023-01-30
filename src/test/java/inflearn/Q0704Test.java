package inflearn;

import org.example.inflearn.Q0704;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Q0704Test {

    @Test
    void solution() {
        Q0704 sut = new Q0704();
        String expected = "1 1 2 3 5 8 13 21 34 55";
        String actual = sut.solution(10);

        assertThat(actual).isEqualTo(expected);

    }
}