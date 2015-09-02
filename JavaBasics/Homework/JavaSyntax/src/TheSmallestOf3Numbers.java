import java.util.Scanner;

public class TheSmallestOf3Numbers {
    public static void main(String[] args) {
        System.out.println("Infinite loop.");
        while (true) {
            Scanner inputStr = new Scanner(System.in);

            double[] arrNum = new double[3];

            for (int i = 0; i < arrNum.length; i++) {
                arrNum[i] = inputStr.nextDouble();
            }
            // inputStr.close();

            double tmpNum = arrNum[0];

            for (int i = 1; i < 3; i++) {
                if (arrNum[i] < tmpNum){
                    tmpNum = arrNum[i];
                }
            }
            System.out.println(String.format("%s", tmpNum));
        }
    }
}
