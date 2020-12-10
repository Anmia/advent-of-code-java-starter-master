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

        int start = 0;
        int diffs[] = {0, 0, 0};

        for (int x : addapters) {
            if (x - start <= 3) {
                diffs[(x - start) - 1]++;
                start = x;
            }
        }

        result = diffs[0] * (diffs[2] + 1);

        return "" + result;
    }

    @Override
    public String part2(List<String> input) {
        /*
        TREES TOO MANY TREES
         */

        int result = 0;
        return "" + result;
    }

}
