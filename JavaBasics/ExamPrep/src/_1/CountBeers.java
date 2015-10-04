package _1;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class CountBeers {
    public static final int BEER_STACK = 20;

    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        String inputStr = sc.nextLine();
        int beers = 0;
        while (!(inputStr.equals("End"))){
            String[] strings = inputStr.split("\\s+");
            if (strings[1].equals("stacks")){
                beers += Integer.parseInt(strings[0])*BEER_STACK;
            }else{
                beers += Integer.parseInt(strings[0]);
            }
            inputStr = sc.nextLine();
        }
        out.printf("%d stacks + %d beers",beers/BEER_STACK,beers%BEER_STACK);
    }
}
