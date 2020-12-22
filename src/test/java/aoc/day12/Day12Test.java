package aoc.day12;

import aoc.day12.Day12;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Day12Test {

    @Test
    public void testPart1(){
        ArrayList<String> block = new ArrayList<>();

        block.add("F10");
        block.add("N3");
        block.add("F7");
        block.add("R90");
        block.add("F11");

        // Given
        List<String> input = block;

        // When
        String result = new Day12().part1(input);

        // Then
        assertEquals("25", result);
    }

    @Test
    public void testPart2(){
        ArrayList<String> block = new ArrayList<>();

        block.add("F10");
        block.add("N3");
        block.add("F7");
        block.add("R90");
        block.add("F11");

        // Given
        List<String> input = block;

        // When
        String result = new Day12().part2(input);

        // Then
        assertEquals("286", result);
    }
}
