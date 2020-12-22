package aoc.day12;

import aoc.Day;

import java.util.List;

public class Day12 implements Day {

    @Override
    public String part1(List<String> input) {
        int result = 0;

        //0 is x and 1 is y. NE is pos, SW is neg
        int[] position = {0, 0};
        //direction ship is facing
        char direction = 'E';

        char command;
        int comValue;

        int move[] = new int[2];

        for (String currentCommand : input) {
            //Parse command and command value
            command = currentCommand.charAt(0);
            comValue = Integer.parseInt(currentCommand.substring(1));

            if (command == 'N' || command =='E' || command == 'S' || command == 'W') {
                move = nesw(command, comValue);
                position[0] += move[0];
                position[1] += move[1];
            }

            if (command == 'R' || command == 'L') {
                direction = rotate(direction, command, comValue);
            }

            if (command == 'F') {
                move = forward(direction, comValue);
                position[0] += move[0];
                position[1] += move[1];
            }

            System.out.println(direction + " " + position[0] + " " + position[1]);
        }

        if (position[0] < 0) {
            position[0] = position[0] * -1;
        }

        if (position[1] < 0) {
            position[1] = position[1] * -1;
        }

        result = position[0] + position[1];

        return "" + result;
    }

    //for NESW
    public int[] nesw (char com, int val) {
        int[] moveBy = {0, 0};

        switch (com) {
            case 'N' :
                moveBy[1] += val;
                break;
            case 'E' :
                moveBy[0] += val;
                break;
            case 'S' :
                moveBy[1] -= val;
                break;
            case 'W' :
                moveBy[0] -= val;
                break;
        }

        return moveBy;
    }

    //for RL
    public char rotate(char curDir, char com, int val) {
        int newDir = 0;
        int curDirInt = 0;
        int rotate = val / 90;
        char[] compass = {'N', 'E', 'S', 'W'};

        //Set reference for the compass
        switch (curDir) {
            case 'N' :
                curDirInt = 0;
                break;
            case 'E' :
                curDirInt = 1;
                break;
            case 'S' :
                curDirInt = 2;
                break;
            case 'W' :
                curDirInt = 3;
                break;
        }

        if (com == 'R') {
            newDir = curDirInt + rotate;

            if (newDir > 3) {
                newDir = newDir - 4;
            }
        } else if (com == 'L') {
            if (curDirInt < rotate) {
                curDirInt += 4;
            }

            newDir = curDirInt - rotate;
        } else {
            System.out.println("WTF! This should not happen!!!!!!!!!!!!!!!!!!!!!!");
        }

        return compass[newDir];
    }

    //for F
    public int[] forward (char dir, int val) {
        int[] moveBy = {0,0};

        switch (dir) {
            case 'N' :
                moveBy[1] += val;
                break;
            case 'E' :
                moveBy[0] += val;
                break;
            case 'S' :
                moveBy[1] -= val;
                break;
            case 'W' :
                moveBy[0] -= val;
                break;
        }

        return moveBy;
    }

    @Override
    public String part2(List<String> input) {
        int result = 0;

        //Did not understand the task :(

        /*//0 is x and 1 is y. NE is pos, SW is neg
        int[] position = {0, 0};
        //direction ship is facing
        char direction = 'E';

        char command;
        int comValue;

        int move[] = new int[2];

        for (String currentCommand : input) {
            //Parse command and command value
            command = currentCommand.charAt(0);
            comValue = Integer.parseInt(currentCommand.substring(1));

            if (command == 'N' || command =='E' || command == 'S' || command == 'W') {
                move = nesw(command, comValue);
                position[0] += move[0];
                position[1] += move[1];
            }

            if (command == 'R' || command == 'L') {
                direction = rotate(direction, command, comValue);
            }

            if (command == 'F') {
                move = forward(direction, comValue);
                position[0] += move[0];
                position[1] += move[1];
            }

            System.out.println(direction + " " + position[0] + " " + position[1]);
        }

        if (position[0] < 0) {
            position[0] = position[0] * -1;
        }

        if (position[1] < 0) {
            position[1] = position[1] * -1;
        }

        result = position[0] + position[1];*/

        return "" + result;
    }

}
