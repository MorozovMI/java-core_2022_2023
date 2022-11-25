package lr1;

import java.util.Scanner;
public class Example15 {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        System.out.println("Input the first number: ");
        Integer number1 = in.nextInt();

        System.out.println("Input the second number: ");
        Integer number2 = in.nextInt();

        Integer sumOfNumbers = number1 + number2;
        Integer differenceOfNumbers = number1 - number2;


        System.out.println("Sum of numbers: " + sumOfNumbers);
        System.out.println("Difference of numbers: " + differenceOfNumbers);
    }
}