package inflearn;

import org.example.inflearn.Q0607;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class Q0607Test {

    @Test
    void solution() {
        Q0607 sut = new Q0607();
        String expected;
        String actual;

        expected =
            "1 2\n" +
            "1 3\n" +
            "2 5\n" +
            "2 7\n" +
            "3 6";
        actual = sut.solution(List.of(new int[] {2,7},
            new int[] {1,3},
            new int[] {1,2},
            new int[] {2,5},
            new int[] {3,6}
            ));
        assertThat(actual).isEqualTo(expected);

    }
}