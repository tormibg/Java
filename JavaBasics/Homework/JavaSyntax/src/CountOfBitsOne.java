import java.util.Scanner;

public class CountOfBitsOne {
    public static void main(String[] args) {
        System.out.println("Infinite loop.");
        while (true) {
            Scanner inputStr = new Scanner(System.in);

            int decNum = inputStr.nextInt();
            String binNum = Integer.toBinaryString(decNum);
         //   System.out.println(binNum);
            int bitCounter = 0;
            for (int i = 0; i < binNum.length(); i++) {
                if (binNum.charAt(i) == '1') {
                    bitCounter++;
                }
            }
            System.out.println(bitCounter);
        }
    }
}
