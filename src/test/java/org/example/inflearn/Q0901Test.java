package org.example.inflearn;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Q0901Test {

    @Test
    void solution() {
        Q0901 sut = new Q0901();
        int expected;
        int actual;

        expected = 3;
        actual = sut.solution(5, new Q0901.Body[]{
            new Q0901.Body(172, 67),
            new Q0901.Body(183, 65),
            new Q0901.Body(180, 70),
            new Q0901.Body(170, 72),
            new Q0901.Body(181, 60),

        });

        assertThat(actual).isEqualTo(expected);

        expected = 3;
        actual = sut.solution(15, new Q0901.Body[]{
            new Q0901.Body(192, 117),
            new Q0901.Body(190, 110),
            new Q0901.Body(184, 98),
            new Q0901.Body(212, 91),
            new Q0901.Body(177, 89),
            new Q0901.Body(218, 78),
            new Q0901.Body(152, 106),
            new Q0901.Body(182, 64),
            new Q0901.Body(193, 88),
            new Q0901.Body(198, 71),
            new Q0901.Body(216, 111),
            new Q0901.Body(155, 101),
            new Q0901.Body(181, 92),
            new Q0901.Body(173, 77),
            new Q0901.Body(215, 97)
        });
        assertThat(actual).isEqualTo(expected);


    }
}