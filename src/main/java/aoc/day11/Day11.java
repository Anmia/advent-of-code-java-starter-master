package aoc.day11;

import aoc.Day;

import java.util.ArrayList;
import java.util.List;

public class Day11 implements Day {

    @Override
    public String part1(List<String> input) {
        int result = 0;

        boolean change = true;

        //sett two lists. first is the one tests will be run on. Second is where changes will be made based on the test.

        ArrayList<String> seatChange = new ArrayList<>();



        //Same as above with strings
        String strCurrent;
        String strChange;


        int listLen = input.size();

        int ite = 0;

        while (change) {
            //Set change to be false at the begining of each iteration.
            System.out.println("Iteration " + ite);
            change = false;

            for (int i = 0; i < listLen; i++) {
                strChange = "";
                strCurrent = input.get(i);

                for (int j = 0; j < strCurrent.length(); j++) {
                    if (strCurrent.charAt(j) == 'L') {
                        if (emptySeat(input, j, i)) {
                            change = true;
                            strChange = strChange + '#';
                        } else {
                            strChange = strChange + strCurrent.charAt(j);
                        }
                    } else if (strCurrent.charAt(j) == '#') {
                        if (occupiedSeat(input, j, i)) {
                            change = true;
                            strChange = strChange + 'L';
                        } else {
                            strChange = strChange + strCurrent.charAt(j);
                        }
                    } else {
                        strChange = strChange + strCurrent.charAt(j);
                    }
                }
                seatChange.add(strChange);
            }


            //if there have been changes, increase result by 1
            if (change) {
                for (int i = 0; i < seatChange.size(); i++) {
                    input.set(i, seatChange.get(i));
                }
            }
            seatChange.clear();

        }

        for (String x : input) {
            System.out.println(x);
            for (int i = 0; i < x.length(); i++) {
                if (x.charAt(i) == '#') {
                    result++;
                }
            }
        }

        return "" + result;
    }

    public boolean emptySeat (List<String> current, int x, int y) {
        boolean ruleTrue = false;
        int occupiedSeats = 0;

        for (int i = y -1; i <= y + 1; i++) {
            for (int j = x -1; j <= x +1; j++) {
                if (i >= 0 && i < current.size() && j >= 0 && j < current.get(y).length() && (x != j && y != i)) {
                    if (current.get(i).charAt(j) == '#') {
                        occupiedSeats++;
                    }
                }
            }
        }

        if (occupiedSeats == 0) {
            ruleTrue = true;
        }

        return ruleTrue;
    }

    public boolean occupiedSeat (List<String> current, int x, int y) {
        boolean ruleTrue = false;
        int occupiedSeats = 0;

        for (int i = y -1; i <= y + 1; i++) {

            for (int j = x -1; j <= x + 1; j++) {
                if (i >= 0 && i < current.size() && j >= 0 && j < current.get(y).length() && (x != j && y != i)) {
                    if (current.get(i).charAt(j) == '#' ) {
                        occupiedSeats++;
                    }
                }
            }
        }

        if (occupiedSeats >= 4) {
            ruleTrue = true;
        }

        return ruleTrue;
    }

    @Override
    public String part2(List<String> input) {
        int result = 0;
        return "" + result;
    }

}
