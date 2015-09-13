import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeMap;

import static java.lang.System.in;
import static java.lang.System.out;

public class MostFrequentWord {
    public static void main(String[] args) {
        Scanner scanIn = new Scanner(in);
        String[] arrStr = Arrays.asList(scanIn.nextLine().split("\\P{Alpha}+")).stream().toArray(String[]::new);
        TreeMap<String,Integer> frequencies = new TreeMap<>();

        int occur = 0;

        for (int i = 0; i < arrStr.length; i++){
            String tmpWord = arrStr[i].toLowerCase();

            int countFreq = 0;
            for (String s : arrStr) {
                if (tmpWord.equals(s.toLowerCase())){
                    countFreq++;
                }
            }
            if (occur < countFreq){
                occur = countFreq;
            }
            frequencies.put(tmpWord,countFreq);
        }
        for (String s : frequencies.keySet()) {
            if (frequencies.get(s) == occur){
                out.println(s+" -> "+occur+" times");
            }
        }
    }
}
