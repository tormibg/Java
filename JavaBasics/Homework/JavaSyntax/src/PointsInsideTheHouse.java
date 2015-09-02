
import java.awt.*;
import java.util.Scanner;

public class PointsInsideTheHouse {
    static final double AX = 12.5;
    public static final double AY = 8.5;
    public static final double BX = 22.5;
    public static final double BY = 8.5;
    public static final double CX = 17.5;
    public static final double CY = 3.5;
    public static final double MAX_Y = 13.5;
    public static final double X_2_REC = 20;

    public static void main(String[] args) {
        System.out.println("Infinite loop.");
        while (true){
            Scanner inputStr = new Scanner(System.in);
            double pX = inputStr.nextDouble();
            double pY = inputStr.nextDouble();

            boolean pointInsideRoof = isPointInsideRoof(pX, pY);
            boolean pointInFirstRec = isPointInFirstRec(pX, pY);
            boolean pointInSecondRec = isPointInSecondRec(pX, pY);
            String result = (pointInsideRoof || pointInFirstRec || pointInSecondRec) ? "Inside" : "Outside";

            System.out.println(result);
        }
    }

    private static boolean isPointInSecondRec(double pX, double pY) {
        boolean result = false;
        if (pX >= X_2_REC && pX <= BX && pY >= BY && pY <= MAX_Y) {
            result = true;
        }
        return result;
    }

    private static boolean isPointInFirstRec(double pX, double pY) {
        boolean result = false;
        if (pX >= AX && pX <= CX && pY >= AY && pY <= MAX_Y) {
            result = true;
        }
        return result;
    }

    private static boolean isPointInsideRoof(double pX, double pY) {
        boolean result = false;
        double firstLine = (BX-AX)*(pY-AY) - (BY-AY)*(pX-AX);
        double secondLine = (AX-CX)*(pY-CY) - (AY-CY)*(pX-CX);
        if (firstLine <= 0 && secondLine <= 0) {
            double thirdLine = (CX-BX)*(pY-BY) - (CY-BY)*(pX-BX);
            if (thirdLine <= 0) {
                result = true;
            }
        }
        return result;
    }
}
