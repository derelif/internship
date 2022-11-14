package com.naki.lecture_1_2.task1;

import java.util.Arrays;

public class FirstTask {

    /**
     * Takes the array of ints and use {@code Arrays} to return sorted in decreasing order array
     * with positive numbers only
     */
    public int[] getPositiveOnly(int[] nums) {


        int[] positives = Arrays.stream(nums).filter(i -> i >= 0).sorted().toArray();
        reverse(positives);
        return positives;

//        Integer[] positives = Arrays.stream(nums).filter(s -> s >= 0).boxed().toArray(Integer[]::new);
//        Arrays.sort(positives, Collections.reverseOrder());
//        return Arrays.stream(positives).mapToInt(i -> i).toArray();

    }

    private static void reverse(int[] input) {
        int last = input.length - 1;
        int middle = input.length / 2;
        for (int i = 0; i < middle; i++) {
            int temp = input[i];
            input[i] = input[last - i];
            input[last - i] = temp;
        }
    }

}
