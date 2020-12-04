package aoc.day04;

import aoc.Day;

import java.util.ArrayList;

import java.util.List;

public class Day04 implements Day {

    @Override
    public String part1(List<String> input) {
        long listLen = input.size();

        String check = "";

        boolean test = false;
        long valid = 0;

        int many = 0;
        String[] values = {"byr", "iyr", "eyr", "hgt", "hcl", "ecl", "pid"};

        //go through list
        for (int i = 0; i < listLen; i++) {
            check = check + " " + input.get(i);

            //each block is separated by a blank line. also check last block
            if (input.get(i).isEmpty() || i == listLen - 1) {


                // go through values that are to checked
                for (int j = 0; j < values.length; j++) {

                    //set to true
                    if (check.contains(values[j]) == true) {
                        test = true;
                    } else {
                        test = false;
                    }
                }
                if (test) {
                    valid++;
                }
                System.out.println(test + " " + check);
                check = "";
                many++;
            }
            test = false;
        }

        return "" + valid;
    }

    @Override
    public String part2(List<String> input) {

        return "";
    }

}
