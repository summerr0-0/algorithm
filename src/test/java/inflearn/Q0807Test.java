package inflearn;

import org.example.inflearn.Q0807;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class Q0807Test {

    @Test
    void solution() {
        Q0807 sut = new Q0807();

        var expected = 10;
        var result =sut.solution(5, 3);

        assertThat(expected).isEqualTo(result);
    }
}