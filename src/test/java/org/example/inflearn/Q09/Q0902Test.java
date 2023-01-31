package org.example.inflearn.Q09;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Q0902Test {

    @Test
    void solution() {
        Q0902 sut = new Q0902();

        int expected;
        int actual;

        expected = 3;
        actual = sut.solution(5, new Q0902.Reservation[]{
            new Q0902.Reservation(1, 4),
            new Q0902.Reservation(2, 3),
            new Q0902.Reservation(3, 5),
            new Q0902.Reservation(4, 6),
            new Q0902.Reservation(5, 7)
        });

        assertThat(actual).isEqualTo(expected);

        expected = 2;
        actual = sut.solution(3, new Q0902.Reservation[]{
            new Q0902.Reservation(3, 3),
            new Q0902.Reservation(1, 3),
            new Q0902.Reservation(2, 3)
        });

        assertThat(actual).isEqualTo(expected);

    }
}