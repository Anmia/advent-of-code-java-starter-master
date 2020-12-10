package aoc.day10;

import aoc.Day;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Day10 implements Day {

    @Override
    public String part1(List<String> input) {
        int result = 0;

        ArrayList<Integer> addapters = new ArrayList<>();
        for (String s : input) {
            addapters.add(Integer.parseInt(s));
        }

        Collections.sort(addapters);

        for (int x : addapters) {

        }

        return "" + result;
    }

    @Override
    public String part2(List<String> input) {
        int result = 0;
        return "" + result;
    }

}
