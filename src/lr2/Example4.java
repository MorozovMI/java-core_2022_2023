package lr2;

import java.util.Scanner;

public class Example4 {


    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        System.out.println("Введите число от 5 до 10 включительно: ");
        float number = in.nextFloat();

        if (number >=5 & number <=10)
            {
                System.out.println("Число удовлетворяет заданному условию");

            }
        else

            {
                System.out.println("Число не удовлетворяет заданному условию");
            }
    }


}
