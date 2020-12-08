package aoc.day05;

import aoc.Day;

import java.util.ArrayList;
import java.util.Collections;

import java.util.List;

public class Day05 implements Day {

    @Override
    public String part1(List<String> input) {
        // greatest checksum row * 8 + seat
        int result = 0;

        //How long is the list. Can't remember why, but declare it rather than in the for loop
        int listLen = input.size();

        //row and seat
        int row;
        int seat;

        //Checksum see result
        int checkSum;

        //go through the list
        for (int i = 0; i < listLen; i++) {
            //Reset row and seat
            row = 0;
            seat = 0;

            //
            if (input.get(i).charAt(0) == 'B') {row = row + 64;}
            if (input.get(i).charAt(1) == 'B') {row = row + 32;}
            if (input.get(i).charAt(2) == 'B') {row = row + 16;}
            if (input.get(i).charAt(3) == 'B') {row = row + 8;}
            if (input.get(i).charAt(4) == 'B') {row = row + 4;}
            if (input.get(i).charAt(5) == 'B') {row = row + 2;}
            if (input.get(i).charAt(6) == 'B') {row = row + 1;}
            if (input.get(i).charAt(7) == 'R') {seat = seat + 4;}
            if (input.get(i).charAt(8) == 'R') {seat = seat + 2;}
            if (input.get(i).charAt(9) == 'R') {seat = seat + 1;}

            checkSum = (row * 8) + seat;


            if (checkSum > result) {result = checkSum;}
        }

        return "" + result;
    }

    @Override
    public String part2(List<String> input) {
        // greatest checksum row * 8 + seat
        int result = 0;

        //How long is the list. Can't remember why, but declare it rather than in the for loop
        int listLen = input.size();

        ArrayList<Integer> seatIds = new ArrayList<>();

        //row and seat
        int row;
        int seat;

        int x = 0, y= 0, z = 0;

        //Checksum see result
        int checkSum;

        //go through the list
        for (int i = 0; i < listLen; i++) {
            //Reset row and seat
            row = 0;
            seat = 0;

            //
            if (input.get(i).charAt(0) == 'B') {row = row + 64;}
            if (input.get(i).charAt(1) == 'B') {row = row + 32;}
            if (input.get(i).charAt(2) == 'B') {row = row + 16;}
            if (input.get(i).charAt(3) == 'B') {row = row + 8;}
            if (input.get(i).charAt(4) == 'B') {row = row + 4;}
            if (input.get(i).charAt(5) == 'B') {row = row + 2;}
            if (input.get(i).charAt(6) == 'B') {row = row + 1;}
            if (input.get(i).charAt(7) == 'R') {seat = seat + 4;}
            if (input.get(i).charAt(8) == 'R') {seat = seat + 2;}
            if (input.get(i).charAt(9) == 'R') {seat = seat + 1;}

            checkSum = (row * 8) + seat;

            seatIds.add(checkSum);
        }


        Collections.sort(seatIds);




        for (int i = 1; i < seatIds.size() - 1; i++) {
            x = seatIds.get(i - 1);
            y = seatIds.get(i);
            z = seatIds.get(i + 1);

            System.out.println(x + " " + y + " " + z);

            if (x != y - 1 || y != z - 1) {
                result = y;

                System.out.println(y);
            }
        }

        result = result - 1;

        return "" + result;
    }

}
