package _2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class MagicCards {
    public static void main(String[] args) {
        Scanner sn = new Scanner(in);

        String[] inputCards = sn.nextLine().split("\\s+");

        String oddOrEven = sn.nextLine();
        String magicCard = sn.nextLine();

        String magicCardValue = magicCard.replaceAll("[SHDC]", "");
        char magicCardSuit = magicCard.replaceAll("[0-9JQKA]+", "").charAt(0);

        Map<Character, Integer> specialValues = new HashMap<>();
        specialValues.put('J', 120);
        specialValues.put('Q', 130);
        specialValues.put('K', 140);
        specialValues.put('A', 150);

        int magicSum = 0;

        int i;
        if (oddOrEven.equals("odd")){
            i = 1;
        }else{
            i = 0;
        }

        for (; i < inputCards.length; i += 2) {
            String card = inputCards[i];
            int cardValue;

            if (isSpecial(card)) {
                cardValue = specialValues.get(card.charAt(0));
            } else {
                cardValue = Integer.parseInt(card.replaceAll("[SHDC]", "")) * 10;
            }

            if (card.contains(magicCardValue)) {
                cardValue *= 3;
            } else if (card.indexOf(magicCardSuit) >= 0) {
                cardValue *= 2;
            }

            magicSum += cardValue;
        }
        out.println(magicSum);
    }

    private static boolean isSpecial(String card) {
        return !(card.charAt(0) >= '1' && card.charAt(0) <= '9');
    }
}
