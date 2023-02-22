package org.example.backjoon;

import java.util.List;

public class Q2118 {
    public int[] solution(int[] s, List<int[]> list) {
        for (int[] l : list) {
            int lightCase = l[0];
            switch (lightCase) {
                case 1:
                    caseOne(l[1]-1, l[2], s);
                    break;
                case 2:
                    caseTwo(l[1]-1, l[2]-1, s);
                    break;
                case 3:
                    caseThree(l[1]-1, l[2]-1, s);
                    break;
                case 4:
                    caseFour(l[1]-1, l[2]-1, s);
                    break;
            }

        }
        return s;

    }

    private int[] caseOne(int idx, int status, int[] arr) {
        if (status == 1) turnOn(arr, new int[]{idx});

        if (status == 0) turnOff(arr, new int[]{idx});

        return arr;
    }

    private int[] caseTwo(int start, int end, int[] arr) {
        for (int i = start; i <= end; i++) {
            arr[i] = arr[i] == 1 ? 0 : 1;
        }
        return arr;
    }

    private int[] caseThree(int start, int end, int[] arr) {
        int[] idxs = new int[end - start +1];
        for (int i = 0; i < idxs.length; i++) {
            idxs[i] = start++;
        }
        turnOff(arr, idxs);
        return arr;
    }

    private int[] caseFour(int start, int end, int[] arr) {
        int[] idxs = new int[end - start +1] ;
        for (int i = 0; i < idxs.length; i++) {
            idxs[i] = start++;
        }
        turnOn(arr, idxs);
        return arr;
    }

    private int[] turnOn(int[] arr, int[] idxs) {
        for (int i : idxs) {
            arr[i] = 1;
        }
        return arr;
    }

    private int[] turnOff(int[] arr, int[] idxs) {
        for (int i : idxs) {
            arr[i] = 0;
        }
        return arr;
    }

}
