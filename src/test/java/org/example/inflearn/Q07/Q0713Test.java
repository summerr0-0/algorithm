package org.example.inflearn.Q07;

import org.example.inflearn.Q07.Q0713;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class Q0713Test {

    @Test
    void solution() {
        Q0713 sut = new Q0713();
        int expected;
        int actual;

        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i <= 5; i++) {
            list.add(new ArrayList<Integer>());
        }

        list.get(1).add(2);
        list.get(1).add(3);
        list.get(1).add(4);
        list.get(2).add(1);
        list.get(2).add(3);
        list.get(2).add(5);
        list.get(3).add(4);
        list.get(4).add(2);
        list.get(4).add(5);

        expected = 6;

        actual = sut.solution(5, list);

        assertThat(actual).isEqualTo(expected);

    }
}