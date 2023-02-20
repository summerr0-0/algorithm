package org.example.inflearn.Q08;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Q0804Test {

    @Test
    void solution() {
        Q0804 sut = new Q0804();
        String expected =
            "1 1\n" +
                "1 2\n" +
                "1 3\n" +
                "2 1\n" +
                "2 2\n" +
                "2 3\n" +
                "3 1\n" +
                "3 2\n" +
                "3 3\n";
        String actual = sut.solution(3, 2);

        System.out.println(actual);

        assertThat(expected).isEqualTo(actual);


    }
}