package Recursion;

import java.util.ArrayList;

public class P13_DiceGame {
    static ArrayList<String> game(int currentValue, int endValue) {
        // currentValue = 0 (Starting point), 
        // endValue = 10

        // Positive Base Case
        if(currentValue == endValue) {
            ArrayList<String> t = new ArrayList<>();
            t.add("");
            return t;
        }

        // Negative Base Case
        if(currentValue > endValue) {
            ArrayList<String> t = new ArrayList<>();
            return t;
        }

        ArrayList<String> temp = new ArrayList<>();
        // Start rolling the dice
        for(int dice = 1; dice <= 6; dice++) {
            int newValue = currentValue + dice;
            ArrayList<String> result = game(newValue, endValue);
            for(String s : result) {
                temp.add(dice + s);
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        int n = 4;
        int current = 0;
        System.out.println(game(current, n));
    }
}
