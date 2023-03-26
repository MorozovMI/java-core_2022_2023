package lr11.Example3;

import java.util.Scanner;

public class Example {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        RecurseMethod a = new RecurseMethod(size);
    }
}
