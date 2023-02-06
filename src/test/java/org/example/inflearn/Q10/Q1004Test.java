package org.example.inflearn.Q10;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Q1004Test {

    @Test
    void solution() {
        Q1004 sut = new Q1004();
        int expected;
        int actual;

//        expected = 10;
//        actual = sut.solution(5,new Q1004.Stone[] {
//            new Q1004.Stone(25,3,4),
//            new Q1004.Stone(4,4,6),
//            new Q1004.Stone(9,2,3),
//            new Q1004.Stone(16,2,5),
//            new Q1004.Stone(1,5,2),
//        });
//        assertThat(actual).isEqualTo(expected);

        expected = 443;
        actual = sut.solution(10,
            new Q1004.Stone[] {
                new Q1004.Stone(114, 96 ,290),
                new Q1004.Stone(65, 74 ,201),
                new Q1004.Stone(261, 19 ,105),
                new Q1004.Stone(181, 60 ,275),
                new Q1004.Stone(90, 145 ,254),
                new Q1004.Stone(286, 118 ,64),
                new Q1004.Stone(16, 24 ,205),
                new Q1004.Stone(288, 128 ,299),
                new Q1004.Stone(96, 36 ,74),
                new Q1004.Stone(182, 5 ,35)
        });

        assertThat(actual).isEqualTo(expected);

        expected = 3296;
        actual = sut.solution(50,
            new Q1004.Stone[] {
                new Q1004.Stone(251, 260, 401),
                new Q1004.Stone(346, 544, 198),
                new Q1004.Stone(380, 353, 276),
                new Q1004.Stone(292, 407, 83),
                new Q1004.Stone(406, 547, 92),
                new Q1004.Stone(315, 283, 56),
                new Q1004.Stone(375, 505, 403),
                new Q1004.Stone(471, 140, 314),
                new Q1004.Stone(102, 100, 145),
                new Q1004.Stone(81, 384, 285),
                new Q1004.Stone(95, 189, 423),
                new Q1004.Stone(93, 167, 59),
                new Q1004.Stone(356, 497, 360),
                new Q1004.Stone(165, 179, 238),
                new Q1004.Stone(451, 80, 371),
                new Q1004.Stone(212, 423, 329),
                new Q1004.Stone(55, 158, 97),
                new Q1004.Stone(428, 138, 100),
                new Q1004.Stone(154, 103, 380),
                new Q1004.Stone(173, 167, 316),
                new Q1004.Stone(447, 325, 408),
                new Q1004.Stone(50, 226, 412),
                new Q1004.Stone(122, 281, 317),
                new Q1004.Stone(394, 65, 358),
                new Q1004.Stone(382, 409, 58),
                new Q1004.Stone(167, 239, 311),
                new Q1004.Stone(98, 171, 144),
                new Q1004.Stone(437, 264, 147),
                new Q1004.Stone(450, 135, 310),
                new Q1004.Stone(454, 258, 53),
                new Q1004.Stone(417, 232, 143),
                new Q1004.Stone(427, 360, 250),
                new Q1004.Stone(300, 345, 249),
                new Q1004.Stone(319, 50, 378),
                new Q1004.Stone(68, 82, 232),
                new Q1004.Stone(473, 389, 279),
                new Q1004.Stone(324, 486, 268),
                new Q1004.Stone(385, 186, 110),
                new Q1004.Stone(390, 323, 114),
                new Q1004.Stone(186, 318, 291),
                new Q1004.Stone(384, 454, 244),
                new Q1004.Stone(341, 315, 252),
                new Q1004.Stone(115, 82, 320),
                new Q1004.Stone(123, 157, 404),
                new Q1004.Stone(318, 463, 366),
                new Q1004.Stone(143, 512, 89),
                new Q1004.Stone(354, 280, 348),
                new Q1004.Stone(92, 274, 312),
                new Q1004.Stone(192, 185, 277),
                new Q1004.Stone(405, 433, 241)

        });

        assertThat(actual).isEqualTo(expected);

    }
}