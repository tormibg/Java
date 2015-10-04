package _3;

import java.util.*;

import static java.lang.System.in;
import static java.lang.System.out;

public class Largest3Rectangles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        String[] strNumbers = sc.nextLine().split("[\\[\\]x\\s]+");
        ArrayList<Integer> intNumbers = new ArrayList<>();
        for (String strNumber : strNumbers) {
            if (!(strNumber.equals(""))){
                intNumbers.add(Integer.parseInt(strNumber));
            }
        }
        int[] areas = new int[intNumbers.size()/2];
        for (int i = 0; i < intNumbers.size()-1; i +=2) {
            areas[i/2] = intNumbers.get(i) * intNumbers.get(i+1);
        }
        int maxArea = 0;
        for (int i = 0; i < areas.length-2; i++) {
            if (areas[i]+areas[i+1]+areas[i+2] > maxArea){
                maxArea = areas[i]+areas[i+1]+areas[i+2];
            }
        }
        out.println(maxArea);
    }
}
