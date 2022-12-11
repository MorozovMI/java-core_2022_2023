package lr3;

import java.util.Scanner;

public class Example3_while {

    public static void main(String[] args) {
        System.out.println("Введите количество чисел Фибонначи:");
        Scanner in = new Scanner(System.in);
        long num = in.nextInt();
        long firstNum = 0;
        long secondNum = 1;
        long summofNums = 1;

        while (num > 0) {

            System.out.print(summofNums + ", ");
            summofNums = firstNum + secondNum;

            firstNum = secondNum;

            secondNum = summofNums;

            num --;

        }

    }
}
