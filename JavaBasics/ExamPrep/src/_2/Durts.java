package _2;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class Durts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        //   String tmp = sc.nextLine();
        //   out.println(tmp);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int r = sc.nextInt();
        int n = sc.nextInt();
        int[][] cords = new int[n][2];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                cords[i][j] = sc.nextInt();
            }
        }
        double verticalMaxX = x + (r * 0.5);
        int verticalMaxY = y + r;
        double verticalMinX = x - (r * 0.5);
        int verticalMinY = y - r;
        int hotrizMaxX = x + r;
        double horizMaxY = y + (r * 0.5);
        int horizMinX = x - r;
        double horizMinY = y - (r * 0.5);

        for (int i = 0; i < n; i++) {
            int x1 = cords[i][0];
            int y1 = cords[i][1];
            if (x1 >= verticalMinX && y1 >= verticalMinY && x1 <= verticalMaxX && y1 <= verticalMaxY ||
                    x1 >= horizMinX && y1 >= horizMinY && x1 <= hotrizMaxX && y1 <= horizMaxY) {
                out.println("yes");
            } else {
                out.println("no");
            }

            //out.println(isInDurts(cords[i][0], cords[i][1], x, y, r) ? "yes" : "no");
        }
        //out.println(Arrays.toString(cords[0]));
    }

    private static boolean isInDurts(int x1, int y1, int xc, int yc, int r) {
        //square-root((x1-xc)^2 + (y1-yc)^2))
        double dx = xc - x1;
        double dy = yc - y1;
        dx *= dx;
        dy *= dy;
        double D = dx + dy;
        double R = r * r;
        return D <= R;
    }
}
