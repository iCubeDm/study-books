package com.icubedm.study_tasks.interview;

import java.util.stream.IntStream;

public class FirstUntouched {


    public static void main(String[] args) {

        System.out.println(solution());
    }

    private static int solution() {
        int[] A = {1, 3, 6, 4, 1};
        int[] SORT = IntStream.rangeClosed(1, 10).toArray();
        if (A == null || A.length == 0)
            throw new RuntimeException("Wrong input");

        for (int i : A) { // O(N) - N complexity
            if (i > 0) {
                SORT[i - 1] = 0;
            }
        }

        for (int i : SORT) {    // O(C) - constant complexity
            if (i != 0) return i;
        }
        return 1;

        // O(N+C) complexity reduces to O(N)
    }
}
