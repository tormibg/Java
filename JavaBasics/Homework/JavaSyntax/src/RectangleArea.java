import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner inputStr = new Scanner(System.in);
        int firstInt = getInt(inputStr);
        int secondInt = getInt(inputStr);
        inputStr.close();

        int recArea = getRectangleArea(firstInt, secondInt);

        printToConsole(recArea);
    }

    private static void printToConsole(int recArea) {
        System.out.format("The rectangle area is : %d",recArea);
    }

    private static int getRectangleArea(int firstInt, int secondInt) {
        return firstInt * secondInt;
    }

    public static int getInt(Scanner inputStr){
        return Integer.parseInt(inputStr.nextLine());
    }
}
