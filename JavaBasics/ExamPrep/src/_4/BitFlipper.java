package _4;

import java.math.BigInteger;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class BitFlipper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        BigInteger n = new BigInteger(sc.nextLine());
        String numAsBinary = n.toString(2);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 64 - numAsBinary.length(); i++) {
            sb.append('0');
        }
        sb.append(numAsBinary);
       // out.println(sb);
        for (int i = 0; i < sb.toString().length()-2; i++) {
            char currChar = sb.charAt(i);
            if (currChar == sb.charAt(i+1) && currChar == sb.charAt(i+2)){
                if (currChar == '1'){
                    sb.replace(i,i+3,"000");
                }else{
                    sb.replace(i,i+3,"111");
                }
                i +=2;
            }
        }
       // out.println(sb);
        BigInteger newNumber = new BigInteger(sb.toString(),2);
        out.println(newNumber);
    }
}
