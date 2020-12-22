package aoc.day11;

import aoc.day11.Day11;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Day11Test {

    @Test
    public void testPart1(){
        ArrayList<String> block = new ArrayList<>();

        block.add("L.LL.LL.LL");
        block.add("LLLLLLL.LL");
        block.add("L.L.L..L..");
        block.add("LLLL.LL.LL");
        block.add("L.LL.LL.LL");
        block.add("L.LLLLL.LL");
        block.add("..L.L.....");
        block.add("LLLLLLLLLL");
        block.add("L.LLLLLL.L");
        block.add("L.LLLLL.LL");


        // Given
        List<String> input = block;



        // When
        String result = new Day11().part1(input);

        // Then
        assertEquals("37", result);
    }

    @Test
    public void testPart2(){
        // Given
        List<String> input = Collections.singletonList("test");

        // When
        String result = new Day11().part2(input);

        // Then
        assertEquals(input.get(0), result);
    }
}
