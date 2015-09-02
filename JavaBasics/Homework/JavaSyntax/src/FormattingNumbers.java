import java.util.Scanner;

public class FormattingNumbers {
    public static void main(String[] args) {
        System.out.println("Infinite loop.");
        while (true) {
            Scanner inputStr = new Scanner(System.in);

            int firstNum = inputStr.nextInt();
            String hexNum = Integer.toHexString(firstNum).toUpperCase();
            String binNum = Integer.toString(firstNum, 8);

            double secNum = inputStr.nextDouble();
            double thirdNum = inputStr.nextDouble();

            String result = String.format(
                            "|"+padRight(hexNum,10)+"|"+
                            String.format(padLeft(binNum,10)).replace(' ','0')+"|"+
                            padLeft(String.format("%.2f",secNum),10)+"|"+
                            padRight(String.format("%.3f",thirdNum),10)+"|");

            System.out.println(result);
        }
    }

    private static String padLeft(String s, int i) {
        return String.format("%1$" + i + "s", s);
    }

    private static String padRight(String s, int i) {
        return String.format("%1$-" + i + "s", s);
    }
}
