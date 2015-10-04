package _4;

import java.util.*;

import static java.lang.System.in;
import static java.lang.System.out;

public class StraightFlush {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        String[] cards = sc.nextLine().split("[\\s,\\s]+");
        if (cards.length < 5) {
            out.println("No Straight Flushes");
            return;
        }
        Set<String> inputCards = new HashSet<>();
        inputCards.addAll(Arrays.asList(cards));
        boolean isNoFlush = true;
        for (String card : cards) {
            String cardSuit = card.substring(card.length() - 1);
            String cardFace = card.substring(0, card.length() - 1);
            //out.println(cardFace + " " + cardSuit);
            String nextCard = cardFace + cardSuit;
            List<String> cardList = new ArrayList<>();
            cardList.add(nextCard);
            for (int i = 0; i < 4; i++) {
                cardFace = getNexFace(cardFace);
                cardList.add(cardFace+cardSuit);
            }
            if (inputCards.containsAll(cardList)){
                out.println(cardList);
                isNoFlush = false;
            }
        }
        if (isNoFlush){
            out.println("No Straight Flushes");
        }
//        Set<String> cardsSet = new LinkedHashSet<>();
//        for (int first = 0; first < cards.length; first++) {
//            char suit = getSuit(cards[first]);
//            for (int second = 0; second < cards.length; second++) {
//                if (suit == getSuit(cards[second])) {
//                    for (int third = 0; third < cards.length; third++) {
//                        if (suit == getSuit(cards[third])) {
//                            for (int four = 0; four < cards.length; four++) {
//                                if (suit == getSuit(cards[four])) {
//                                    for (int five = 0; five < cards.length; five++) {
//                                        if (suit == getSuit(cards[five])) {
//                                            String firstCard = cards[first];
//                                            String secondCard = cards[second];
//                                            String thirdCard = cards[third];
//                                            String fourCard = cards[four];
//                                            String fiveCard = cards[five];
//                                            Map<Integer, String> cardMap = new TreeMap<>();
//                                            cardMap.put(getCardInt(firstCard), firstCard);
//                                            cardMap.put(getCardInt(secondCard), secondCard);
//                                            if (cardMap.size() >= 2) {
//                                                cardMap.put(getCardInt(thirdCard), thirdCard);
//                                                if (cardMap.size() >= 3) {
//                                                    cardMap.put(getCardInt(fourCard), fourCard);
//                                                    if (cardMap.size() >= 4) {
//                                                        cardMap.put(getCardInt(fiveCard), fiveCard);
//                                                        if (cardMap.size() >= 5) {
//                                                            int count = 0;
//                                                            boolean isFlush = true;
//                                                            int prevCard = 0;
//                                                            for (Integer integer : cardMap.keySet()) {
//                                                                if (count == 0) {
//                                                                    prevCard = integer;
//                                                                } else {
//                                                                    if (count < cardMap.size() && isFlush) {
//                                                                        if (!(integer - prevCard == 1 )) {
//                                                                            isFlush = false;
//                                                                        }
//                                                                    }
//                                                                    prevCard = integer;
//                                                                }
//                                                                count++;
//                                                            }
//                                                            if (isFlush){
//                                                                cardsSet.add(cardMap.values().toString());
//                                                            }
//                                                        }
//                                                    }
//                                                }
//                                            }
//                                        }
//                                    }
//                                }
//                            }
//                        }
//                    }
//                }
//            }
//
//        }
//        if (cardsSet.size() > 0) {
//            for (String s : cardsSet) {
//                out.println(s);
//            }
//        } else {
//            out.println("No Straight Flushes");
//        }
//    }
//
//    private static int getCardInt(String card) {
//        int result = 0;
//        char face = card.charAt(0);
//        switch (face) {
//            case 'J':
//                result = 11;
//                break;
//            case 'Q':
//                result = 12;
//                break;
//            case 'K':
//                result = 13;
//                break;
//            case 'A':
//                result = 14;
//                break;
//            default:
//                result = Integer.parseInt(card.substring(0, card.length() - 1));
//        }
//        return result;
//    }
//
//    private static char getSuit(String card) {
//        return card.charAt(card.length() - 1);
//    }
    }

    private static String getNexFace(String nextCard) {
        String[] faces = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
        for (int i = 1; i < faces.length; i++) {
            if (faces[i-1].equals(nextCard)){
                return faces[i];
            }
        }
        return null;
    }
}
