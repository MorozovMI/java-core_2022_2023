package lr2;

import java.util.Scanner;
public class Example3 {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        System.out.println("Введите число которое делится на четыре и больше десяти: ");
        float number = in.nextFloat();

        float result = number % 4;

        if (result == 0 & number >10)  {
            System.out.println("Число делится на четыре и больше десяти");
        }
        else{
            System.out.println("Число не удовлетворяет заданным условиям");
        }
    }
}