package _1;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class CartesianCoordinateSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(in);
        double x = Double.parseDouble(sc.nextLine());
        double y = Double.parseDouble(sc.nextLine());

        if (x == 0 && y == 0) {
            out.println(0);
        } else if (x == 0) {
            out.println(5);
        } else if (y == 0) {
            out.println(6);
        } else if (x > 0) {
            if (y > 0) {
                out.print(1);
            } else {
                out.println(4);
            }
        } else {
            if (y > 0) {
                out.println(2);
            } else {
                out.println(3);
            }
        }
    }
}
