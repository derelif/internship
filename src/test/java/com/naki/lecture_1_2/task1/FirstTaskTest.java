package com.naki.lecture_1_2.task1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class FirstTaskTest {

    @Test
    public void test() {
        assertArrayEquals(new int[]{5,4,3,2,1,0},
                new FirstTask().getPositiveOnly(new int[]{-6,-5,-4,-3,-2,-1,0,1,2,3,4,5}));
    }
}