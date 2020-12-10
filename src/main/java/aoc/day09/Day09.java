package aoc.day09;

import aoc.Day;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Day09 implements Day {

    @Override
    public String part1(List<String> input) {
        //Find first number in list where it is not sum of two of 25 numbers before it in list. start on number 26 (index 25)
        long result = 0;


        long currentNumber;
        long x = 0;
        long y = 0;

        String longString = "";

        // loop through list
        for (int i = 25; i < input.size(); i++) {
            //set current number
            longString = input.get(i);
            currentNumber = Long.parseLong(longString);
            //loop through 24 to 1 before current number. loop starts 24 before and sets x
            for (int j = i - 24; j < i; j++) {

                longString = input.get(j);
                x = Long.parseLong(longString);

                //loop through 25 to 2 before current number. avoids adding same numbers more than once. makes loops 25! max rather than 25^2
                for (int k = i - 25; k < j; k++) {
                    longString = input.get(k);
                    y = Long.parseLong(longString);

                    //check if x and why totals currentNumber
                    if (currentNumber == x + y) {
                        //stop loops if result is found
                        k = j;
                        j = i;
                    } else if (j == i - 1 && k == j - 1 && currentNumber != x + y){
                        result = currentNumber;
                    }

                }
            }
        }

        return "" + result;
    }

    @Override
    public String part2(List<String> input) {
        /*
        The final step in breaking the XMAS encryption relies on the invalid number you just found: you must find a contiguous set of at least two numbers in your list which sum to the invalid number from step 1.

Again consider the above example:

35
20
15
25
47
40
62
55
65
95
102
117
150
182
127
219
299
277
309
576
In this list, adding up all of the numbers from 15 through 40 produces the invalid number from step 1, 127. (Of course, the contiguous set of numbers in your actual list might be much longer.)

To find the encryption weakness, add together the smallest and largest number in this contiguous range; in this example, these are 15 and 47, producing 62.

What is the encryption weakness in your XMAS-encrypted list of numbers?
         */
        long result = 0;
        long invalid = 0;
        int invalidPlace = 0;


        long currentNumber;
        long x = 0;
        long y = 0;

        String longString = "";

        // loop through list
        for (int i = 25; i < input.size(); i++) {
            //set current number
            longString = input.get(i);
            currentNumber = Long.parseLong(longString);
            //loop through 24 to 1 before current number. loop starts 24 before and sets x
            for (int j = i - 24; j < i; j++) {

                longString = input.get(j);
                x = Long.parseLong(longString);

                //loop through 25 to 2 before current number. avoids adding same numbers more than once. makes loops 25! max rather than 25^2
                for (int k = i - 25; k < j; k++) {
                    longString = input.get(k);
                    y = Long.parseLong(longString);

                    //check if x and why totals currentNumber
                    if (currentNumber == x + y) {
                        //stop loops if result is found
                        k = j;
                        j = i;
                    } else if (j == i - 1 && k == j - 1 && currentNumber != x + y){
                        invalid = currentNumber;
                        invalidPlace = i;
                    }

                }
            }
        }

        /*
        possibly bad idea but two loops. first is starting number. the adds together numbers continuously from the start.
        if a sum is equal to invalid it stops. if greater it increases first number and goes again
         */
        long ticker = 0;
        long top = 0;
        long bottom = 0;

        //SMALLEST AND LARGEST!!!!!
        ArrayList<Long> tickerSteps = new ArrayList<>();

        for (int i = 0; i < invalidPlace - 1; i++) {
            bottom = Long.parseLong(input.get(i));
            ticker = Long.parseLong(input.get(i));
            tickerSteps.add(bottom);

            for (int j = i + 1; j < invalidPlace; j++) {
                top = Long.parseLong(input.get(j));
                ticker = ticker + top;
                tickerSteps.add(top);
                if (ticker == invalid) {
                    // end all loops
                    i = invalidPlace;
                    j = invalidPlace;
                    result = ticker;
                } else if (ticker > invalid) {
                    // move on to next starting point
                    j = invalidPlace;
                    //Empty result list
                    tickerSteps.clear();
                }
            }
        }
        /*
        Sort and get lowest and highest values
        Did this wrong at first nd did first andd last :(
         */

        Collections.sort(tickerSteps);
        result = tickerSteps.get(0) + tickerSteps.get(tickerSteps.size() - 1);

        return "" + result;
    }

}
