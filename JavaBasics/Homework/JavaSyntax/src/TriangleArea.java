import java.awt.*;
import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner inputStr = new Scanner(System.in);

        printToConsole("Enter three points for a triangle (x and y intercept): \n");

        Point a = new Point();
        Point b = new Point();
        Point c = new Point();

        a.x = inputStr.nextInt();
        a.y = inputStr.nextInt();
        b.x = inputStr.nextInt();
        b.y = inputStr.nextInt();
        c.x = inputStr.nextInt();
        c.y = inputStr.nextInt();


        inputStr.close();

        double ab = distance(a, b);
        double bc = distance(b, c);
        double ca = distance(c, a);

        if ((ab + bc) == ca || (bc + ca) == ab || (ca + ab) == bc) {
            printToConsole("0");
            return;
        }

        double s = (ab + bc + ca) / 2;
        double result = Math.sqrt(s * (s - ab) * (s - bc) * (s - ca));
        printToConsole(String.format("%.0f",result));
    }

    private static double distance(Point a, Point b) {
        double dx = a.x - b.x;
        double dy = a.y - b.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    private static void printToConsole(String iStr) {

        System.out.print(iStr);
    }

    private static int getRectangleArea(int firstInt, int secondInt) {

        return firstInt * secondInt;
    }
}
