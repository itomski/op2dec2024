package de.lubowiecki.uebungen.u2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DiceCup {

    private static Random randGenerator = new Random();
    private static int SIZE = 6;

    private DiceCup() {
    }

    public static int roll() {
        // return (int)(Math.random() * 6) + 1;
        return randGenerator.nextInt(SIZE) + 1;
    }

//    public static List<Integer> roll(int num) {
//        List<Integer> rands = new ArrayList<>();
//        for (int i = 0; i < num; i++) {
//            rands.add(roll());
//        }
//        return rands;
//    }

    public static int[] roll(int num) {
        int[] rands = new int[num];
        for (int i = 0; i < num; i++) {
            rands[i] = roll();
        }
        return rands;
    }
}
