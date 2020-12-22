package aoc.day01;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Day01Test {

    @Test
    public void testPart1(){
        // Given
        ArrayList<String> block = new ArrayList<>();

        block.add("1721");
        block.add("979");
        block.add("366");
        block.add("299");
        block.add("675");
        block.add("1456");

        List<String> input = block;

        // When
        String result = new Day01().part1(input);

        // Then
        assertEquals("514579", result);
    }

    @Test
    public void testPart2(){
        // Given
        ArrayList<String> block = new ArrayList<>();

        block.add("1721");
        block.add("979");
        block.add("366");
        block.add("299");
        block.add("675");
        block.add("1456");

        List<String> input = block;

        // When
        String result = new Day01().part2(input);

        // Then
        assertEquals("241861950", result);
    }
}
