package aoc.day03;

import aoc.Day;

import java.util.ArrayList;

import java.util.List;

public class Day03 implements Day {

    @Override
    public String part1(List<String> input) {
        /*
        moves 1 down 3 right
        find lowest tree hitting path
         */
        ArrayList<Integer> hit = new ArrayList<>();
        int listLen = input.size();

        //how long is the string
        int strLen = input.get(0).length();

        //Char init
        char location;
        // checking each column... ...
        for (int i = 0; i < 1; i++) {
            hit.add(0);
            // actual checking. vertical and y is horizontal
            for (int x = 0; x < listLen; x++) {
                int y = 0;
                if (x != 0) {
                    y = x * 3;
                }

                //loop back if coordinates are out of bounds
                if (y >= strLen) {
                    y = y % strLen;
                }

                location = input.get(x).charAt(y);
                if (location == '#') {
                    hit.set(i,hit.get(i) + 1);
                }

            }
        }

        return "" + hit.get(0);
    }

    @Override
    public String part2(List<String> input) {

        /*
        moves 1 down 3 right
        find lowest tree hitting path
         */
        ArrayList<Integer> hit = new ArrayList<>();
        int listLen = input.size();

        //how long is the string
        int strLen = input.get(0).length();

        //Char init

        // checking each column... ...
        // vertical y

        // first is down, second is right
        int[][] movement = {{1, 1}, {1, 3}, {1, 5}, {1, 7}, {2, 1}};

        //each item in movement
        for (int i = 0; i < movement.length; i++) {
            hit.add(0);
            // moving the sled
            for (int y = 0; y < listLen; y++) {
                int xCor = 0;
                int yCor = 0;
                if (y != 0) {
                    yCor = movement[i][0] * y;
                    xCor = movement[i][1] * y;
                }

                // in case of out of bounds x
                if (xCor >= strLen) {
                    xCor = xCor % strLen;
                }
                char location;
                //in case of out of bounds y
                if (yCor < listLen) {
                    location = input.get(yCor).charAt(xCor);
                    if (location == '#') {
                        hit.set(i,hit.get(i) + 1);
                    }
                }


            }
        }

        long result = 1;
        for (int i = 0; i < hit.size(); i++) {
            result = result * hit.get(i);
        }

        return "" + result;
    }

}
