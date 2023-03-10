package org.example.inflearn.Q02;

import org.example.inflearn.Q02.Q0210;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Q0210Test {
    @Test
    void solution() {
        Q0210 sut = new Q0210();
        int expected;
        int actual;

        expected = 10;
        actual = sut.solution(new int[][]
            {
                {0, 0, 0, 0, 0, 0, 0},
                {0, 5, 3, 7, 2, 3, 0},
                {0, 3, 7, 1, 6, 1, 0},
                {0, 7, 2, 5, 3, 4, 0},
                {0, 4, 3, 6, 4, 1, 0},
                {0, 8, 7, 3, 5, 2, 0},
                {0, 0, 0, 0, 0, 0, 0}
            }
        );

        assertThat(actual).isEqualTo(expected);

        expected = 181;
        actual = sut.solution(new int[][]
            {
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 50, 51, 78, 68, 67, 97, 63, 62, 4, 92, 42, 71, 26, 48, 85, 55, 6, 85, 25, 44, 66, 90, 57, 82, 30, 72, 44, 46, 5, 16, 0},
                {0, 71, 19, 9, 40, 39, 29, 69, 82, 2, 53, 62, 89, 44, 58, 16, 90, 17, 3, 73, 82, 90, 20, 78, 65, 76, 1, 73, 6, 47, 16, 0},
                {0, 47, 67, 86, 83, 46, 47, 38, 78, 38, 63, 46, 66, 40, 6, 10, 94, 35, 92, 19, 21, 22, 69, 77, 88, 49, 1, 58, 78, 56, 83, 0},
                {0, 46, 25, 49, 95, 51, 58, 82, 12, 84, 24, 49, 66, 36, 40, 46, 43, 72, 21, 98, 8, 97, 79, 77, 30, 63, 41, 55, 97, 39, 99, 0},
                {0, 43, 61, 58, 16, 44, 35, 86, 40, 79, 95, 92, 46, 80, 56, 3, 8, 4, 83, 67, 50, 83, 52, 18, 4, 15, 33, 99, 18, 73, 83, 0},
                {0, 80, 47, 86, 50, 6, 9, 92, 93, 34, 90, 22, 8, 14, 8, 70, 1, 65, 97, 90, 99, 71, 10, 37, 84, 4, 52, 90, 65, 42, 68, 0},
                {0, 73, 65, 29, 95, 13, 52, 23, 5, 22, 75, 64, 27, 7, 82, 48, 14, 27, 4, 70, 99, 24, 16, 35, 72, 36, 62, 36, 8, 75, 71, 0},
                {0, 60, 21, 65, 13, 93, 81, 40, 81, 45, 47, 60, 26, 67, 32, 83, 38, 60, 17, 23, 43, 87, 30, 78, 43, 52, 84, 56, 16, 85, 83, 0},
                {0, 91, 79, 56, 83, 19, 4, 37, 4, 95, 41, 83, 55, 68, 26, 28, 15, 8, 12, 62, 12, 30, 24, 8, 3, 72, 79, 21, 42, 41, 12, 0},
                {0, 43, 85, 40, 69, 47, 6, 41, 49, 16, 24, 22, 26, 93, 66, 1, 27, 19, 82, 64, 64, 39, 72, 52, 64, 16, 61, 43, 75, 47, 51, 0},
                {0, 63, 84, 68, 51, 44, 45, 16, 84, 97, 66, 7, 30, 18, 10, 32, 55, 50, 48, 71, 64, 10, 70, 79, 16, 57, 47, 20, 36, 73, 34, 0},
                {0, 78, 62, 30, 5, 98, 76, 2, 27, 28, 95, 61, 37, 50, 69, 21, 27, 4, 14, 73, 14, 73, 90, 53, 97, 49, 40, 14, 57, 51, 29, 0},
                {0, 99, 13, 69, 4, 83, 82, 33, 52, 97, 54, 50, 54, 32, 19, 36, 89, 93, 91, 80, 76, 89, 49, 68, 47, 19, 26, 54, 20, 25, 86, 0},
                {0, 30, 95, 70, 56, 80, 83, 88, 61, 66, 32, 63, 23, 59, 94, 42, 36, 81, 27, 72, 39, 45, 20, 54, 85, 61, 87, 83, 97, 73, 41, 0},
                {0, 87, 93, 72, 90, 17, 91, 80, 17, 18, 56, 77, 63, 15, 46, 71, 90, 59, 16, 31, 50, 16, 26, 55, 38, 20, 22, 43, 23, 33, 34, 0},
                {0, 27, 2, 1, 39, 46, 27, 87, 70, 81, 38, 78, 52, 5, 89, 17, 59, 77, 62, 79, 91, 79, 22, 64, 98, 69, 30, 7, 60, 67, 26, 0},
                {0, 73, 13, 43, 11, 61, 60, 12, 17, 10, 28, 30, 16, 98, 69, 78, 46, 45, 46, 74, 74, 66, 60, 20, 32, 67, 49, 95, 45, 63, 6, 0},
                {0, 72, 32, 59, 30, 90, 57, 69, 56, 89, 96, 65, 86, 88, 9, 80, 31, 18, 35, 99, 82, 33, 71, 84, 60, 96, 99, 99, 28, 42, 42, 0},
                {0, 8, 1, 59, 37, 59, 36, 76, 3, 15, 67, 85, 97, 11, 88, 83, 45, 59, 66, 66, 47, 19, 60, 35, 72, 93, 67, 47, 3, 75, 71, 0},
                {0, 30, 22, 54, 93, 48, 98, 25, 32, 16, 61, 29, 32, 34, 15, 94, 30, 22, 66, 30, 37, 93, 7, 33, 92, 31, 78, 21, 57, 34, 85, 0},
                {0, 31, 34, 50, 99, 85, 62, 86, 70, 57, 78, 2, 52, 38, 100, 89, 38, 5, 60, 49, 94, 59, 77, 89, 61, 49, 46, 50, 31, 28, 42, 0},
                {0, 40, 79, 51, 25, 35, 35, 45, 60, 78, 98, 7, 46, 31, 42, 34, 83, 69, 82, 52, 45, 21, 92, 41, 22, 2, 92, 92, 6, 92, 90, 0},
                {0, 39, 73, 11, 19, 99, 71, 61, 2, 83, 74, 83, 24, 72, 67, 7, 78, 9, 1, 40, 60, 91, 74, 62, 5, 72, 80, 5, 69, 68, 11, 0},
                {0, 32, 84, 76, 36, 76, 65, 23, 21, 71, 11, 41, 29, 54, 86, 66, 23, 42, 13, 50, 42, 34, 79, 95, 24, 75, 88, 12, 59, 98, 94, 0},
                {0, 98, 87, 50, 95, 97, 85, 30, 68, 87, 43, 57, 26, 97, 53, 66, 16, 86, 16, 54, 49, 15, 93, 68, 72, 18, 52, 1, 5, 21, 38, 0},
                {0, 64, 62, 55, 12, 39, 78, 56, 49, 50, 76, 71, 25, 12, 51, 93, 78, 52, 40, 45, 67, 38, 65, 28, 20, 54, 1, 29, 41, 23, 68, 0},
                {0, 91, 34, 52, 65, 57, 51, 95, 69, 11, 55, 43, 1, 36, 75, 8, 3, 71, 68, 68, 12, 69, 84, 60, 86, 39, 49, 55, 92, 84, 58, 0},
                {0, 30, 34, 46, 31, 61, 88, 42, 23, 21, 12, 76, 69, 71, 16, 92, 84, 52, 76, 37, 62, 29, 16, 4, 62, 28, 10, 1, 49, 99, 65, 0},
                {0, 16, 90, 86, 2, 78, 85, 20, 10, 61, 98, 30, 100, 9, 25, 54, 84, 64, 1, 65, 45, 65, 2, 7, 94, 41, 51, 24, 55, 34, 23, 0},
                {0, 100, 62, 75, 78, 62, 53, 39, 88, 8, 7, 77, 34, 38, 69, 25, 96, 33, 33, 29, 26, 2, 59, 94, 26, 95, 88, 87, 49, 69, 77, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}


            }
        );

        assertThat(actual).isEqualTo(expected);

    }
}