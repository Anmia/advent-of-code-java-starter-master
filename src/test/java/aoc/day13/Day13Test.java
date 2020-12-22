package aoc.day13;

import aoc.day13.Day13;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Day13Test {

    @Test
    public void testPart1(){
        // Given
        ArrayList<String> block = new ArrayList<>();

        block.add("939");
        block.add("7,13,x,x,59,x,31,19");

        // When
        String result = new Day13().part1(block);

        // Then
        assertEquals("295", result);
    }

    @Test
    public void testPart2(){
        // Given
        List<String> input = Collections.singletonList("test");

        // When
        String result = new Day13().part2(input);

        // Then
        assertEquals(input.get(0), result);
    }
}
