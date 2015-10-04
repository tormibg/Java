package _1;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class VideoDurations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        String inputStr = sc.nextLine();
        int hours = 0;
        int minutes = 0;
        while (!(inputStr.equals("End"))) {
            String[] strings = inputStr.split(":");
            hours += Integer.parseInt(strings[0]);
            minutes += Integer.parseInt(strings[1]);
            inputStr = sc.nextLine();
        }
        hours += minutes / 60;
        minutes = minutes % 60;
        //out.printf("%d:%s",hours,padLeft(Integer.toString(minutes),2).replace(' ','0'));
        out.printf("%d:%02d", hours, minutes);
    }

    private static String padLeft(String s, int i) {
        return String.format("%1$" + i + "s", s);
    }
}
