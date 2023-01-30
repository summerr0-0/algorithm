package inflearn;

import org.example.inflearn.Q0401;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Q0401Test {

    @Test
    void solution() {

        Q0401 sut = new Q0401();
        String expected ="C";
        String actual = sut.solution("BACBACCACCBDEDE");

        assertThat(actual).isEqualTo(expected);

    }
}