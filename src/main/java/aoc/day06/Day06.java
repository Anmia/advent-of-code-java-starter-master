package aoc.day06;

import aoc.Day;

import java.util.List;

public class Day06 implements Day {

    @Override
    public String part1(List<String> input) {
        int result = 0;

        String block = "";

        //String check = "";

        for (int i = 0; i < input.size(); i++) {
            // gather blocks as single strings
            block = block + input.get(i);

            if (input.get(i).isEmpty() == true || i == input.size() - 1) {
                for (char x = 'a'; x <= 'z'; x++) {
                    if (block.indexOf(x) != -1) {
                        result++;
                        //check = check + x;
                    }

                }
                //check = "";
                block = "";
            }
        }

        return "" + result;
    }

    @Override
    public String part2(List<String> input) {
        int result = 0;
        return "" + result;
    }

}
