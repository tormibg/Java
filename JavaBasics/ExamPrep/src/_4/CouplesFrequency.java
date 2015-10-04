package _4;

import java.util.*;

import static java.lang.System.in;
import static java.lang.System.out;

public class CouplesFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        String[] numbers = sc.nextLine().split("\\s+");

        Map<String, Integer> couples = new HashMap<>();

        for (int i = 0; i < numbers.length - 1; i++) {
            String couple = String.format("%s %s", numbers[i], numbers[i + 1]);
            Integer count = couples.get(couple);
            if (count == null) {
                count = 0;
            }
            count++;
            couples.put(couple, count);
        }
        Set<String> printed = new HashSet<>();
        for (int i = 0; i < numbers.length-1; i++) {
            String couple = String.format("%s %s", numbers[i], numbers[i + 1]);
            if (!(printed.contains(couple))) {
                Integer count = couples.get(couple);
                float frequency = (float) count / (numbers.length - 1);
                //3 4 -> 30.00%
                out.printf("%s -> %.2f%%\n", couple, frequency * 100);
                printed.add(couple);
            }
        }
    }
}
