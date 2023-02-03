package org.example.inflearn.Q09;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Q0905Test {
    List<List<Q0905.Edge>> list;

    @BeforeEach
    void init(){
        list = new ArrayList<>();
        for(int i = 0; i< 7; i++){
            list.add(new ArrayList<>());
        }
        list.get(1).add(new Q0905.Edge(2,12));
        list.get(1).add(new Q0905.Edge(3,4));
        list.get(2).add(new Q0905.Edge(1,2));
        list.get(2).add(new Q0905.Edge(3,5));
        list.get(2).add(new Q0905.Edge(5,5));
        list.get(3).add(new Q0905.Edge(4,5));
        list.get(4).add(new Q0905.Edge(2,2));
        list.get(4).add(new Q0905.Edge(5,5));
        list.get(6).add(new Q0905.Edge(5,5));
    }

    @Test
    void solution() {
        Q0905 sut = new Q0905();
        String expected = "2 : 11\n3 : 4\n4 : 9\n5 : 14\n6 : impossible";
        String actual = sut.solution(list);

        assertThat(actual).isEqualTo(expected);

    }
}