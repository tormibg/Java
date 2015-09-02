import java.util.Scanner;

public class DecimalToHex {
    public static void main(String[] args) {
        System.out.println("Infinite loop.");
        while (true) {
            Scanner inputStr = new Scanner(System.in);
            int decNum = inputStr.nextInt();
         //   inputStr.close();
            String hexNum = decToHex(decNum);
            String hexNumFunc = Integer.toHexString(decNum);
            System.out.println(String.format("Hex from decToHex : %s", hexNum));
            System.out.println(String.format("Hex from Integer.toHexString : %s", hexNumFunc.toUpperCase()));
        }
    }

    private static String decToHex(int decNum) {
        char[] hexDigits = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};

        String hex = "";
        while (decNum != 0){
            int rem = decNum % 16;
            hex = hexDigits[rem] + hex;
            decNum = decNum / 16;
        }
        return hex;
    }
}
