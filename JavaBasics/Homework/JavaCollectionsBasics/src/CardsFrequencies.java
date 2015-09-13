import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class CardsFrequencies {
    public static void main(String[] args) {
        Scanner scanIn = new Scanner(in);
        String[] cards = Arrays.asList(scanIn.nextLine().split("\\s+")).stream().toArray(String[]::new);

        Map<String, Integer> occurences = new LinkedHashMap<>();

        for (String card : cards) {
            String face = card.substring(0, card.length() - 1);

            if (occurences.containsKey(face)) {
                occurences.put(face, occurences.get(face) + 1);
            } else {
                occurences.put(face, 1);
            }
        }

        for (String face : occurences.keySet()) {
            double percentage = (double)occurences.get(face) / cards.length * 100;
            out.printf("%s -> %.2f%%%n",face, percentage);
        }
    }
}
