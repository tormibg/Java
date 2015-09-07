package com.company;

public class FullHouse {
    private static String[] cardsNum;
    private static String[] cardsFig;

    public static void main(String[] args) {
        cardsNum = new String[]{"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        cardsFig = new String[]{"♣", "♦", "♥", "♠"};

       // String[] allCards = generateCards(cardsNum, cardsFig);
        //System.out.print(Arrays.toString(allCards));

        int countFullHouse = 0;

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
                                        countFullHouse++;
                                        System.out.printf("(" + firstCard + cardsFig[fig1] + " " + firstCard + cardsFig[fig2]
                                                + " " + firstCard + cardsFig[fig3] + " " + secondCard + cardsFig[fig4]
                                                + " " + secondCard + cardsFig[fig5] + ")");
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println("\n"+countFullHouse+" full houses");
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
