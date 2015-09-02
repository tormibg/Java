import java.util.Scanner;

public class CountOfEqualBitPairs {
    public static void main(String[] args) {
        System.out.println("Infinite loop.");
        while (true) {
            Scanner inputStr = new Scanner(System.in);

            int decNum = inputStr.nextInt();
            String binNum = Integer.toBinaryString(decNum);
         //   System.out.println(binNum);
            int bitCounter = 0;
            char bitChar = binNum.charAt(0);
            for (int i = 1; i < binNum.length(); i++) {
                if (binNum.charAt(i) == bitChar) {
                    bitCounter++;
                }
                bitChar = binNum.charAt(i);
            }
            System.out.println(bitCounter);
        }
    }
}
