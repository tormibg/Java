package _3;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class SandGlass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        int n = Integer.parseInt(sc.nextLine());
        out.println(repeat("*",n));
        for (int i = 1; i <= n / 2; i++) {
            out.println(repeat(".",i)+repeat("*",n-(2*i))+repeat(".",i));
        }
        for (int i = n /2 ; i > 1 ; i--) {
            out.println(repeat(".",i-1)+repeat("*",n-(2*i)+2)+repeat(".",i-1));
        }
        out.println(repeat("*",n));
    }
    public static String repeat(String str, int times){
        return new String(new char[times]).replace("\0", str);
    }
}
