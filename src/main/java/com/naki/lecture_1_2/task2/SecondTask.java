package com.naki.lecture_1_2.task2;

import java.util.*;
import java.util.stream.Collectors;

public class SecondTask {


    /**
     * This method takes a list of strings than check if it contains hashtag '#'
     * if it is true the hashtag will be added to the {@code Map} which contains
     * every hashtag and its number of repetitions
     * @param strings list of random strings
     * @return single string that contains top 5 most popular hashtags
     */
    public String getTopHashtags(List<String> strings) {
        Map<String, Integer> top = new HashMap<>();

        StringBuilder topFive = new StringBuilder();

        List<String> topHashtags = new ArrayList<>();


        for (String s : strings) {
            if (s.contains("#")) {
                String[] tags = s.split(" ");
                for (String sa : tags) {
                    if (sa.charAt(0) == '#')
                        top.put(sa.replaceAll("[,.?/!]", ""),
                                top.isEmpty() || top.get(sa) == null ? 1 : top.get(sa) + 1);
                }
            }
        }

        top = sortByValue(top);
        for (Iterator iter = top.entrySet().iterator(); iter.hasNext(); ) {
            topHashtags.add(iter.next().toString());
        }


        for (String s : topHashtags) {
            String[] tops = s.split("=");
            topFive.append(tops[0] + " seen " + tops[1] + " times\n");
        }

        return topFive.toString().strip();
    }

    /**
     * Takes the {@code Map}, sort it by value and returns the sorted one with maximum size 5
     */
    private static <K, V extends Comparable<? super V>> Map<K, V> sortByValue(Map<K, V> map) {
        return map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(5)
                .collect(Collectors.toMap(
                        Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new
                ));
    }

/*
    public static <K, V extends Comparable<? super V>> Map<K, V> sortByValue(Map<K, V> map) {
        List<Map.Entry<K, V>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        Map<K, V> result = new LinkedHashMap<>();
        for (Map.Entry<K, V> entry : list) {
            result.put(entry.getKey(), entry.getValue());
        }

        return result;
    }
    */
}