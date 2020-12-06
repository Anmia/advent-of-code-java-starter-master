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
        String[] values = {"byr:", "iyr:", "eyr:", "hgt:", "hcl:", "ecl:", "pid:"};

        //go through list
        for (int i = 0; i < listLen; i++) {
            check = check + " " + input.get(i);

            //each block is separated by a blank line. also check last block
            if (input.get(i).isEmpty() || i == listLen - 1) {

                if (check.contains("byr:") && check.contains("iyr:") && check.contains("eyr:") &&  check.contains("hgt:") && check.contains("hcl:") &&  check.contains("ecl:") && check.contains("pid:")) {
                    valid++;
                    System.out.println(check);
                }
                // go through values that are to checked



                check = "";

            }

        }

        return "" + valid;
    }

    @Override
    public String part2(List<String> input) {
        long listLen = input.size();

        String check = "";

        boolean test = false;
        long valid = 0;

        int many = 0;
        String[] values = {"byr:", "iyr:", "eyr:", "hgt:", "hcl:", "ecl:", "pid:"};
/*
byr valid:   2002
byr invalid: 2003

hgt valid:   60in
hgt valid:   190cm
hgt invalid: 190in
hgt invalid: 190

hcl valid:   #123abc
hcl invalid: #123abz
hcl invalid: 123abc

ecl valid:   brn
ecl invalid: wat

pid valid:   000000001
pid invalid: 0123456789
 */
        //go through list
        boolean testOne;
        boolean testTwo;
        for (int i = 0; i < listLen; i++) {
            check = check + " " + input.get(i);


            //each block is separated by a blank line. also check last block
            if (input.get(i).isEmpty() || i == listLen - 1) {

                if (check.contains("byr:") && check.contains("iyr:") && check.contains("eyr:") &&  check.contains("hgt:") && check.contains("hcl:") &&  check.contains("ecl:") && check.contains("pid:")) {
                    String[] splitPass = check.split(" ");
                    String checkString = "";
                    testOne = false;
                    for (int j = 0; j < splitPass.length; j++) {

                        checkString = splitPass[j].substring(3, checkString.length());

                        switch (splitPass[j]) {
                            case "byr" :
                                if (Integer.parseInt(checkString) == 2003 || Integer.parseInt(checkString) == 2002) {
                                    testOne = true;
                                } else {
                                    testOne = false;
                                };
                            case "iyr" :
                                if (Integer.parseInt(checkString) == 2003 || Integer.parseInt(checkString) == 2002) {
                                    testOne = true;
                                } else {
                                    testOne = false;
                                };
                        }
                    }
                    valid++;


                    System.out.println(check);
                }
                check = "";

            }

        }

        return "" + valid;
    }

}
