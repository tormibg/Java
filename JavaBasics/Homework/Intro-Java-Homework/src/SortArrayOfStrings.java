import java.util.Scanner;

public class SortArrayOfStrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int inputNumber = Integer.parseInt(input.nextLine());
        String[] arrStr = new String[inputNumber];
        for (int i = 0; i < inputNumber; i++) {
            arrStr[i] = input.nextLine();
        }
        for (int i = 0; i < arrStr.length; i++) {
            for (int j = i + 1; j < arrStr.length; j++) {
                if (arrStr[j].trim().compareToIgnoreCase(arrStr[i].trim()) < 0) {
                    String tmpStr = arrStr[i];
                    arrStr[i] = arrStr[j];
                    arrStr[j] = tmpStr;
                }
            }
        }
        for (String ss:arrStr) {
            System.out.println(ss);
        }
        input.close();
    }
}
