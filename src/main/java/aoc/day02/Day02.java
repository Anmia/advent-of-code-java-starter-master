package aoc.day02;

import aoc.Day;

import java.util.List;

public class Day02 implements Day {

    @Override
    public String part1(List<String> input) {
        int len = input.size();
        int correct = 0;
        int xStart = 0;
        int xEnd;
        int yStart;
        int yEnd;
        int zPos;
        int end;
        int amount;


        int x;
        int y;
        char z;
        String b;

        for (int i = 0; i < len; i++) {
            amount = 0;
            xEnd = input.get(i).indexOf("-");

            x = Integer.parseInt(input.get(i).substring(xStart, xEnd));

            yStart = xEnd + 1;
            yEnd = input.get(i).indexOf(" ");
            y = Integer.parseInt(input.get(i).substring(yStart, yEnd));

            zPos = yEnd + 1;
            z = input.get(i).charAt(zPos);

            b = input.get(i).substring(zPos + 3, input.get(i).length());

            for (int j = 0; j < b.length(); j++) {
                if (b.charAt(j) == z) {
                    amount++;
                }
            }

            // Checking that z is between x and y times in b
            if (amount >= x && amount <= y) {
                correct++;
            }
        }

        return "" + correct + "";
    }

    @Override
    public String part2(List<String> input) {
        int len = input.size();
        int correct = 0;
        int xStart = 0;
        int xEnd;
        int yStart;
        int yEnd;
        int zPos;
        int end;


        int x;
        int y;
        char z;
        char f;
        char g;
        String b;

        for (int i = 0; i < len; i++) {
            // what number is x. it might be double digit so need to get it out
            xEnd = input.get(i).indexOf("-");

            x = Integer.parseInt(input.get(i).substring(xStart, xEnd));

            // same with y
            yStart = xEnd + 1;
            yEnd = input.get(i).indexOf(" ");
            y = Integer.parseInt(input.get(i).substring(yStart, yEnd));

            // then z which is always one char
            zPos = yEnd + 1;
            z = input.get(i).charAt(zPos);

            // b is the string that is to be checked
            b = input.get(i).substring(zPos + 3, input.get(i).length());

            f = b.charAt(x - 1);
            g = b.charAt(y - 1);


            // Checking that z is between x and y times in b
            if (!(f == z && g == z) && (f == z || g == z)) {
                correct++;
            }
        }

        return "" + correct + "";
    }

}
