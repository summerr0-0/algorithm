package inflearn;

import org.example.inflearn.Q0502;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Q0502Test {

    @Test
    void solution() {
        Q0502 sut = new Q0502();
        String expected;
        String actual;

        expected = "EFLM";
        actual = sut.solution("(A(BC)D)EF(G(H)(IJ)K)LM(N)");
        assertThat(actual).isEqualTo(expected);

    }
}