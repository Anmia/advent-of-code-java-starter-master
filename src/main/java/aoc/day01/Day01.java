package aoc.day01;

import aoc.Day;

import java.util.List;

public class Day01 implements Day {

    @Override
    public String part1(List<String> input) {

        int listLength = input.size();
        int x;
        int y;
        int z;
        int result = 0;
        for (int i = 0; i < listLength; i++) {
            x = Integer.parseInt(input.get(i));
            for (int j = 0; j < listLength; j++) {
                y = Integer.parseInt(input.get(j));
                z = x + y;

                if ((z == 2020) && (x != y)) {
                    result = x * y;
                }
            }
        }

        String boom = "" + result + "";

        return boom;
        //return input.isEmpty() ? "" : input.get(0);
    }

    @Override
    public String part2(List<String> input) {
        int listLength = input.size();
        int a;
        int b;
        int c;
        int d;
        int result = 0;
        for (int i = 0; i < listLength; i++) {
            a = Integer.parseInt(input.get(i));
            for (int j = 0; j < listLength; j++) {
                b = Integer.parseInt(input.get(j));
                for (int k = 0; k < listLength; k++) {
                    c = Integer.parseInt(input.get(k));
                    d = a + b + c;

                    if (d == 2020) {
                        result = a * b * c;
                    }
                }

            }
        }

        String boom = "" + result + "";

        return boom;

    }

}
