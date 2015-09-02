import java.util.Scanner;

public class SumTwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstNum = input.nextInt();
        int secondNum = input.nextInt();

        System.out.printf("Result is : %d + %d = %d \n",firstNum,secondNum,firstNum+secondNum);
        input.close();
    }
}
