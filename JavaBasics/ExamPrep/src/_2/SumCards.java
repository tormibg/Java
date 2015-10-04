package _2;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class SumCards {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        String[] cards = sc.nextLine().split("\\s+");
        int sumCards = 0;
        int tmpSumCards = 0;
        int fCard = getCardFace(cards[0]);
        sumCards = fCard;
        tmpSumCards = 0;
        boolean isSeq = false;
        for (int i = 1; i < cards.length; i++) {
            int nextCard = getCardFace(cards[i]);
            sumCards += nextCard;
            if (fCard == nextCard) {
                if (i == 1) {
                    tmpSumCards = nextCard;
                }
                if (!(isSeq)) {
                    tmpSumCards = fCard;
                }
                tmpSumCards += nextCard;
                isSeq = true;
            } else {
                sumCards += tmpSumCards;
                tmpSumCards = 0;
                isSeq = false;
            }
            fCard = nextCard;
        }
        out.println(sumCards + tmpSumCards);
    }

    private static int getCardFace(String card) {
        int result = 0;
        if (card.length() >= 3) {
            result = 10;
        } else {
            char tmp = card.substring(0, card.length() - 1).charAt(0);
            switch (tmp) {
                case 'J':
                    result = 12;
                    break;
                case 'Q':
                    result = 13;
                    break;
                case 'K':
                    result = 14;
                    break;
                case 'A':
                    result = 15;
                    break;
                default:
                    result = Character.getNumericValue(tmp);
            }
        }
        return result;
    }
}
