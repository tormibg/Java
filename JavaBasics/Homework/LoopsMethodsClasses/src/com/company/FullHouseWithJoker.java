package com.company;

import java.util.*;

public class FullHouseWithJoker {
    private static String[] cardsNum;
    private static String[] cardsFig;

    public static void main(String[] args) {
        cardsNum = new String[]{"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        cardsFig = new String[]{"♣", "♦", "♥", "♠"};

        int countFullHouse = 0;
        int combWithJokers = (int) Math.pow(2, 5) - 1;

        Set<String> allFullHouse = new LinkedHashSet<String>();

        String[] cardsHand = new String[5];

        for (int card1 = 0; card1 < cardsNum.length; card1++) {
            String firstCard = cardsNum[card1];
            for (int fig1 = 0; fig1 < cardsFig.length; fig1++) {
                for (int fig2 = fig1 + 1; fig2 < cardsFig.length; fig2++) {
                    for (int fig3 = fig2 + 1; fig3 < cardsFig.length; fig3++) {
                        for (int card2 = 0; card2 < cardsNum.length; card2++) {
                            String secondCard = cardsNum[card2];
                            if (firstCard.compareTo(secondCard) != 0) {
                                for (int fig4 = 0; fig4 < cardsFig.length; fig4++) {
                                    for (int fig5 = fig4 + 1; fig5 < cardsFig.length; fig5++) {
                                        for (int comb = 0; comb <= combWithJokers; comb++) {
                                            int num = comb;
                                            cardsHand[0] = firstCard + cardsFig[fig1];
                                            cardsHand[1] = firstCard + cardsFig[fig2];
                                            cardsHand[2] = firstCard + cardsFig[fig3];
                                            cardsHand[3] = secondCard + cardsFig[fig4];
                                            cardsHand[4] = secondCard + cardsFig[fig5];
                                            for (int joker = 0; joker < 5; joker++) {
                                                if (num % 2 == 1) {
                                                    cardsHand[joker] = "*";
                                                    num /= 2;
                                                }
                                            }
                                            allFullHouse.add("(" + cardsHand[0] + cardsHand[1] + cardsHand[2] + cardsHand[3] + cardsHand[4] + ")");
                                            cardsHand[0] = firstCard + cardsFig[fig1];
                                            cardsHand[1] = firstCard + cardsFig[fig2];
                                            cardsHand[2] = firstCard + cardsFig[fig3];
                                            cardsHand[3] = secondCard + cardsFig[fig4];
                                            cardsHand[4] = secondCard + cardsFig[fig5];
                                            countFullHouse++;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        //Set sortedCards = new TreeSet(allFullHouse);
        //Collections.sort(sortedCards);
        allFullHouse.forEach(System.out::print);
        System.out.println("\n" + countFullHouse + " full houses");

        // Test combinations
        /*
        int counter = 0;
        for (int i = 0; i < 2; i++) {
            for (int i1 = 0;i1< 2;i1++){
                for (int i2 = 0; i2 < 2; i2++) {
                    for (int i3 = 0; i3 < 2; i3++) {
                        for (int i4 = 0; i4 < 2; i4++) {
                            counter++;
                        }
                    }
                }
            }
        }
        System.out.println(counter);
        */
    }
}
