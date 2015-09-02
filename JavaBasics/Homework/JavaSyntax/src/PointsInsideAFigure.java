import java.util.Scanner;

public class PointsInsideAFigure {
    public static void main(String[] args) {
        System.out.println("Infinite loop.");
        while (true){
            double leftX = 12.5;
            double rightX = 22.5;
            double upY = 6;
            double middleX1 = 17.5;
            double middleX2 = 20;
            double downY1 = 8.5;
            double downY2 = 13.5;

            Scanner inputStr = new Scanner(System.in);

            double cordX = inputStr.nextDouble();
            double cordY = inputStr.nextDouble();
            inputStr.close();
            String result = "Ouside";

            if (cordX >= leftX && cordX <= rightX && cordY >= upY && cordY <= downY2) {
                if (!(cordX > middleX1 && cordX < middleX2 && cordY > downY1)) {
                    result = "Inside";
                }
            }
            System.out.println(result);
        }
    }
}
