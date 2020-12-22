package aoc.day13;

import aoc.Day;

import java.util.ArrayList;
import java.util.List;

public class Day13 implements Day {

    @Override
    public String part1(List<String> input) {
        int result = 0;

        int time = Integer.parseInt(input.get(0));

        String[] busStringArray = input.get(1).split(",");

        ArrayList<Integer> busses = new ArrayList<>();
        ArrayList<Integer> bussesTimeTo = new ArrayList<>();
        ArrayList<Integer> bussesTime = new ArrayList<>();

        for (int i = 0; i < busStringArray.length; i++) {
            if (!busStringArray[i].equalsIgnoreCase("x")) {
                busses.add(Integer.parseInt(busStringArray[i]));
            }
        }



        for (int x : busses) {
            bussesTimeTo.add(x - (time % x));
        }

        int lowest = bussesTimeTo.get(0);
        int bus = 0;

        for (int i = 0; i < busses.size(); i++) {
            if (bussesTimeTo.get(i) < lowest) {
                lowest = bussesTimeTo.get(i);
                bus = busses.get(i);
            }
        }

        result = bus * lowest;

        return "" + result;
    }

    @Override
    public String part2(List<String> input) {
        int result = 0;
        return "" + result;
    }

}
