package Prob2;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class PossibleTriangles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        String input = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        while (!(input.equals("End"))){
            String[] inputs = input.split("\\s+");
            double a = Double.parseDouble(inputs[0]);
            double b = Double.parseDouble(inputs[1]);
            double c = Double.parseDouble(inputs[2]);
            if (a > b){
                if (a > c){ // b < c < a -> b + c > a
                    if (b + c > a){
                        sb.append(String.format("%.02f+%.02f>%.02f\n",b,c,a));
                    }
                }else{ //b < a < c -> b + a < c
                    if (a + b > c){
                        sb.append(String.format("%.02f+%.02f>%.02f\n",b,a,c));
                    }
                }
            }else{
                if (b > c){ // a < c < b -> a + c > b
                    if (a + c > b){
                        sb.append(String.format("%.02f+%.02f>%.02f\n", a, c, b));
                    }
                }else{ //a < b < c -> a + b > c
                    if (a + b > c){
                        sb.append(String.format("%.02f+%.02f>%.02f\n",a,b,c));
                    }
                }
            }
            input = sc.nextLine();
        }
        if (sb.length() > 0){
            out.println(sb.toString());
        }else {
            out.println("No");
        }
    }
}
