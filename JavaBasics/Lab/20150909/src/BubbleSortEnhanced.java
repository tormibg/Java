
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.out;
import static java.lang.System.in;

public class BubbleSortEnhanced {
    public static void main(String[] args) {
        Scanner scan = new Scanner(in);
        String[] arrStr = ( scan.nextLine().replace("[", "").replace("]", "").split(", "));

        //String[] arrStr = Arrays.asList(inputStr.split(",\\s+")).stream().toArray(String[]::new);

        Integer[] arrInt = new Integer[arrStr.length];
        for (int j = 0; j < arrStr.length; j++){
            arrInt[j] = Integer.parseInt(arrStr[j]);
        }

        int indexOfLastUnsortedElement = arrInt.length;
        int tmpIndex = indexOfLastUnsortedElement;
        boolean swapped = false;
        do {
            swapped = false;
            for (int i = 0; i < indexOfLastUnsortedElement-1; i++){
                if (arrInt[i] > arrInt[i+1]){
                    Integer tmpNum = arrInt[i];
                    arrInt[i] = arrInt[i+1];
                    arrInt[i+1] = tmpNum;
                    swapped = true;
                    tmpIndex = i;
                }
            }
            indexOfLastUnsortedElement = tmpIndex+1;
        }while (swapped);


    }
}
