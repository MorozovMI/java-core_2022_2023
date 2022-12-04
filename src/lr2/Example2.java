package lr2;

import java.util.Scanner;

public class Example2 {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        System.out.println("Введите целое число которое при делении на 5 в остатке получается 2, а при делении на 7 в остатке получается 1: ");
        int number = in.nextInt();

        int result = number % 5;
        int result1 = number % 7;

        if (result == 2 & result1 == 1)  {
            System.out.println("Введенное число удовлетворяет заданному условию");
        }
        else{
            System.out.println("Число не удовлетворяет заданным условиям");
        }
    }
}