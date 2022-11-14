package com.naki.lecture_1_2.task2;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SecondTaskTest {

    @Test
    public void test() {

        List<String> hashtags = new ArrayList<>();
        hashtags.add("#First #Second #Third");
        hashtags.add("First Second Third");
        hashtags.add("#First Second #Third");
        hashtags.add("#Fourth, #Fifth, #Sixth");
        hashtags.add("#First First, naah");

        String topFive = "#First seen 3 times\n" +
                "#Third seen 2 times\n" +
                "#Fifth seen 1 times\n" +
                "#Second seen 1 times\n" +
                "#Fourth seen 1 times";

        assertEquals(topFive, new SecondTask().getTopHashtags(hashtags));
    }

}