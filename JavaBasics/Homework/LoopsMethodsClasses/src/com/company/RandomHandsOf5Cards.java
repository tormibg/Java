package com.company;

import static java.lang.System.out;
import static java.lang.System.in;

import java.util.*;

public class RandomHandsOf5Cards {
    private static String[] cardsNum;
    private static String[] cardsFig;

    public static void main(String[] args) {
        cardsNum = new String[]{"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        cardsFig = new String[]{"♣", "♦", "♥", "♠"};

        String[] allCards = generateCards(cardsNum, cardsFig);
        //System.out.print(Arrays.toString(allCards));

        Scanner scanIn = new Scanner(in);
        int countInputs = Integer.parseInt(scanIn.nextLine());

        Random rand = new Random();
        for (int i = 0; i < countInputs; i++) {
            List<String> hand = new ArrayList<String>();

            for (int j = 0; j<5 ;) {
                String tmpCard = allCards[rand.nextInt(allCards.length)];
                if (!(hand.contains(tmpCard))){
                    hand.add(tmpCard);
                    j++;
                }
            }
            out.println(String.join(" ",hand));
        }
    }

    private static String[] generateCards(String[] cardsNum, String[] cardsFig) {
        String[] cards = new String[52];
        int index = 0;
        for (String str1 : cardsNum) {
            for (String str2 : cardsFig) {
                cards[index] = "" + str1 + str2;
                index++;
            }
        }
        return cards;
    }
}
