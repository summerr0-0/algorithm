package org.example.inflearn.Q09;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class Q0903Test {
    @Test
    void solution() {
        Q0903 sut = new Q0903();
        int expected;
        int actual;

        expected = 2;
        actual = sut.solution(Arrays.asList(
            new Q0903.Time(14, 's'),
            new Q0903.Time(18, 'e'),

            new Q0903.Time(12, 's'),
            new Q0903.Time(15, 'e'),

            new Q0903.Time(15, 's'),
            new Q0903.Time(20, 'e'),

            new Q0903.Time(20, 's'),
            new Q0903.Time(30, 'e'),

            new Q0903.Time(5, 's'),
            new Q0903.Time(14, 'e')

        ));

        assertThat(actual).isEqualTo(expected);

    }
}