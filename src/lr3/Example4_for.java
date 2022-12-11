package lr3;
import java.util.Scanner;
public class Example4_for {
    public static void main(String[] args) {
        System.out.println("Введите два целых чилсла");
        Scanner in = new Scanner(System.in);
        int firstNumber = in.nextInt();
        int secondNumber = in.nextInt();


        if (firstNumber < secondNumber)
            for (int i = firstNumber; i <= secondNumber; i++)
            {
                System.out.println(i + " ");



            }

        else {
            for (int b = secondNumber; b<=firstNumber; b++)

                System.out.println(b + " ");



        }


    }}