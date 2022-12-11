package lr3;

import java.util.Scanner;

public class Example4_while {
    public static void main(String[] args) {
        System.out.println("Введите два целых чилсла");
        Scanner in = new Scanner(System.in);
        int firstNumber = in.nextInt();
        int secondNumber = in.nextInt();



        if (firstNumber < secondNumber) {
            while (firstNumber <= secondNumber) {
                System.out.println(firstNumber + " ");
                firstNumber++;
            }
        }

            else
                while(secondNumber<=firstNumber)
        {
            System.out.println(secondNumber + " ");
            secondNumber ++;
        }

    }}