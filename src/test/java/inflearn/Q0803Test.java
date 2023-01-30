package inflearn;

import org.example.inflearn.Q0803;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Q0803Test {

    @Test
    void solution() {
        Q0803 sut = new Q0803();
        int expected;
        int actual;

        expected = 41;
        actual = sut.solution(5, 20,
            new int[][]{
                {10, 5}, {25, 12}, {15, 8}, {6, 3}, {7, 4}});
        assertThat(actual).isEqualTo(expected);

    }
}