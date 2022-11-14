package com.naki.lecture_1_2.task3;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ThirdTask {

    /**
     * Sort {@code List} of {@code Shape} by their {@code volume}
     */
    public List<Shape> sortShapesByVolume(List<Shape> shapes) {

        return shapes.stream()
                .sorted(Comparator.comparing(Shape::getVolume))
                .collect(Collectors.toList());
    }
}
