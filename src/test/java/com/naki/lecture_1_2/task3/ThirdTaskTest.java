package com.naki.lecture_1_2.task3;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ThirdTaskTest {



    @Test
    public void test() {
        Ball ball = new Ball(10.0);
        Cube cube = new Cube(10.0);
        Cylinder cylinder = new Cylinder(10.0,15.0);

        //has to be sorted
        List<Shape> shapes = new ArrayList<>();
        shapes.add(ball);
        shapes.add(cube);
        shapes.add(cylinder);

        //correct sequence
        List<Shape> testShapes = new ArrayList<>();
        testShapes.add(cube);
        testShapes.add(ball);
        testShapes.add(cylinder);


        assertEquals(testShapes, new ThirdTask().sortShapesByVolume(shapes));
    }
  
}