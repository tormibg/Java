import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class LongestIncreasingSequence {
    public static void main(String[] args) {
        Scanner scanIn = new Scanner(in);
        String inputStr = scanIn.nextLine();
        scanIn = new Scanner(inputStr);
        List<Integer> arrInt = new ArrayList<Integer>();
        while (scanIn.hasNextInt()) {
            arrInt.add(Integer.parseInt(scanIn.next()));
        }
        scanIn.close();

        int tmpCount = 0;
        int startPosition = 0;
        int maxStart = 0;
        int maxCount = 0;

        out.print(arrInt.get(0)+" ");
        for (int i = 1; i < arrInt.size(); i++) {
            if (arrInt.get(startPosition + tmpCount) < arrInt.get(i)) {
                out.print(arrInt.get(i)+" ");
                tmpCount++;
            } else {
                if (maxCount < tmpCount) {
                    maxStart = startPosition;
                    maxCount = tmpCount;
                }
                out.print("\n"+arrInt.get(i)+" ");
                startPosition = i;
                tmpCount = 0;
            }
        }

        if (maxCount < tmpCount) {
            maxStart = startPosition;
            maxCount = tmpCount;
        }

        out.print("\nLongest: ");
        for (int i = maxStart; i <= maxStart+maxCount; i++){
            out.print(arrInt.get(i)+" ");
        }
    }
}
