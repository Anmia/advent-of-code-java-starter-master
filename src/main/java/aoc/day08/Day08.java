package aoc.day08;

import aoc.Day;

import java.util.Arrays;
import java.util.List;

public class Day08 implements Day {

    @Override
    public String part1(List<String> input) {
        int result = 0;
        int acc;
        int jmp;
        char action = ' ';

        int listLen = input.size();
        boolean[] visited = new boolean[listLen];
        Arrays.fill(visited, false);
        boolean done = false;
        int step = 0;


        while (!done) {
            if (visited[step]) {
                done = true;
                System.out.println("DONE!");
            } else {

                action = input.get(step).charAt(0);
                System.out.println(action);
                if (action == 'a') {
                    acc = Integer.parseInt(input.get(step).substring(4, input.get(step).length()));

                    visited[step] = true;
                    result = result + acc;
                    step++;
                } else if (action== 'j') {
                    jmp = Integer.parseInt(input.get(step).substring(4, input.get(step).length()));

                    visited[step] = true;
                    step = step + jmp;
                } else if (action == 'n') {
                    visited[step] = true;
                    step++;
                }

                System.out.println(step + " " + result + " " + input.get(step));

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
